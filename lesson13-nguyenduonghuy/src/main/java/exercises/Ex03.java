package exercises;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

import bean.Student;

public class Ex03 {
	private static final String path = "student/student.txt";
	private static List<Student> data;
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		File file = createFile(path);
		data = getAllStudents();
		menu(file);
	}

	private static File createFile(String path) {
		File file = new File(path);
		try {
			if (!file.exists()) {
				File parent = file.getParentFile();
				if (!parent.exists()) {
					parent.mkdirs();
				}
				file.createNewFile();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return file;
	}

	private static List<Student> getAllStudents() {
		List<Student> list = new ArrayList<>();
		list.add(new Student("S1", "Huy", 9.0));
		list.add(new Student("S2", "Quang", 8.0));
		list.add(new Student("S3", "Quyen", 9.5));
		list.add(new Student("S4", "Ngan", 7.5));
		list.add(new Student("S5", "Vu", 6.0));
		list.add(new Student("S6", "Thang", 6.5));
		return list;
	}

	private static void menu(File file) {
		while (true) {
			System.out.println("==========================");
			System.out.println("=== Student management ===");
			System.out.println("1. Add");
			System.out.println("2. Delete");
			System.out.println("3. Update");
			System.out.println("4. Display");
			System.out.println("5. Exit");
			int choice = Integer.parseInt(sc.nextLine());
			switch (choice) {
			case 1:
				System.out.println("Enter ID: ");
				String id = sc.nextLine();
				System.out.println("Enter name: ");
				String name = sc.nextLine();
				System.out.println("Enter GPA: ");
				double gpa = Double.parseDouble(sc.nextLine());
				add(file, new Student(id, name, gpa));
				System.out.println("Adding student successfully!");
				break;
			case 2:
				System.out.println("Enter id that want to delete: ");
				String idDelete = sc.nextLine();
				delete(file, idDelete);
				System.out.println("Deleting student successfully!");
				break;
			case 3:
				System.out.println("Enter id that need to update: ");
				String idNeedUpdate = sc.nextLine();
				System.out.println("Enter new ID ");
				String idUpdate = sc.nextLine();
				System.out.println("Enter new name: ");
				String nameUpdate = sc.nextLine();
				System.out.println("Enter new GPA: ");
				double gpaUpdate = Double.parseDouble(sc.nextLine());
				update(file, idNeedUpdate, new Student(idUpdate, nameUpdate, gpaUpdate));
				System.out.println("Updating student successfully!");
				break;
			case 4:
				System.out.println("Student list: ");
				display(file);
				break;
			default:
				return;
			}
		}
	}

	private static void writeData(File file, List<Student> data) {
		List<String> dataAsString = data.stream().map(Student::toLine).collect(Collectors.toList());
		try {
			Files.write(Paths.get(file.getPath()), dataAsString);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static List<Student> readLines(Path path, Function<String, Student> func) {
		List<Student> result = new ArrayList<>();
		try {
			List<String> lines = Files.readAllLines(path);
			for (String line : lines) {
				Optional<Student> opt = Optional.ofNullable(func.apply(line));
				if (opt.isPresent()) {
					result.add(opt.get());
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	private static void display(File file) {
		readLines(Paths.get(file.getPath()), Student::transfer).forEach(System.out::println);
	}

	private static void add(File file, Student s) {
		data.add(s);
		writeData(file, data);
	}

	private static void delete(File file, String id) {
		data = readLines(Paths.get(file.getPath()), Student::transfer);
		data.removeIf(s -> id.equals(s.getId()));
		writeData(file, data);
	}

	private static void update(File file, String id, Student sUpdate) {
		data = readLines(Paths.get(file.getPath()), Student::transfer);
		for (Student s : data) {
			if (id.equals(s.getId())) {
				s.setId(sUpdate.getId());
				s.setFullname(sUpdate.getFullname());
				s.setGpa(sUpdate.getGpa());
			}
		}
		writeData(file, data);
	}
}
