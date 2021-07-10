package ex;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import bean.MatHang;
import connection.DbConnection;

public class Ex05 {

	private static Connection connection = DbConnection.getConnection();

	public static void main(String[] args) {
		
		System.out.println("Liệt kê các mặt hàng được bán trong ngày bất kì");
		utils.Util.print(listItems(LocalDate.of(2021, 01, 05)));
	}

	private static List<MatHang> listItems(LocalDate saleDate) {
		List<MatHang> listItems = new ArrayList<>();
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select mh.*" + "from MatHang mh "
					+ "join ChiTietDonHang ctdh " + "ON mh.MaMH = ctdh.MaMH " + "JOIN DonHang dh "
					+ "	ON dh.MaDH = ctdh.MaDH " + "where DATE(dh.ThoiGianDatHang) = '" + saleDate + "'");
			while (resultSet.next()) {
				MatHang Items = new MatHang(resultSet.getInt("maMH"), resultSet.getString("tenMH"),
						resultSet.getDouble("giaBan"), resultSet.getDouble("giaMua"),
						resultSet.getInt("maLoai"), null);
				listItems.add(Items);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listItems;
	}
}