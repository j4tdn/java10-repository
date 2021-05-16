package demo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ex04 {
	public static void main(String[] args) {
		File file = new File("student.txt");
		List<Student> Students = readFile(file.toPath());
		Students.forEach(System.out::println);
		System.out.println("1: Sắp xếp danh sách sinh viên tăng dần theo ĐTB.");
		Students.stream().sorted(Comparator.comparing(dtb -> dtb.getPoint())).forEach(System.out::println);
		System.out.println("2: Danh sách sinh viên có ĐTB > 8");
		Students.stream().filter(dtb -> dtb.getPoint() > 8).forEach(System.out::println);
		System.out.println("3: Sinh viên NỮ");
		Students.stream().filter(gt -> gt.getSex().equals("Nu")).forEach(System.out::println);
		System.out.println("4: Sinh viên chỉ xuất hiện một lần");
		Students.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
	}
	private static List<Student> readFile(Path path) {
		List<Student> result = new ArrayList<Student>();
		try {
			List<String> elements = Files.readAllLines(path);
			for (String element : elements) {
				String[] temp = element.split(", ");
				Student item = new Student(temp[0], temp[1], Double.parseDouble(temp[2]), temp[3]);
				result.add(item);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}
}
