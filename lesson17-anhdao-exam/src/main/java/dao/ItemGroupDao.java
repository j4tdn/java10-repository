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
import utils.SqlUtils;
import static utils.SqlUtils.*;

public class ItemGroupDao {
	
	private Connection conn;
	private Statement st;
	private PreparedStatement pst;
	private ResultSet rs;
	public ItemGroupDao() {
		
	}
	// Thống kê số lượng mặt hàng tồn kho của mỗi loại hàng. Kết quả trả về códạng như sau
		public List<ItemGroupDto> getItemsByGroup() {
			List<ItemGroupDto>  result = new ArrayList<>();
			// Câu 2: 22đ
			// SELECT lh.* bị thừa
			// Đề yêu cầu và em chỉ lấy ra MaLoai, TenLoai, SoLuong trong Java
			// Thì chỗ SQL em cũng nên lấy ra chừng đó column thôi. SELECT ra mà ko sử dụng
			// trong JAVA thì thừa và tốn memory cho ResultSet
				String sql = 
						"SELECT lh.*,\n"  
						+"sum(kcmh.Soluong) TongSoluong\n"  
						+"FROM mathang mh\n"  
						+"join loaihang lh\n" 
						+"on mh.MaLoai = lh.MaLoai\n" 
						+"join kichcomathang kcmh\n" 
						+"on mh.MaMH = kcmh.MaMH\n" 
						+"group by  mh.MaLoai";
				conn = DbConnection.getConnection();
				try {
					pst = conn.prepareStatement(sql);
					rs = pst.executeQuery();
					while (rs.next()) {
						ItemGroupDto itemgr = new ItemGroupDto(rs.getInt("MaLoai"), rs.getString("TenLoai"), rs.getInt("TongSoluong"));
						 result.add(itemgr);
					}
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					SqlUtils.close(rs,st);
				}
				return result;
			}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//===================================================
	//
}
