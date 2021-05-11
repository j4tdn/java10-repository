package part2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ex03 {
	private static String path = "data\\student.txt";
	
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		File file = new File(path);
		
		Student st1 = new Student("1", "DPQ","7");
		Student st2 = new Student("2", "TEO", "8");
		List<Student> students = Arrays.asList(st1, st2);
		
//		writeFiles(file.toPath(), students);
		
		System.out.println("==============ADD=================");
		try {
			addStudent();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("==============PRINT===============");
		Function<String, Student> funct = Student::student;
		List<Student> rStudent = readLines(file.toPath(), funct);
		print(rStudent);
		
		System.out.println("===============DELETE=============");
		deleteStudent();
	}
	
	public static void deleteStudent() {
		try {
			String idDelete;
			System.out.println("Enter id to Delete:");
			idDelete = scanner.next();
			File f = new File("student.txt");
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			File TempFile = new File("student1.txt");
			PrintWriter pw = new PrintWriter(TempFile);
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
//				Files.copy(f.toPath(), new_folder.toPath(), StandardCopyOption.COPY_ATTRIBUTES);
				String[] wordsinline = line.split("-");
				if (wordsinline[0].equals(idDelete)) {
					f.delete();
					pw.write(line);
					TempFile.renameTo(f);
					if (TempFile.renameTo(f))
						System.out.println("Student has been deleted.");
					else
						System.out.println("Cannot delete file.");
				} else {
					pw.println(line);
				}
				line = br.readLine();
			}
			br.close();
			pw.close();
		} catch (IOException ex) {
			System.out.println(ex);
		}
	}
	
	public static void addStudent() throws IOException {
		File file = new File(path);
//		BufferedWriter bw = new BufferedWriter( new FileWriter("naldrix_db.txt",true) );
		Scanner input = new Scanner(System.in);
		
		String id, name ,score_avr;
		
		System.out.print("Enter the student ID: ");
		id = input.nextLine();
		System.out.print("Enter the student Name: ");
		name = input.nextLine();
		System.out.print("Enter the student score: ");
		score_avr = input.nextLine();
//		bw.write(ID+","+name+","+score_avr);
//		bw.flush();
//		bw.newLine();
//		bw.close();
		Student st = new Student(id, name, score_avr);
		List<Student> student = Arrays.asList(st);	
		writeFiles(file.toPath(), student);
	}
	
	
	public static <L extends FileData> void writeFiles(Path path, List<L> lines) {
		try {
			List<String> data = lines.stream().map(L::toLine).collect(Collectors.toList());
			Files.write(path, data, StandardOpenOption.APPEND);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Write " + path.getFileName().toString() + " file successful !");
	}

	public static <T> List<T> readLines(Path path, Function<String, T> func){
		List<T> data = new ArrayList<>();
		try {
			List<String> lines = Files.readAllLines(path);
			for (String line: lines) {
				Optional<T> opt = Optional.ofNullable(func.apply(line));
				if (opt.isPresent()) {
					data.add(opt.get());
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return data;
	}
	
	private static void close(AutoCloseable... closeables) {
		Arrays.stream(closeables).forEach(c -> {
			try {
				c.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}
	public static <E> void print(List<E> es) {
		es.stream().forEach(System.out::println);
	}
}
