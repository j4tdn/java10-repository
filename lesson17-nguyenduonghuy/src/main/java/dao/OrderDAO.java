package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.DatabaseConnection;

public class OrderDAO {
	private static Connection con;
	private static PreparedStatement ps;
	private static ResultSet rs;
	
	private OrderDAO() {
	}
	
	public static Integer getTotalMoney(Integer orderId) {
		Integer totalMoney = null;
		String sql = "SELECT SUM(mh.GiaBan * ctdh.SoLuong)\r\n"
					+ "FROM mathang mh\r\n"
					+ "JOIN chitietdonhang ctdh\r\n"
					+ "	ON mh.MaMH = ctdh.MaMH\r\n"
					+ "JOIN donhang dh\r\n"
					+ "	ON dh.MaDH = ctdh.MaDH\r\n"
					+ "WHERE dh.MaDH = ?;";
		con = DatabaseConnection.getConnection();
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, orderId);
			rs = ps.executeQuery();
			if (rs.next()) {
				totalMoney = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return totalMoney;
	}
}
