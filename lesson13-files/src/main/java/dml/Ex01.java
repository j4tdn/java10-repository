package dml;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import bean.Trader;
import utils.FileUtils;

public class Ex01 {

	private static final String path = "data\\Trader.txt";

	public static void main(String[] args) {

		//String[] students = { "Trader T7", "Trader T8", "Trader T9" };
		File file = new File(path);

		//FileUtils.writeLines(file, students);
		FileUtils.print(FileUtils.readLines(file));
		
		Trader t1 = new Trader("Adam", "Milan");
		FileUtils.writeLines(file,t1.ToLine()); 
	}
}
