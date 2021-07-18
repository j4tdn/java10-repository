package connection;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DatabaseProvider {
	private static final String DB_CONFIG = "database.properties";
	
	private DatabaseProvider() {
	}
	
	public static Properties getDbConfig() {
		Properties pros = new Properties();
		try {
			pros.load(new FileInputStream(new File(DB_CONFIG)));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return pros;
	}
}
