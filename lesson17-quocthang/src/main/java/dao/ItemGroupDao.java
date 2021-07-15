package dao;

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
import utils.SqlUtils;

public class ItemGroupDao {

	private Connection conn;
	private Statement st;
	private PreparedStatement pst;
	private ResultSet rs;

	public ItemGroupDao() {
		conn = DbConnection.getConnection();
	}

	public List<ItemGroup> getAll() {
		List<ItemGroup> result = new ArrayList<>();
		String sql = "SELECT MaLoai,\n" + "		 TenLoai\n" + "FROM LoaiHang";
		conn = DbConnection.getConnection();
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			// ResultSet = List<T> >> T: columns label, index (alias)

			// iterator
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

	public ItemGroup getItemGroups(int id) {
		ItemGroup result = null;
		String sql = "SELECT * \n" + "FROM LoaiHang\n" + "WHERE MaLoai = " + id;
		conn = DbConnection.getConnection();
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);

			if (rs.next()) {
				result = new ItemGroup(rs.getInt("MaLoai"), rs.getString("TenLoai"));
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
		String sql = "SELECT * \n" + "FROM LoaiHang\n" + "WHERE TenLoai = ?";
		System.out.println("SQL: " + sql);

		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, name);
			rs = pst.executeQuery();

			while (rs.next()) {
				ItemGroup ig = new ItemGroup(rs.getInt("MaLoai"), rs.getString("TenLoai"));
				result.add(ig);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, pst);
		}
		return result;
	}

	public boolean save(ItemGroup itemGroup) {
		boolean isSaved = false;

		// prepared SQL with ? parameters
		String sql = "INSERT INTO LoaiHang(MaLoai, TenLoai)\n" + "VALUES(?, ?)";

		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, itemGroup.getId());
			pst.setString(2, itemGroup.getName());

			isSaved = pst.executeUpdate() > 0;

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, pst);
		}
		return isSaved;
	}
	
	// 6
	public boolean update(int idOD) {
		boolean isUp = false;
		
		String sql = "update DonHang set tongtien = 999 "
				+ "where maDH = ? ";
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, idOD);
						
			isUp = pst.executeUpdate() > 0;
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs,pst);
		}
		return isUp;
	}
	
	// 10
	public List<ItemGroup> getItemsByIdProcedure(int itemGroupId) {
		List<ItemGroup> listItems = new ArrayList<>();	
		String sql = "CALL showItemsByGroupId(" + itemGroupId + ")";

		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				ItemGroup item = new ItemGroup(rs.getInt("maMH"), rs.getString("tenMH"), rs.getInt("giaBan"));
				listItems.add(item);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		return listItems;
	}
	
	// 7
	public boolean saveFile() {
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
				pst = conn.prepareStatement(sql);
				pst.setInt(1, Integer.parseInt(dr.substring(0, dr.indexOf(","))));
				pst.setString(2, dr.substring(dr.indexOf(",") + 1, dr.length()));
				isSave = pst.executeUpdate() > 0;
			}
		} catch (NumberFormatException | IOException | SQLException e2) {
			e2.printStackTrace();
		} finally {
			SqlUtils.close(pst);
		}
		return isSave;
	}
	
	
}
