package exercise;

import static utils.Utils.print;

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
		System.out.println("2. Liệt kê các mặt hàng theo mã loại và giá bán trung bình từ 100 đến 500 trong hệ thống");
		List<MatHang> select = select(5, 100, 500);
		print(select);
	}

	private static List<MatHang> select(Integer idCategory, Integer saleIn, Integer saleOut) {
		List<MatHang> listItems = new ArrayList<>();
		try {
			Statement st = connection.createStatement();
			ResultSet rs = st.executeQuery("SELECT * from mathang where maloai = " + idCategory + " and GiaBan BETWEEN "
					+ saleIn + " and " + saleOut + "");
			while (rs.next()) {
				MatHang ItemGroup = new MatHang(rs.getInt(1), rs.getString(2), rs.getInt(5));
				listItems.add(ItemGroup);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listItems;
	}
}
