package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
		String sql = "SELECT MaLoai, " + "TenLoai FROM LoaiHang";
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			// ResultSet = List<T> >> T: columns label, index

			// iterator
			while (rs.next()) {
				ItemGroup ig = new ItemGroup(rs.getInt("MaLoai"), rs.getString("TenLoai"));
				result.add(ig);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		return result;
	}

	public ItemGroup getItemGroups(int id) {
		ItemGroup result = null;
		String sql = "SELECT MaLoai, " + "TenLoai FROM LoaiHang WHERE MaLoai = " + id;
		conn = DbConnection.getConnection();
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			// ResultSet = List<T> >> T: columns label, index

			// iterator
			if (rs.next()) {
				result = new ItemGroup(rs.getInt("MaLoai"), rs.getString("TenLoai"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		return result;
	}

	public List<ItemGroup> getItemGroups(String name) {
		List<ItemGroup> result = new ArrayList<>();
		String sql = "SELECT MaLoai, TenLoai FROM LoaiHang WHERE TenLoai = ?";
		try {
			pst = conn.prepareStatement(sql);

			pst.setString(1, name);

			rs = st.executeQuery(sql);
			// ResultSet = List<T> >> T: columns label, index

			// iterator
			while (rs.next()) {
				ItemGroup ig = new ItemGroup(rs.getInt("MaLoai"), rs.getString("TenLoai"));
				result.add(ig);
			}
		} catch (Exception e) {
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

			isSaved = st.executeUpdate(sql) > 0;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, pst);
		}
		return isSaved;
	}
}
