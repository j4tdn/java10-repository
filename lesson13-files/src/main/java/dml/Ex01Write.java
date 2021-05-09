package dml;

import java.io.File;
import utils.FileUtils;

public class Ex01Write {
	private static final String path = "data//Trader.txt";
	
	public static void main(String[] args) {
		String[] trader = {"Trader 7","Trader 8","Trader 9"};
		
		File file = new File(path);
		
		FileUtils.writeLine(file, trader);
	}
}
