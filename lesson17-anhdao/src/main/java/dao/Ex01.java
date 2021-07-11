package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connection.DbConnection;
import persistence.ItemGroup;

public class Ex01 {
	
public List<ItemGroup> getAll01 (){
	List<ItemGroup> result = new ArrayList<>();
	
	// 1. Liệt kê toàn bộ thông tin các loại hàng trong hệ thống
	 //  + Liệt kê theo MaLoai
	 //  + Liệt kê theo TenLoai

	String sql = "SELECT* FROM LoaiHang";
	
	Connection connection = DbConnection.getConnection();
	try {
		
	Statement st = 	 connection.createStatement();
	ResultSet rs =  st.executeQuery(sql);
	
	while (rs.next()) {
		ItemGroup ig = new ItemGroup(rs.getInt("MaLoai"), rs.getString("TenLoai"));
		result.add(ig);
	}
	
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	return result;
	
}
}
