package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import connection.DbConnection;

public class OrderDao {
	private Connection conn;
	private Statement st;
	private PreparedStatement pst;
	private ResultSet rs;

	public OrderDao() {
		conn = DbConnection.getConnection();
	}
	
	public boolean updateTotalPrice(Integer orderId) {
		boolean isSaved = false;
		String sql = "UPDATE donhang SET tongTien = 999 WHERE MaDH = ?;";
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, orderId);
			isSaved = pst.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return isSaved;
	}
}
