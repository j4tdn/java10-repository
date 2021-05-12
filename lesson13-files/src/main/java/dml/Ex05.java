package dml;
import static utils.FileUtils.getProperties;

import java.io.File;
import java.util.Properties;
public class Ex05 {
	private static final String path = "data" + File.separator + "config.properties";

	public static void main(String[] args) {
		File file = new File(path);
		Properties props =  getProperties(file);
		System.out.println("dbname: " + props.getProperty("dbname"));
		System.out.println("dntype: " + props.getProperty("dntype"));
		System.out.println("port: " + props.getProperty("port"));
	}
}
