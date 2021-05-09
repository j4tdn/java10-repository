package dml;

import java.io.File;

import utils.FileUtils;

public class Ex02Read {
	private static final String path = "data//Trader.txt";
	
	public static void main(String[] args) {
		File file = new File(path);
		FileUtils.printf(FileUtils.readLines(file).toArray());
	}
}
