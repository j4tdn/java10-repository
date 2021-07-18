package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbConnetion {

	public static Connection myConn;

	public static Connection getConnection() {
		Properties prop = DbProvider.getDbConfig();
		if (myConn == null) {
			try {
				// driver
				Class.forName(prop.getProperty("DRIVER"));

				// driver manager
				myConn = DriverManager.getConnection(prop.getProperty("URL"), prop.getProperty("USER"),
						prop.getProperty("PASSWORD"));
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		}
		return myConn;
	}

}
