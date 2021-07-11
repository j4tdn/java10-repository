package view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.DbConnection;
import entity.Product;

public class Ex01 {

	public static void main(String[] args) {
		getById(2).stream().forEach(System.out::println);
		System.out.println("===========================");
		getByProductName("Quần tây Nam").stream().forEach(System.out::println);
	}

	private static List<Product> getById(int id) {

		List<Product> products = new ArrayList<>();

		try {
			String sql = "SELECT * FROM mathang WHERE MaLoai = ?";
			Connection connection = DbConnection.getConnection();
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				int MaMH = rs.getInt(1);
				String TenMH = rs.getString(2);
				String MauSac = rs.getString(3);
				String ChatLieu = rs.getString(4);
				int GiaBan = rs.getInt(5);

				Product tempPro = new Product(MaMH, TenMH, MauSac, ChatLieu, GiaBan);

				products.add(tempPro);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return products;

	}
	
	private static List<Product> getByProductName(String name) {

		List<Product> products = new ArrayList<>();

		try {
			String sql = "SELECT * FROM mathang WHERE TenMH = ?";
			Connection connection = DbConnection.getConnection();
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, name);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				int MaMH = rs.getInt(1);
				String TenMH = rs.getString(2);
				String MauSac = rs.getString(3);
				String ChatLieu = rs.getString(4);
				int GiaBan = rs.getInt(5);

				Product tempPro = new Product(MaMH, TenMH, MauSac, ChatLieu, GiaBan);

				products.add(tempPro);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return products;

	}


}
