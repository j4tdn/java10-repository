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
	
	public static void printf(File ...files) {
		Arrays.stream(files).forEach(f -> System.out.println(f.getAbsoluteFile()));
	}
}
