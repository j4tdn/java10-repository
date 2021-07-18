package connection;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class DbProvider {

	public static final String FILE_CONFIG = "database.properties";

	public static Properties getDbConfig() {
		Properties prop = new Properties();

		try {
			InputStream stream = new FileInputStream(new File(FILE_CONFIG));
			prop.load(stream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}
}
