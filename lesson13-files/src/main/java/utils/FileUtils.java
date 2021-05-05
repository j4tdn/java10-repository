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

	public static void writeLines(File file, String... lines) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {

			// open file connection
			fw = new FileWriter(file, true);
			bw = new BufferedWriter(fw);
			// manipulate with file
			
			for (String line : lines) {
				bw.newLine();
				bw.write(line);
				
			}

			// save and close

			System.out.println("Write File " + file.getName() + "Write successfully!!!");
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			close(bw, fw);
		}
		
	}
	
	
	private static List<String> readLines(File file) {
		List<String> lines = new ArrayList<>();
		
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			String line = null;
			while((line= br.readLine()) != null) {
				System.out.println(line);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(br, fr);
		}
		return null;
	}

	public static File createFile(String path) {
		File file = new File(path);

		try {
			if (!file.exists()) {
				File parent = file.getParentFile();
				if (!parent.exists()) {
					parent.mkdirs();
				}
				file.createNewFile();
				System.out.println("File is created successfully !!!!!!!!!");
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

	public static boolean detele(String path) {
		File file = new File(path);
		return file.delete();

	}

	public static void info(File file) {
		System.out.println("path: " + file.getPath());
		System.out.println("absolute path: " + file.getAbsolutePath());
		try {
			System.out.println("canonical path : " + file.getCanonicalPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void print(File... files) {
		Arrays.stream(files).forEach(f -> System.out.println(f.getName()));
	}

	public static <E> void print(List<E> es) {
		es.stream().forEach(f -> System.out.println(f.getName()));
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
