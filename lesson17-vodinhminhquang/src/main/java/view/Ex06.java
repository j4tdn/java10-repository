package view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.DbConnection;

public class Ex06 {

	public static void main(String[] args) {
		if (updateTotalById(1)) {
			System.out.println("Successfully!!!");
		}
		
	}

	private static boolean updateTotalById(int billId) {
		String sql = "UPDATE donhang SET TongTien = 999 WHERE MaDh = ? ";
		Connection myConn;
		PreparedStatement stmt;

		myConn = DbConnection.getConnection();
		try {
			stmt = myConn.prepareStatement(sql);
			stmt.setInt(1, billId);
			if (stmt.executeUpdate() > 0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}
