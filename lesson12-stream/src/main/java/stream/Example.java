package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import bean.Student;

public class Example {
	public static void main(String[] args) {
		List<Student> students = getAllStudent();
//		Hiển thị danh sách học viên
		students.forEach(System.out::println);
		System.out.println("------------------------------");
//		Sắp xếp danh sách học viên theo thứ tự giảm dần điểm trung bình
		students.sort(Comparator.comparing(Student::getAvg).reversed());
		// students.forEach(System.out::println);
//		Xuất danh sách 3 học viên có điểm trung bình cao nhất lớp
		students.stream().sorted(Comparator.comparing(Student::getAvg).reversed()).map(Student::getName).limit(3).forEach(System.out::println);
		System.out.println("------------------------------");
		//		Liệt kê danh sách tên học viên có điểm trung bình > 8
		students.stream().filter((Predicate<? super Student>) s -> s.getAvg() >= 8.0).map(Student::getName).forEach(System.out::println);
		System.out.println("------------------------------");
//		Đếm số lượng học viên nam trong lớp
		System.out.println(students.stream().count());
		System.out.println("------------------------------");
//		Liệt kê tên của những học viên nữ trong lớp
		students.stream().filter(t -> t.isGender() == false).map(Student::getName).forEach(System.out::println);
	}
	
	private static List<Student> getAllStudent() {
		return Arrays.asList(
				new Student(1, "Huy", 8.0, true, 15),
				new Student(2, "Ngan", 9.5, false, 14),
				new Student(3, "Quang", 7.0, true, 10),
				new Student(4, "Thien", 8.5, false, 12),
				new Student(5, "Vu", 6.5, true, 16),
				new Student(6, "Quyen", 10.0, true, 14)
				);
	}
}
