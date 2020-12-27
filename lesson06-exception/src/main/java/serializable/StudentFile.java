package serializable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class StudentFile {
	public static void main(String[] args) {
		Path path = Paths.get("data.txt");
		Student stu1 = new Student("101", "Huy");
		Student stu2 = new Student("201", "Ngan");
		try {
			FileOutputStream fos = new FileOutputStream(path.toFile());
			ObjectOutputStream oos =new ObjectOutputStream(fos);
			
			oos.writeObject(Arrays.asList(stu1, stu2));
			
			// close and save
			oos.close();
			fos.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
			System.out.println("============");
	}
}
