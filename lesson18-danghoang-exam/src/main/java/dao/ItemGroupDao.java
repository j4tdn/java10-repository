package dao;

import static utils.SqlUtils.close;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import connection.DbConnection;
import persistence.Item;
import persistence.ItemGroup;
import persistence.ItemGroupDto;
import persistence.ItemGroupRawData;
import utils.SqlUtils;

public class ItemGroupDao {
	private Connection conn;
	private Statement st = null;
	private PreparedStatement pst = null;
	private ResultSet rs = null;

	public ItemGroupDao() {
		conn = DbConnection.getConnection();
	}

	// Câu nào đây ?
	public List<ItemGroup> getAll() {
		List<ItemGroup> result = new ArrayList<>();
		String sql = "select * from loaihang";
		try {
			st = conn.createStatement();
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

	public List<ItemGroupRawData> getItemGroups(){
		List<ItemGroupRawData> result = new ArrayList<>();
		String sql = 
				"With TMP_CTE as ( \n" 
				
				+ "select mh.TenMH,\n" 
				+ "sum(kcmh.soluong) soluong,\n" 
				+ "mh.MaLoai\n" 
				+ "from mathang mh\n"  
				+ "join kichcomathang kcmh\n" 
				+ "on mh.MaMH = kcmh.MaMH\n"  
				+ "group by mh.MaMH\n"  
				+ ")\n"    
				+ "SELECT lh.MaLoai,\n" 
				+ "      lh.TenLoai,\n"  
				+ "       group_concat(Concat(mh.TenMH,'-', mh.Soluong) separator ',') DanhsachMatHang,\n"  
				+ "		sum(mh.soluong) TongSoLuong\n" 
				+ "FROM loaihang lh\n" 
				+ "join TMp_CTE mh\n"  
				+ "on lh.maloai =mh.maloai\n"  
				+ "group by lh.MaLoai ;";
				
		try {
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
		
			while (rs.next()) {
				ItemGroupRawData data = new ItemGroupRawData();
						data.setIgrId(rs.getInt("MaLoai"));
						data.setIgrName(rs.getString("TenLoai"));
						data.setTotalOfItems(rs.getInt("TongSoLuong"));
						
			result.add(data);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs,st);
		}
		return result;
	}
	
	 
	public boolean save(ItemGroup itemGroup) {
		boolean isSave = false;
		// prepared SQL with ? parameter
		String sql = "insert into loaihang values (?,?)";
		try {
			pst = conn.prepareStatement(sql);
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

	
}