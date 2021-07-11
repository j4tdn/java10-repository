package Ex;

import static utils.Utils.print;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.MatHang;
import connection.DBconnection;
import connection.DBconnection;

public class Ex02 {
	private static Connection connection = DBconnection.getConnection();

	public static void main(String[] args) {
		System.out.println("2. Liệt kê các mặt hàng theo mã loại và giá bán trung bình từ 100 đến 500 trong hệ thống");
		List<MatHang> select = select(1, 100, 500);
		print(select);
	}

	private static List<MatHang> select(Integer idCategory, Integer saleIn, Integer saleOut) {
		List<MatHang> listItems = new ArrayList<>();
		try {
			Statement selectStmt = connection.createStatement();
			ResultSet rs = selectStmt.executeQuery("SELECT * from mathang where maloai = " + idCategory
					+ " and giaBan BETWEEN " + saleIn + " and " + saleOut + "");
			while (rs.next()) {
				MatHang ItemGroup = new MatHang(rs.getInt("maMH"), rs.getString("tenMH"), rs.getInt("giaBan"));
				listItems.add(ItemGroup);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listItems;
	}
}