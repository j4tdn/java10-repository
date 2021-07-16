package view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connection.DbConnection;
import entity.Product;

public class Ex10 {
	public static void main(String[] args) {
		productById(2).forEach(System.out::println);
	}
	
	public static List<Product> productById(int theId){
		List<Product> result = new ArrayList<>();
		String sql = "CALL showItemsByGroupId(?)";
		Connection myConn = DbConnection.getConnection();
		try {
			PreparedStatement stmt = myConn.prepareStatement(sql);
			stmt.setInt(1, theId);
			ResultSet rs = stmt.executeQuery();
			
			while (rs.next()) {
				
				int MaMH = rs.getInt(1);
				String TenMH = rs.getString(2);
				String MauSac = rs.getString(3);
				String ChatLieu = rs.getString(4);
				int GiaBan = rs.getInt(5);

				Product tempPro = new Product(MaMH, TenMH, MauSac, ChatLieu, GiaBan);

				result.add(tempPro);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
}
