package connection;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DBProvider {
	private static final String DB_CONFIG = "database.properties";

	private DBProvider() {
		// TODO Auto-generated constructor stub
	}

	public static Properties getDBConfig() {
		Properties properties = new Properties();
		InputStream stream;
		try {
			stream = new FileInputStream(DB_CONFIG);
			properties.load(stream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return properties;
	}
}
