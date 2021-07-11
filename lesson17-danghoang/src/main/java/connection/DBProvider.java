package connection;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DBProvider {
	private static final String DB_CONFIG = "database.properties";
	
	private DBProvider() {
	}
	
	public static Properties getDbConfig() {
		Properties t = new Properties();
		try {
			t.load(new FileInputStream(new File(DB_CONFIG)));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return t;
	}
}