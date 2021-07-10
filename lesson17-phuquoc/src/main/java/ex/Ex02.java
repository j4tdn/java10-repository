package ex;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bean.MatHang;
import connection.DbConnection;

public class Ex02 {

	private static Connection connection = DbConnection.getConnection();

	public static void main(String[] args) {

		System.out.println("Liệt kê các mặt hàng theo mã loại và giá bán trung bình từ 100 đến 500 trong hệ thống");
		utils.Util.print(listitems(2, 100, 500));
	}

	private static List<MatHang> listitems(Integer idCategory, int saleprice, int buyprice) {
		List<MatHang> listCommodity = new ArrayList<>();
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from mathang where maloai = " + idCategory
					+ " and giaBan between " + saleprice + " and " + buyprice + "");
			while (resultSet.next()) {
				MatHang Items = new MatHang(resultSet.getInt("maMH"), resultSet.getString("tenMH"),
						resultSet.getDouble("giaBan"), resultSet.getDouble("giaMua"), resultSet.getInt("maLoai"), null);
				listCommodity.add(Items);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listCommodity;
	}
}