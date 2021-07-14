package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.DatabaseConnection;
import entities.Order;

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
	
	public static boolean saveTotalMoney(Integer orderId, Integer totalMoney) {
		boolean isSaved = false;
		totalMoney = getTotalMoney(orderId);
		String sql = "UPDATE donhang \r\n"
					+ "SET TongTien = ?\r\n"
					+ "WHERE MaDH = ?; ";
		con = DatabaseConnection.getConnection();
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, totalMoney);
			ps.setInt(2, orderId);
			isSaved = ps.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return isSaved;
	}
	
	public static Order getById(Integer orderId) {
		Order order = null;
		String sql = "SELECT * \r\n"
					+ "FROM donhang\r\n"
					+ "WHERE MaDH = ?;";
		con = DatabaseConnection.getConnection();
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, orderId);
			rs = ps.executeQuery();
			if (rs.next()) {
				order = new Order(rs.getInt(1), rs.getString(2), rs.getString(3), 
								rs.getInt(4), rs.getDate(5), rs.getDouble(6), 
								rs.getInt(7), rs.getInt(8), rs.getInt(9));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return order;
	}
	
	public static boolean updateTotalMoney(Integer orderId) {
		boolean isSaved = false;
		String sql = "UPDATE donhang\r\n"
					+ "SET TongTien = 999\r\n"
					+ "WHERE MaDH = ?;";
		con = DatabaseConnection.getConnection();
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, orderId);
			isSaved = ps.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return isSaved;
	}
}
