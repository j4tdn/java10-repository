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
import persistence.ItemGroupRawData;
import persistence.ItemGroupDto;
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
		String sql = "SELECT MaLoai,\n"
				   + "       TenLoai\n"
				   + "FROM LoaiHang";
		try {
			// ResultSet = List<T> >> T: columns label, index
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			
			// iterator
			while(rs.next()) {
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
		String sql = "SELECT * \n"
				   + "FROM LoaiHang\n"
				   + "WHERE MaLoai = " + id;
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			
			if(rs.next()) {
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
		String sql = "SELECT * \n"
				   + "FROM LoaiHang\n"
				   + "WHERE TenLoai = ?";
		// name = Join, Cake >> SQL Injection
		// TenLoai = '                             ' 
		
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, name);
			rs = pst.executeQuery();
			while(rs.next()) {
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
	
	public List<ItemGroupRawData> getItemGroups() {
		List<ItemGroupRawData> result = new ArrayList<>();
		String sql = 
				  "WITH TMP_CTE AS (\n"  
				+ "	SELECT mh.TenMH,\n"
				+ "           SUM(kcmh.SoLuong) SoLuong,\n"
				+ "		   mh.MaLoai\n"
				+ "    FROM MatHang mh\n"
				+ "    JOIN KichCoMatHang kcmh\n"
				+ "      ON mh.MaMH = kcmh.MaMH\n"
				+ "	GROUP BY mh.MaMH\n"
				+ ")\n"
				+ "SELECT lh.MaLoai,\n" 
				+ "       lh.TenLoai,\n"
				+ "       GROUP_CONCAT(CONCAT(mh.TenMH, '-' ,mh.SoLuong) SEPARATOR ',') DanhSachMatHang,\n"
				+ "       SUM(mh.SoLuong) TongSoLuong\n"
				+ "FROM LoaiHang lh\n"
				+ "JOIN TMP_CTE mh\n" 
				+ "  ON lh.MaLoai = mh.MaLoai\n"
				+ "GROUP BY lh.MaLoai";
		
		try {
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			while(rs.next()) {
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
		
		// prepared SQL with ? parameters
		String sql = "INSERT INTO LoaiHang(MaLoai, TenLoai)\n"
				   + "VALUES(?, ?)";
		
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
	
	public boolean addBatch(List<ItemGroup> itemGroups) {
		boolean isSaved = false;
		String sql = "INSERT INTO LoaiHang(MaLoai, TenLoai)\n"
				   + "VALUES(?, ?)";
		try {
			pst = conn.prepareStatement(sql);
			
			for (ItemGroup itemGroup: itemGroups) {
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
