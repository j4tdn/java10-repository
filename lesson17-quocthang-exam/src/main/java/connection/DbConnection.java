package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbConnection {
	private static Connection connection;

	public static Connection getConnection() {
		if (connection == null) {
			Properties props = DbProvider.getDbConfig();
			try {
				Class.forName(props.getProperty("DRIVER"));
				connection = DriverManager.getConnection(props.getProperty("URL"), props.getProperty("USER"),
						props.getProperty("PASS"));
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		}
		return connection;
	}

}
