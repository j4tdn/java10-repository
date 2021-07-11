  package views;

import java.sql.Connection;

import connection.DbConnection;

public class App {
	public static void main(String[] args) {

		Connection connection = DbConnection.getConnection();
		System.out.println(connection);
	}

}