package dao;

import static utils.SqlUtils.close;

import java.sql.Connection;
import java.sql.SQLException;

import connection.DbConnection;

public class OrderDao {
	private Connection connection;
	private java.sql.PreparedStatement pst = null;

	public OrderDao() {
		connection = DbConnection.getConnection();
	}

	public boolean update(int idOder) {
		boolean isUpdate = false;
		// prepared SQL with ? parameter
		String sql = "update donhang set tongtien = 199 where maDH = ?";
		try {
			pst = connection.prepareStatement(sql);
			pst.setInt(1, idOder);
			isUpdate = pst.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pst);
		}
		return isUpdate;
	}
}
