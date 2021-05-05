package dml;

import java.io.File;

import bean.Trader;

import static utils.FileUtils.*;

public class Ex01 {
	private static final String path = "data" + File.separator + "Trader.txt";

	public static void main(String[] args) {
		File file = new File(path);
		print(readLines(file));
		
		Trader t1 = new Trader("Adam", "Milan");
		writeLines(file, t1.toLine());
		
		// Student st1 = new Student (1, "A", 10); --> String s1 = "1, A, 10";
		// String lines = "1, A, 10";
		// String[] arr= lines.split(", ");
		// Student student1 = new Student(arr[0], arr[1], arr
		
		// List<Student> Student: id, name, point -> List<String>
		// List<Employee> Employee: id, name, salary
	}
}
