package ex04;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Ex02 {
	private static final String path = "data" + File.separator + "student.txt";
	public static void main(String[] args) {
		//create file student.txt in folder data
		File data = createDir("data");
		File student = createFile(path);
		Path stuPath = Paths.get(path);

		// lấy dữ liệu từ file student.txt
		List<Student> students = readLines(stuPath);
		// In ra danh sachs sinh vien
		students.forEach(System.out::println);
		//1. Sắp xếp danh sách sinh viên tăng dần theo ĐTB. Nếu DTB bằng nhau sắp xếp tăng dần theo họ tên.
		
	List<Student> listStudents=	students.stream()
			.sorted(Comparator.comparing((Student s)->s.getMeanScore()).thenComparing((Student s)->s.getName()))
		    .collect(Collectors.toList());
		//2. Viết hàm tìm kiếm danh sách sinh viên có ĐTB > 8
	List<Student> meanCore=	students.stream()
			.filter(t->t.getMeanScore()>8)
			.collect(Collectors.toList());
	
	//3. Viết hàm tìm kiếm toàn bộ các sinh viên NỮ
	List<Student> female =	students.stream()
			.filter(t->t.getGender().equals("Nu"))
			.collect(Collectors.toList());
	//4. Tìm kiếm sinh viên chỉ xuất hiện một lần trong student.txt. Biết rằng 2 sinh viên được phân biệt với nhau thông qua MSSV
			Set<String> unique =students.stream()

			.map(Student::getId)
			.collect(Collectors.toSet());
	}
	
	private static List<Student> readLines(Path path) {
		List<Student> result = new ArrayList<>();
		try {
			List<String> studentlines = Files.readAllLines(path);
			for (String line : studentlines) {

				String[] tmps = line.split(", ");
				if (tmps.length == 3) {
					Student stu = new Student(tmps[0], tmps[1], Double.parseDouble(tmps[2]), tmps[3]);
					result.add(stu);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return result;
	}
	public static File createDir(String path) {
		File dir = new File(path);
		dir.mkdirs();
		return dir;
	}
	public static File createFile(String path) {
		File file = new File(path);
		try {
			if (!file.exists()) {
				file.createNewFile();
				System.out.println("File is created successfully !!!");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return file;
	}
}
