package ex4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Bai4 {
	public static void main(String[] args) {
		List<Student> students = readFileStudent();   
		
		students.forEach(System.out::println);
	}

	private static List<Student> sort(List<Student> students) {
		return students.stream().sorted(Comparator.comparing(Student::getPoint).thenComparing(Student::getName))
				.collect(Collectors.toList());
	}

	private static List<Student> searchStudent(List<Student> students) {
		return students.stream().filter(s -> s.getPoint() > 8).collect(Collectors.toList());
	}

	private static List<Student> getFemaleStudent(List<Student> students) {
		return students.stream().filter(s -> "Nu".equals(s.getGender())).collect(Collectors.toList());
	}


	private static List<Student> readFileStudent() {
		List<Student> students = new ArrayList<Student>();

		String path = "student.txt";

		try {
			students = Files.lines(Paths.get(path)).map(s -> {
				String[] arr = s.split(", ");
				if (arr.length == 4) {
					return new Student(arr[0], arr[1], Double.parseDouble(arr[2]), arr[3]);
				}
				return null;
			}).filter(s -> s != null).collect(Collectors.toList());
		} catch (IOException e) {
			e.printStackTrace();
		}

		return students;
	}
}