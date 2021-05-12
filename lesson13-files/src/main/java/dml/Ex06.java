package dml;

import java.io.File;
import java.util.Properties;

import utils.FileUtils;

public class Ex06 {
	private static final String path = "data02" + File.separator + "config.properties";
	
	public static void main(String[] args) {
		File file = new File(path);
		Properties props = FileUtils.getProperties(file);
		System.out.println(props.getProperty("dbname"));
	}
}
