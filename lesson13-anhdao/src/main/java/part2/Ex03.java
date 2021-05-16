package part2;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import utils.FilesUtils;
import static utils.FilesUtils.*;

public class Ex03 {
	private static final String path = "data" + File.separator + "student.txt";

	public static void main(String[] args) throws IOException {
		// create file student.txt in folder data

		Path stuPath = Paths.get(path);

		// lấy dữ liệu từ file student.txt
		List<Student> students = readLines(stuPath);
		// In ra danh sachs sinh vien
		students.forEach(System.out::println);

		// them thong tin sv
		addStudent(stuPath, Arrays.asList(new Student("1", "han", 7)));

		// xoa thong tin sv
		System.out.println("==================================");
		List<Student> listSudentAftDele = deleteline(stuPath, t -> t.equals("1"));
		listSudentAftDele.forEach(System.out::println);

		// cap nhat thong tin sv
		updateLine(stuPath, 1, "2", "5");

	}

	private static List<Student> readLines(Path path) {
		List<Student> result = new ArrayList<>();
		try {
			List<String> studentlines = Files.readAllLines(path);
			for (String line : studentlines) {

				String[] tmps = line.split("-");
				if (tmps.length == 3) {
					Student stu = new Student(tmps[0], tmps[1], Double.parseDouble(tmps[2]));
					result.add(stu);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return result;
	}

	private static void addStudent(Path path, List<Student> list) {
		List<String> studentAsString = list.stream().map(Student::toLine).collect(Collectors.toList());
		try {
			Files.write(path, studentAsString, StandardOpenOption.APPEND);
			System.out.println("Add Student successful!");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static List<Student> deleteline(Path path, Predicate<String> predicate) {
		List<Student> result = new ArrayList<>();
		try {
			List<String> studentlines = Files.readAllLines(path);
			for (String line : studentlines) {
				String[] tmps = line.split("-");
				if (tmps.length == 3) {
					for (String tmp : tmps) {
						if (predicate.test(tmp)) {
							System.out.println("Delete student successful!");
						} else {
							Student stu = new Student(tmps[0], tmps[1], Double.parseDouble(tmps[2]));
							result.add(stu);
						}
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	private static List<Student> updateLine(Path path, int indexUpdate, String oldInform, String newInform) {
		List<Student> result = new ArrayList<>();
		try {
			List<String> studentlines = Files.readAllLines(path);
			for (String line : studentlines) {
				String[] tmps = line.split("-");
				if (tmps.length == 3) {
					for (String tmp : tmps) {
						if (tmp.equals(oldInform)) {
							System.out.println("Update student successful!");
							if (indexUpdate == 1) {
								Student stu = new Student(newInform, tmps[1], Double.parseDouble(tmps[2]));
								result.add(stu);
							}
							if (indexUpdate == 2) {
								Student stu = new Student(tmps[0], newInform, Double.parseDouble(tmps[2]));
								result.add(stu);
							}
							if (indexUpdate == 3) {
								Student stu = new Student(tmps[0], tmps[1], Double.parseDouble(newInform));
								result.add(stu);
							}
						}
						Student stu = new Student(tmps[0], tmps[1], Double.parseDouble(tmps[2]));
						result.add(stu);
					}
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}
}
