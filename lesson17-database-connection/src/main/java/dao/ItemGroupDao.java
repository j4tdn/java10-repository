package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import connection.DbConnection;
import persistence.ItemGroup;
import persistence.ItemGroupDto;
import persistence.ItemGroupRawData;
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
		List<ItemGroup> result = new ArrayList<ItemGroup>();
		String sql = "SELECT * FROM LoaiHang";
//		conn = DbConnection.getConnection();
		try {
			st = conn.createStatement();
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

	public ItemGroup getItemGroups(int id) {
		ItemGroup result = null;
		String sql = "SELECT * FROM LoaiHang Where MaLoai = " + id;
//		conn = DbConnection.getConnection();

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
		List<ItemGroup> result = new ArrayList<ItemGroup>();
		String sql = "SELECT * FROM LoaiHang Where TenLoai = ?";
//		conn = DbConnection.getConnection();

		try {
//			st = conn.createStatement();
//			rs = st.executeQuery(sql);
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
	
	public List<ItemGroupRawData> getItemGroups(){
		List<ItemGroupRawData> result = new ArrayList<>();
		String sql = 
				"WITH TMP_CTE AS (\r\n"
				+ "	SELECT	mh.TenMH,\r\n"
				+ "            SUM(kcmh.SoLuong) as SoLuong,\r\n"
				+ "            mh.MaLoai\r\n"
				+ "    FROM MatHang mh\r\n"
				+ "    JOIN KichCoMatHang kcmh\r\n"
				+ "		ON mh.MaMH = kcmh.MaMH\r\n"
				+ "	GROUP BY mh.MaMH\r\n"
				+ ")\r\n"
				+ "SELECT lh.MaLoai,\r\n"
				+ "		lh.TenLoai,\r\n"
				+ "        GROUP_CONCAT(CONCAT(mh.TenMH, '-' , mh.SoLuong) SEPARATOR ',') as DanhSachMatHang,\r\n"
				+ "        SUM(mh.SoLuong) TongSoLuong\r\n"
				+ "FROM LoaiHang lh\r\n"
				+ "JOIN TMP_CTE mh\r\n"
				+ "	ON lh.MaLoai = mh.MaLoai\r\n"
				+ "GROUP BY mh.MaLoai;";
//		conn = DbConnection.getConnection();

		try {
//			st = conn.createStatement();
//			rs = st.executeQuery(sql);
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				ItemGroupRawData data = new ItemGroupRawData();
				data.setIgrId(rs.getInt("MaLoai"));
				data.setIgrName(rs.getString("TenLoai"));
				data.setItems(rs.getString("DanhSachMatHang"));
				data.setTotalOfItems(rs.getInt("TongSoLuong"));
				result.add(data);
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
		

		String sql = "INSERT INTO LoaiHang(MaLoai, TenLoai)\n" + "VALUES(?, ?)";
		try {
//			st = conn.createStatement();
//			isSaved = st.executeUpdate(sql) > 0;
			
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
	
	public boolean addBatch(List<ItemGroup> itemGroups) {
		boolean isSaved = false;
		String sql = "INSERT INTO LoaiHang(MaLoai, TenLoai)\n" + "VALUES(?, ?)";
		try {
//			st = conn.createStatement();
//			isSaved = st.executeUpdate(sql) > 0;
			
			pst = conn.prepareStatement(sql);
			
			for(ItemGroup itemGroup: itemGroups) {
				pst.setInt(1, itemGroup.getId());
				pst.setString(2, itemGroup.getName());
				pst.addBatch();
				
			}
			isSaved = Arrays.stream(pst.executeBatch()).sum() > 0;
				
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, pst);
		}
		return isSaved;
	}

}
