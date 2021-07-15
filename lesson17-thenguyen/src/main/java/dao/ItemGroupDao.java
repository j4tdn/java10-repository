package dao;

import static utils.SqlUtils.close;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connection.DbConnection;
import persistence.ItemGroup;

public class ItemGroupDao {
	private Connection connection;
	private Statement st = null;
	private PreparedStatement pst = null;
	private ResultSet rs = null;

	public ItemGroupDao() {
		connection = DbConnection.getConnection();
	}

	public List<ItemGroup> getAll() {
		List<ItemGroup> result = new ArrayList<>();
		String sql = "select * from loaihang";
		try {
			st = connection.createStatement();
			rs = st.executeQuery(sql); 
			while (rs.next()) {
				ItemGroup ig = new ItemGroup(rs.getInt("maloai"), rs.getString("tenloai"));
				result.add(ig);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs, st);
		}
		return result;
	}

	public List<ItemGroup> getItemGroups(int id) {
		List<ItemGroup> result = new ArrayList<>();
		String sql = "select * from loaihang where maloai = " + id;
		try {
			st = connection.createStatement();
			rs = st.executeQuery(sql); // no se duyet tung dong cho minh, phai dung 1 co che giong iterator
			while (rs.next()) {
				ItemGroup ig = new ItemGroup(rs.getInt("maloai"), rs.getString("tenloai"));
				result.add(ig);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(rs, st);
		}
		return result;
	}

	public List<ItemGroup> getItemGroups(String name) {
		List<ItemGroup> result = new ArrayList<>();
		String sql = "select * from loaihang where tenloai = ?";
		try {
			pst = connection.prepareStatement(sql);
			pst.setString(1, name);
			rs = pst.executeQuery(); // no se duyet tung dong cho minh, phai dung 1 co che giong iterator
			while (rs.next()) {
				ItemGroup ig = new ItemGroup(rs.getInt("maloai"), rs.getString("tenloai"));
				result.add(ig);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(rs, pst);
		}
		return result;
	}

	public boolean save(ItemGroup itemGroup) {
		boolean isSave = false;
		// prepared SQL with ? parameter
		String sql = "insert into loaihang values (?,?)";
		try {
			pst = connection.prepareStatement(sql);
			pst.setInt(1, itemGroup.getId());
			pst.setString(2, itemGroup.getName());
			isSave = pst.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs, pst);
		}
		return isSave;
	}

	public boolean save() {
		boolean isSave = false;
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
				isSave = pst.executeUpdate() > 0;
			}
		} catch (NumberFormatException | IOException | SQLException e2) {
			e2.printStackTrace();
		} finally {
			close(pst);
		}
		return isSave;
	}
}
