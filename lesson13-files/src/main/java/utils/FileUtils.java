package utils;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileUtils {
	private FileUtils() {

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
	public static void print(File ...files) {
		Arrays.stream(files).forEach(f -> System.out.println(f.getName()));
	}
}
