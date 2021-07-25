package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbConnection {

	private static Connection connection;

	public static Connection getConnection() {

		Properties props = DbProvider.getDbConfig();

		if (connection == null) {
			try {
				// driver
				Class.forName(props.getProperty("DRIVER"));

				// drive manager
				connection = DriverManager.getConnection(props.getProperty("URL"), props.getProperty("USER"),
						props.getProperty("PASSWORD"));
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		}

		return connection;

	}
}
