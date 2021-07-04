package dml;

import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;

import bean.Grade;
import bean.Student;

import static utils.FileUtils.*;

public class Ex06 {
	
	private static final String path = "data" + File.separator + "student.json";
	
	public static void main(String[] args) {
		 // List<Student> students = getAll();
		 // writeJson(new File(path), students);
		
		
		List<Student> result = readJson(new File(path), new TypeReference<List<Student>>() {});
		System.out.println("size: " + result.size());
		for (Student student: result) {
			System.out.println(student);
		}
	}

	private static List<Student> getAll() {
		return Arrays.asList(
				new Student(
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
						}),
				new Student(
						"102130175",
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
						})
		);
	}
}
