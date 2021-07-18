package exercise;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import connection.DbConnection;

public class Ex09 {
	private static Connection connection = DbConnection.getConnection();
	public static void main(String[] args) {
		try {
			update();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	private static void update() throws SQLException {
		connection.setAutoCommit(false);
		try {
			Statement insertStmt = connection.createStatement();
			insertStmt.execute("UPDATE kichcomathang set kichcomathang.Soluong = 10 \n"
								+ "where kichcomathang.maMH in \n"
								+ "(select maMH\n"
								+ " from mathang \n"
								+ "where mathang.tenMH = \"quan jean nam\")");
			insertStmt.execute("UPDATE chitietdonhang set soluong = 8");
			connection.commit();
			System.out.println("sucessfull!!!!");
		} catch (SQLException e) {
			System.out.println("fail!!!!");
			connection.rollback();
			e.printStackTrace();
		}
	}

}
