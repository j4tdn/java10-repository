package utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileUtils {
	// private constructor
	private FileUtils() {

	}

	public static void writeLines(File file, String... lines) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			// Open file - connection
			fw = new FileWriter(file, true);
			bw = new BufferedWriter(fw);

			// manipulate with file
			for (String line : lines) {
				bw.newLine();
				bw.write(line);
			}

			System.out.println("Write file" + file.getName() + " successful");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// save and close
			close(bw, fw);
		}
	}

	public static List<String> readLines(File file) {
		List<String> lines = new ArrayList<>();
		FileReader fr = null;
		BufferedReader br = null;
		try {
			// open file - connection
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			String line = null;
			while ((line = br.readLine()) != null) {
				lines.add(line);

			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// save and close
			close(br, fr);
		}
		return lines;
	}

	public static File createFile(String path) {
		File file = new File(path);
		try {
			if (!file.exists()) {
				File parent = file.getParentFile();
				System.out.println("parent: " + parent.getPath());
				if (!parent.exists()) {
					parent.mkdirs();
				}
				file.createNewFile();
				System.out.println("File is created successfully !!!");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return file;
	}

	public static File createDir(String path) {
		File dir = new File(path);
		dir.mkdirs();
		return dir;
	}

	public static boolean delete(String path) {
		File file = new File(path);
		return file.delete();
	}

	public static void info(File file) {
		System.out.println("path: " + file.getPath());
		System.out.println("absolute path: " + file.getAbsolutePath());
		try {
			System.out.println("absolute path: " + file.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void print(File... files) {
		Arrays.stream(files).forEach(f -> System.out.println(f.getAbsoluteFile()));
	}

	public static <E> void print(List<E> es) {
		es.stream().forEach(System.out::println);
	}

	public static void close(AutoCloseable... closeables) {
		Arrays.stream(closeables).forEach(c -> {
			try {
				c.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

	}
}
