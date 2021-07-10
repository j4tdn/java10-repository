package exercise;
import static utils.Utils.print;

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
		System.out.println("5. Liệt kê các mặt hàng được bán trong ngày bất kì");
		LocalDate date = LocalDate.of(2020, 12, 17);
		List<MatHang> getItems = getItems(date);
		print(getItems);
	}

	private static List<MatHang> getItems(LocalDate salesDate) {
		List<MatHang> listItems = new ArrayList<>();
		try {
			Statement st = connection.createStatement();
			ResultSet rs = st.executeQuery("SELECT mh.MaMH, mh.TenMH, dh.ThoiGianDatHang " + "FROM MatHang mh "
					+ "JOIN ChiTietDonHang ctdh " + "	ON mh.MaMH = ctdh.MaMH " + "JOIN DonHang dh "
					+ "	ON dh.MaDH = ctdh.MaDH " + "WHERE DATE(dh.ThoiGianDatHang) = '" + salesDate + "'");
			while (rs.next()) {
				MatHang ItemGroup = new MatHang(rs.getInt("maMH"), rs.getString("tenMH"),
						rs.getDate("ThoiGianDatHang"));
				listItems.add(ItemGroup);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listItems;
	}
}
