package exercises;

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
		LocalDate date = LocalDate.of(2020, 12, 18);
		List<MatHang> getItems = getItems(date);
		print(getItems);
	}

	private static List<MatHang> getItems(LocalDate salesDate) {
		List<MatHang> listItems = new ArrayList<>();
		try {
			Statement selectStmt = connection.createStatement();
			ResultSet rs = selectStmt.executeQuery(
					"select mh.MaMH, mh.TenMH, dh.ThoiGianDatHang from MatHang mh join ChiTietDonHang ctdh on mh.MaMH = ctdh.MaMH join DonHang dh on dh.MaDH = ctdh.MaDH where DATE(dh.ThoiGianDatHang) = '"
							+ salesDate + "'");
			while (rs.next()) {
				MatHang ItemGroup = new MatHang(rs.getInt("maMH"), rs.getString("tenMH"),
						rs.getDate("thoiGianDatHang"));
				listItems.add(ItemGroup);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listItems;
	}

}
