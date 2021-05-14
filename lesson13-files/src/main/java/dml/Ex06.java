package dml;

import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import bean.Grade;
import bean.Student;

import static utils.FileUtils.*;

public class Ex06 {
	
	private static final String path = "data" + File.separator + "student.json";
	
	public static void main(String[] args) {
		// List<Student> students = getAll();
		// writeJson(new File(path), students);
		
		@SuppressWarnings("unchecked")
		Class<List<Student>> unsafeListClass = (Class<List<Student>>) (Class<?>) List.class;
		
		List<Student> result = readJson(new File(path), unsafeListClass);
		// List<LinkedHashMap> 
		System.out.println(result);
	}

	private static List<Student> getAll() {
		return Collections.singletonList(new Student(
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
				}));
	}
}