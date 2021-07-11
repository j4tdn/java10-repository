package view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.DbConnection;
import entity.ProductIdAndMeanPrice;

public class Ex02 {

	public static void main(String[] args) {
		getByIdAndMeanPrice(100, 500).forEach(System.out::println);
	}

	private static List<ProductIdAndMeanPrice> getByIdAndMeanPrice(int from, int to) {
		List<ProductIdAndMeanPrice> products = new ArrayList<>();

		try {
			String sql = "SELECT mh.MaLoai, round(AVG(mh.GiaBan), 2) AS Mean FROM mathang mh\r\n"
					+ "JOIN loaihang lh\r\n" + "ON mh.MaLoai = lh.MaLoai\r\n" + "GROUP BY MaLoai\r\n"
					+ "HAVING MEAN BETWEEN ? AND ?";
			Connection connection = DbConnection.getConnection();
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, from);
			stmt.setInt(2, to);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				int MaLoai = rs.getInt(1);
				double MeanPrice = rs.getDouble(2);

				ProductIdAndMeanPrice tempPro = new ProductIdAndMeanPrice(MaLoai, MeanPrice);

				products.add(tempPro);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return products;
	}
}
