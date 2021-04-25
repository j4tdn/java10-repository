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
			if(!file.exists()) {
			File parent =	file.getParentFile();
			//System.out.println("parent: "+ parent.getPath());
			if(!parent.exists()) {
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
	public static File createDir (String path) {
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
		System.out.println("AbsolutePath: " + file.getAbsolutePath());
		try {
			System.out.println("CanonicalPath: " + file.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void print (File ...files) {
		 Arrays.stream(files).forEach(f-> System.out.println(f.getAbsoluteFile()));
	}
}
