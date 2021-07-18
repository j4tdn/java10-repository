package connection;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DbProvider {
	private static final String DB_CONFIG = "database.properties";
	private DbProvider() {
	}
	
	public static Properties getDBConfig() {
		Properties props= new Properties();
		try {
			InputStream stream = new FileInputStream(new File(DB_CONFIG));
            props.load(stream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return props;
	}
}
