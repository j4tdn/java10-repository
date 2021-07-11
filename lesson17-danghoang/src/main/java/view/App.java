package view;

import java.sql.Connection;

import connection.DBconnection;

public class App {
	public static void main(String[] args) {

		Connection connection = DBconnection.getConnection();
		System.out.println(connection);
	}

}