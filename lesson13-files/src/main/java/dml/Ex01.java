package dml;

import java.io.File;

import utils.FileUtils;

public class Ex01 {
	private static final String path = "data\\Trader.txt";
	
	public static void main(String[] args) {
//		String[] students = {""};
		File file = new File(path);
//		FileUtils.writeLines(file, students);
		
		FileUtils.print(FileUtils.readLines(file)); 
	}
}
