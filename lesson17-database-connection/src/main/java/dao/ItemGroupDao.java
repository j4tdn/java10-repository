package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import connection.DatabaseConnection;
import persistence.ItemGroup;
import persistence.ItemGroupRawData;
import utils.SqlUtils;

public class ItemGroupDao {
	private Connection conn;
	private Statement st;
	private PreparedStatement pst;
	private ResultSet rs;
	
	public ItemGroupDao() {
		conn = DatabaseConnection.getConnection();
	}

	public List<ItemGroup> getAll() {
		List<ItemGroup> list = new ArrayList<>();
		String sql = "SELECT * FROM loaihang";
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				ItemGroup itemGroup = new ItemGroup(rs.getInt(1), rs.getString(2));
				list.add(itemGroup);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		return list;
	}
	
	public ItemGroup getById(Integer categoryId) {
		ItemGroup itemGroup = null;
		String sql = "SELECT * \r\n"
						+ "FROM loaihang\r\n"
						+ "WHERE MaLoai = ?;";
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, categoryId);
			rs = pst.executeQuery();
			if (rs.next()) {
				itemGroup = new ItemGroup(rs.getInt(1), rs.getString(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		return itemGroup;
	}
	
	public ItemGroup getByName(String categoryName) {
		ItemGroup itemGroup = null;
		String sql = "SELECT * \r\n"
				+ "FROM loaihang\r\n"
				+ "WHERE TenLoai = ?;";
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, categoryName);
			rs = pst.executeQuery();
			if (rs.next()) {
				itemGroup = new ItemGroup(rs.getInt(1), rs.getString(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		return itemGroup;
	}
	
	public List<ItemGroupRawData> getItemGroups() {
		List<ItemGroupRawData> list = new ArrayList<>();
		String sql = "WITH TMP_CTE AS (\r\n"
				+ "	SELECT mh.TenMH TenMH,\r\n"
				+ "			SUM(kcmh.SoLuong) SoLuong,\r\n"
				+ "            mh.MaLoai\r\n"
				+ "	FROM mathang mh\r\n"
				+ "    JOIN kichcomathang kcmh\r\n"
				+ "		ON mh.MaMH = kcmh.MaMH\r\n"
				+ "	GROUP BY mh.MaMH\r\n"
				+ ")\r\n"
				+ "SELECT lh.MaLoai,\r\n"
				+ "		lh.TenLoai,\r\n"
				+ "     GROUP_CONCAT(CONCAT(mh.TenMH, '-', mh.SoLuong) SEPARATOR ', ') DanhSach,\r\n"
				+ "     SUM(mh.SoLuong) TongSoLuong\r\n"
				+ "FROM loaihang lh\r\n"
				+ "JOIN TMP_CTE mh\r\n"
				+ "	ON mh.MaLoai = lh.MaLoai\r\n"
				+ "GROUP BY lh.MaLoai;";
		try {
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				ItemGroupRawData data = new ItemGroupRawData(
											rs.getInt(1), rs.getString(2), 
											rs.getString(3), rs.getInt(4));
				list.add(data);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(pst);
		}
		return list;
	}
	
	public boolean save(ItemGroup itemGroup) {
		boolean isSaved = false;
		String sql = "INSERT INTO loaihang(MaLoai, TenLoai) \n"
					+ "VALUES (?, ?)";
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, itemGroup.getId());
			pst.setString(2, itemGroup.getName());
			isSaved = pst.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(pst);
		}
		return isSaved;
	}
	
	public boolean addBatch(List<ItemGroup> itemGroups) {
		boolean isSaved = false;
		String sql = "INSERT INTO loaihang(MaLoai, TenLoai) \n"
					+ "VALUES (?, ?)";
		try {
			pst = conn.prepareStatement(sql);
			
			for (ItemGroup itemGroup : itemGroups) {
				pst.setInt(1, itemGroup.getId());
				pst.setString(2, itemGroup.getName());
				pst.addBatch();
			}
			isSaved =  Arrays.stream(pst.executeBatch()).sum() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(pst);
		}
		return isSaved;
	}
}
