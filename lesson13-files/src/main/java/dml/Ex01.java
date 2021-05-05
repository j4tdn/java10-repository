package dml;

import java.io.File;

import bean.Trader;

import static utils.FileUtils.*;

public class Ex01 {
	private static final String path = "data\\Trader.txt";

	public static void main(String[] args) {
		File file = new File(path);
		print(readLines(file));

		Trader t1 = new Trader("Adam", "Milan");
		writeLines(file, t1.toLine());

	}
}
