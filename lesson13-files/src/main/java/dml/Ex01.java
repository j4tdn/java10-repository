package dml;

import java.io.File;

import bean.Trader;

import static utils.FileUtils.*;

public class Ex01 {
	private static final String path = "data\\Trader.txt";

	public static void main(String[] args) {
		File file = new File(path);
		print(readLine(file));
		
		Trader t1 = new Trader("Adam", "Milan");
		writeLine(file, t1.toLine());

		// Student st1 = new Student(1, "A", 10); => String s1 = "1,A,10"
		
		// String line = "1,A,10"
		// String [] arr = line.split(",")
		
		// Student stLine = new Student(1,"A", 10);

		// List<Student> Student: id, name, point => List<String>
		// List<Employee> Employee: id, name, salary

		// student.txt
		// 1, A, 10
	}

}
