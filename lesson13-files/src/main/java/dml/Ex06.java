package dml;

import static utils.FileUtils.*;

import java.io.File;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;

import bean.Grade;
import bean.Student;

public class Ex06 {
	private static final String path = "data" + File.separator + "student.json";
	public static void main(String[] args) {
//		Student students = getAll();
//		writeJson(new File(path), students);
		Student student = readJson(new File(path), Student.class);
		System.out.println(student);
	}
	
	private static Student getAll() {
		return new Student(
				"102130174",
				"Kate Levan",
				Arrays.asList("JAVA", "C++", "PHP"),
				Arrays.asList(new Grade("10T0", "Grade 10T0"), new Grade("10T1", "Grade 10T1")),
				new HashMap<String, BigDecimal>() {
					private static final long serialVersionUID = -4913510531374128809L;
					{
						put("JAVA", BigDecimal.valueOf(10));
						put("C++", BigDecimal.valueOf(8));
						put("PHP", BigDecimal.valueOf(9));
					}
		});
		
		
	}
}