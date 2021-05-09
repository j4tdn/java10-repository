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
	private FileUtils() {
	}

	// Definition
	public static File createFile(String path) {
		File file = new File(path);
		try {
			if (!file.exists()) {
				File parent = file.getParentFile();
				if (!parent.exists()) {
					parent.mkdirs();
				}
				file.createNewFile();
				System.out.println("Create file successfully!");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return file;
	}

	public static File createDirectory(String path) {
		File dirFile = new File(path);
		dirFile.mkdirs();
		return dirFile;
	}

	public static boolean delete(String path) {
		File file = new File(path);
		return file.delete();
	}

	public static void info(File file) {
		System.out.println("path: " + file.getPath());
		System.out.println("abs Path: " + file.getAbsolutePath());
		try {
			System.out.println("canonical path: " + file.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static <E> void printf(E... es) {
		Arrays.stream(es).forEach(System.out::println);
	}

	// Manipulation
	public static void writeLine(File file, String... lines) {
		// open file - connection
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(file, true);
			bw = new BufferedWriter(fw);

			// manipulate with file
			for (String student : lines) {
				bw.newLine();
				bw.write(student);
			}

			System.out.println("Write file " + file.getName() + " successfully!");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// save & close
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
			
			// manipulate with file
			String line = "";
			while ((line = br.readLine()) != null) {
				lines.add(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// save & close
			close(br, fr);
		}
		return lines;
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
}
