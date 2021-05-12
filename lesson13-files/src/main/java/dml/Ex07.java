package dml;

import java.io.File;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;

import bean.Grade;
import bean.Student;
import utils.FileUtils;

public class Ex07 {
	public static void main(String[] args) {
		File file = new File("data02/student.json");
		Student students = getAll();
		FileUtils.writeJson(file, students);
		
		System.out.println(FileUtils.readJson(file, Student.class));
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
