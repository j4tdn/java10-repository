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
import java.util.jar.Attributes.Name;

import connection.DbConnection;
import persistence.Item;
import persistence.ItemGroup;
import persistence.ItemGroupDto;
import persistence.ItemGroupRawData;
import utils.SqlUtils;
import static utils.SqlUtils.*;

public class ItemGroupDao {
	
	private Connection conn;
	private Statement st;
	private PreparedStatement pst;
	private ResultSet rs;
	public ItemGroupDao() {
		
	}
	// Liet kê toàn bộ loại hàng
	public List<ItemGroup> getAll() {
		List<ItemGroup> result = new ArrayList<>();
		String sql = "SELECT MaLoai,\n" 
				+ "           TenLoai\n" 
				+ "FROM LoaiHang";
		 conn = DbConnection.getConnection();

		try {
			 st = conn.createStatement();
			 rs = st.executeQuery(sql);

			// ResultSet = List<T> >>T: columns alias
			while (rs.next()) {
				ItemGroup ig = new ItemGroup(rs.getInt("MaLoai"), rs.getString("TenLoai"));
				 result.add(ig);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
		}
		return result;
		
	}
	
	// liệt kê theo mã loại
	public List<ItemGroup> getItemGroups(int id) {
		List<ItemGroup> result = new ArrayList<>();
		String sql = "SELECT *\n" 
				+ "FROM LoaiHang\n"
				+ "WHERE MaLoai = "+ id;
			conn = DbConnection.getConnection();

		try {
			st = conn.createStatement();
			 rs = st.executeQuery(sql);

			// ResultSet = List<T> >>T: columns alias
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
	
	// liệt kê theo tên loại
	public List<ItemGroup> getItemGroups(String name) {
		List<ItemGroup> result = new ArrayList<>();
		String sql = "SELECT *\n" 
				+ "FROM LoaiHang\n"
				+ "WHERE TenLoai = '"+ name+ "'";
			conn = DbConnection.getConnection();

		try {
			st = conn.createStatement();
			 rs = st.executeQuery(sql);

			// ResultSet = List<T> >>T: columns alias
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
			// gán giá trị
			while (rs.next()) {
				ItemGroupRawData data = new ItemGroupRawData(rs.getInt("MaLoai"), 
																rs.getString("TenLoai"),
																rs.getString("DanhsachMatHang"),
																rs.getInt("TongSoLuong"));
			result.add(data);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs,st);
		}
		return result;
	}
	

	// insert
	public boolean save(ItemGroup itemGroup) {
		boolean isSaved = false;
		String sql = "INSERT INTO LoaiHang(MaLoai, TenLoai)\n"
				+ "VAlUES(?, ?)";
		 conn = DbConnection.getConnection();
		try {
			pst = conn.prepareStatement(sql);
			// gán giá trị
			pst.setInt(1, ItemGroup.getId());
			pst.setString(2, ItemGroup.getName());
			
			isSaved= pst.executeUpdate()>0;

			// ResultSet = List<T> >>T: columns alias
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs,st);
		}
		return isSaved;
		
	}

	public boolean insertFile() {
		boolean isInsert = false;
		File file = new File("loaihang.txt");
		FileReader fr = null;
		BufferedReader br = null;
		String sql = "insert into loaihang values (?,?)";
		conn = DbConnection.getConnection();
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			String dr = "";
			while ((dr = br.readLine()) != null) {
				pst = conn.prepareStatement(sql);
				pst.setInt(1, Integer.parseInt(dr.substring(0, dr.indexOf(","))));
				pst.setString(2, dr.substring(dr.indexOf(",") + 1));
				isInsert = pst.executeUpdate() > 0;
			}
		} catch (NumberFormatException | IOException | SQLException e) {
			e.printStackTrace();
		} finally {
			close(pst);
		}
		return isInsert;
	}
	
}
