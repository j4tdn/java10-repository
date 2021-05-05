package dml;

import java.io.File;
import utils.FilesUtils;

public class Ex01 {
	private static final String path = "lesson12\\Trader.txt";

	public static void main(String[] args) {
//		String[] students = { "Trader T7", "Trader T8", "Trader T9" };
		File file = new File(path);

//		FilesUtils.writeLines(file, students);
		print(readLines(file));

	}

}
