package exercise;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import connection.DbConnection;
public class Ex04 {
	private static Connection connection = DbConnection.getConnection();

	public static void main(String[] args) {
		System.out.println("4. Tạo hóa đơn cho đơn hàng bất kì.");
		Integer orderId = 1;
		double TotalOfMoney = getTotalOfMoney(orderId);
		try {
			creatOrder(orderId, TotalOfMoney);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void creatOrder(int orderId, double TotalOfMoney) throws SQLException {
		connection.setAutoCommit(false);
		try {
			Statement insertStmt = connection.createStatement();
			insertStmt.execute("INSERT INTO hoadon(maHD,maDH,soTienCanThanhToan,NgayXuat) VALUES (" + orderId + ","
					+ orderId + "," + TotalOfMoney + ",current_timestamp())");
			connection.commit();
			System.out.println("sucessful insert!!!");
		} catch (SQLException e) {
			System.out.println("fail insert!!!");
			connection.rollback();
			e.printStackTrace();
		}
	}

	private static double getTotalOfMoney(int orderId) {
		double getTotalOfMoney = 0;
		try {
			Statement st = connection.createStatement();
			ResultSet rs = st.executeQuery(
					"SELECT SUM(mh.GiaBan * ctdh.SoLuong) as TongTien " + "FROM chitietdonhang ctdh, mathang mh "
							+ "WHERE mh.MaMH=ctdh.MaMH and ctdh.MaDH=" + orderId + "");
			while (rs.next()) {
				getTotalOfMoney = rs.getDouble(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return getTotalOfMoney;
	}
}
