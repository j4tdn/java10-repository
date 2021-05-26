package dml;

import static utils.FileUtils.readJson;

import java.io.File;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;

import bean.Grade;
import bean.Student;
public class Ex06 {

	private static final String path = "data" + File.separator + "student.json";

	public static void main(String[] args) {
//		Student students = getAll();
//		writeJson(new File(path), students);
		
		List<Student> result = readJson(new File(path), new TypeReference<List<Student>>() {
		});
		System.out.println("size: " + result.size());
		System.out.println(result);
	}

	private static Student getAll() {
		return new Student("102130174", "Kate Levan", Arrays.asList("JAVA", "C++", "PHP"),
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