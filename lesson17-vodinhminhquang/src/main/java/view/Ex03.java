package view;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connection.DbConnection;
import entity.ProductType3;

public class Ex03 {

	public static void main(String[] args) {
		getProductsInStock().stream().forEach(System.out::println);
	}

	private static List<ProductType3> getProductsInStock() {
		List<ProductType3> products = new ArrayList<>();

		try {
			String sql = "SELECT lh.*, group_concat(concat(mh.TenMH), ':', kcmh.Soluong) AS 'DS[MH:SoLuong]', sum(kcmh.Soluong) AS 'TongSoLuong'\r\n"
					+ "FROM kichcomathang kcmh\r\n" + "JOIN mathang mh\r\n" + "ON mh.MaMH = mh.MaMH\r\n"
					+ "JOIN loaihang lh\r\n" + "ON mh.MaLoai = lh.MaLoai\r\n" + "GROUP BY lh.MaLoai";

			Connection connection = DbConnection.getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				int MaLoai = rs.getInt(1);
				String TenLoai = rs.getString(2);
				String GroupProductAndQuantity = rs.getString(3);
				int TotalByIdType = rs.getInt(4);

				ProductType3 tempPro = new ProductType3(MaLoai, TenLoai, GroupProductAndQuantity, TotalByIdType);

				products.add(tempPro);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return products;
	}
}
