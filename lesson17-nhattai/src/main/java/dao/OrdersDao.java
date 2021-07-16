package dao;

import static utils.SqlUtils.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.DbConnection;

public class OrdersDao {
	private Connection connection;
	private PreparedStatement pst = null;

	public OrdersDao() {
		connection = DbConnection.getConnection();
	}

	public boolean updateOrder(int orderId) {
		boolean isUpdated = false;
		String sql = "UPDATE DonHang SET TongTien = 999 WHERE MaDH = ?";
		try {
			pst = connection.prepareStatement(sql);
			pst.setInt(1, orderId);
			isUpdated = pst.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pst);
		}
		return isUpdated;
	}
}
