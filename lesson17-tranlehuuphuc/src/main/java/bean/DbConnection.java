package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbConnection {
	private static Connection connection;

	public static Connection getConnection() {
		if (connection == null) {
			Properties properties = DbProvider.getDBConfig();
			try {
				Class.forName(properties.getProperty("DRIVER"));

				connection = DriverManager.getConnection(properties.getProperty("URL"), properties.getProperty("USER"),
						properties.getProperty("PASS"));
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		}
		return connection;
	}

}