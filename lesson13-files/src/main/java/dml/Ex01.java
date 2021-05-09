package dml;

import java.io.File;

import bean.Trader;
import static utils.FileUtils.*;

public class Ex01 {
	private static final String path = "data\\Trader.txt";
	public static void main(String[] args) {
		File file = new File(path);
		
		Trader t1 = new Trader("Adam", "Milan");
		writeLines(file, t1.toLine());
		
		print(readLines(file));
	// Student st1 = new Student(1 , "A", 10); => String s1 = "1, A, 10";
		
		// String line = "1, A , 10";
		
		//Student stLine = new Student(ar
	}

}
