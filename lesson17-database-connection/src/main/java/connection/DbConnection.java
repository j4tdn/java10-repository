package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class DbConnection {
	private static Connection connection;
	// This driver RDBMS?
	// or can using com.mysql.jdbc.Drive, cai nay thuoc phien ban cu se hien waring thoi
	// or using Driver.class.getName(); no se tu dong add import com.mysql.cj.jdbc.Driver vao
//	private static String DRIVER ="com.mysql.cj.jdbc.Driver";
//	private static String URL = "jdbc:mysql://localhost:33066/java10_shopping";
//	private static String USER = "root";
//	private static String PASS = "1234";
	

	public static Connection getConnection() {
		if (connection == null) {
			Properties properties = DBProvider.getDBConfig();
			try {
				Class.forName(properties.getProperty("DRIVER"));
				// or connection = DriverManager.getConnection(URL,USER, PASS);
				connection = DriverManager.getConnection(properties.getProperty("URL"), properties.getProperty("USER"), properties.getProperty("PASS"));
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return connection;
	}
}
