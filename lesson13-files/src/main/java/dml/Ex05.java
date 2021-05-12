package dml;

import static utils.FileUtils.*;

import java.io.File;
import java.util.Properties;
public class Ex05 {
	
	private static final String path = "data" + File.separator + "config.properties";
	public static void main(String[] args) {
		File file = new File(path);
		Properties pros =  getProperties(file);
		
		System.out.println("dbname: " + pros.getProperty("dbname"));
		System.out.println("dbtype: " + pros.getProperty("dbtype"));
		System.out.println("port: " + pros.getProperty("port"));
	}
}
