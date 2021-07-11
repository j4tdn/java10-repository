package view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.DbConnection;
import entity.ProductDate;
import entity.ProductIdAndMeanPrice;
import entity.ProductType3;

public class Ex05 {

	public static void main(String[] args) {
		 getByDate("2020-12-18").stream().forEach(System.out::println);
	}

	private static List<ProductDate> getByDate(String date) {
		List<ProductDate> products = new ArrayList<>();

		try {
			String sql = "SELECT mh.TenMH, dh.ThoiGianDatHang FROM mathang mh \r\n" + "JOIN chitietdonhang ctdh \r\n"
					+ "ON mh.MaMH = ctdh.MaMH\r\n" + "JOIN donhang dh\r\n" + "ON ctdh.MaDH = dh.MaDH\r\n"
					+ "WHERE cast(dh.ThoiGianDatHang AS DATE) = '?'";
			Connection connection = DbConnection.getConnection();
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, date);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				String ProductName = rs.getString(1);
				String ThoiGianDatHang = rs.getString(2);

				ProductDate tempPro = new ProductDate(ProductName, ThoiGianDatHang);

				products.add(tempPro);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return products;
	}

}
