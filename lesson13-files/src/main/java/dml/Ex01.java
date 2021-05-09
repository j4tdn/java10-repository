package dml;

import java.io.File;

import bean.Trader;
import static utils.FileUtils.*;
import utils.FileUtils;
public class Ex01 {
	private static final String path = "data\\Trader.txt";
public static void main(String[] args) {
	//String []student = {"Trader T7","Trader T8","Trader T9"};
	
	
       File file = new File(path);
//	FileUtils.writeLine(file, student);
	print(FileUtils.readLines(file));
	
	Trader t1 = new Trader("Adam", "Milan");
	writeLines(file,t1.toLine());
}
}
