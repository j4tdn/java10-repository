package serializable;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class StudentFile {
	public static void main(String[] args) {
		Path path  = Paths.get("data.txt");
		Student first = new Student("102", "An");
		Student second = new Student("206", "Ben");
		try {
			FileOutputStream fos = new FileOutputStream(path.toFile());
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(Arrays.asList(first, second));
			
			// close and save file
			oos.close();
			fos.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		System.out.println("==============");
		
	}
}
