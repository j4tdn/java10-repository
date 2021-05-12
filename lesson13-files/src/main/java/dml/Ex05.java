package dml;

import static utils.FileUtils.*;

import java.io.File;
import java.util.Properties;
public class Ex05 {
	
	private static final String path = "data" + File.separator + "config.properties";
	
	public static void main(String[] args) {
		File file = new File(path);
		Properties props = getProperties(file);
		
		System.out.println("dbname: " +props.get("dbname"));
		System.out.println("dbtype: " +props.get("dbtype"));
		System.out.println("prot: " +props.get("prot"));
	}
}
