package dao;

import static utils.SqlUtils.close;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connection.DbConnection;
import persistence.ItemGroup;
import utils.SqlUtils;

public class ItemGroupDao {
	private Connection connection;
	private java.sql.Statement st = null;
	private java.sql.PreparedStatement pst = null;
	private ResultSet rs = null;

	public ItemGroupDao() {
		connection = DbConnection.getConnection();
	}

	public List<ItemGroup> getAll() {
		List<ItemGroup> result = new ArrayList<>();
		String sql = "SELECT * FROM LoaiHang";

		try {
			st = connection.createStatement();
			rs = st.executeQuery(sql);

			while (rs.next()) {
				ItemGroup ig = new ItemGroup(rs.getInt("MaLoai"), rs.getString("TenLoai"));
				result.add(ig);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		return result;
	}

	public List<ItemGroup> getItemGroups(int id) {
		List<ItemGroup> result = new ArrayList<>();
		String sql = "SELECT * FROM LoaiHang WHERE MaLoai = " + id;

		try {
			st = connection.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				ItemGroup ig = new ItemGroup(rs.getInt("MaLoai"), rs.getString("TenLoai"));
				result.add(ig);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		return result;

	}

	public List<ItemGroup> getItemGroups(String name) {
		List<ItemGroup> result = new ArrayList<>();
		String sql = "SELECT * FROM LoaiHang WHERE TenLoai = ?";

		try {
			pst = connection.prepareStatement(sql);
			pst.setString(1, name);
			rs = pst.executeQuery();
			while (rs.next()) {
				ItemGroup ig = new ItemGroup(rs.getInt("MaLoai"), rs.getString("TenLoai"));
				result.add(ig);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		return result;

	}

	public boolean save(ItemGroup itemGroup) {

		boolean isSaved = false;
		String sql = "INSERT INTO LoaiHang(Maloai, TenLoai)\n" + "VALUES(?,?)";

		try {
			pst = connection.prepareStatement(sql);
			pst.setInt(1, itemGroup.getId());
			pst.setString(2, itemGroup.getName());
			isSaved = pst.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(st);
		}
		return isSaved;
	}

	public boolean saveFile() {
		boolean isSaved = false;
		File f = new File("loaihang.txt");
		FileReader fr = null;
		BufferedReader br = null;
		String sql = "insert into loaihang values (?,?)";
		try {
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			String dr = "";

			while ((dr = br.readLine()) != null) {
				pst = connection.prepareStatement(sql);
				pst.setInt(1, Integer.parseInt(dr.substring(0, dr.indexOf(","))));
				pst.setString(2, dr.substring(dr.indexOf(",") + 1, dr.length()));
				isSaved = pst.executeUpdate() > 0;
			}
		} catch (NumberFormatException | IOException | SQLException e2) {
			e2.printStackTrace();
		} finally {
			close(pst);
		}
		return isSaved;
	}

}
