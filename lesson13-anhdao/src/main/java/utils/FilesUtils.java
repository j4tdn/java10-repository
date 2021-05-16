package utils;

import java.io.File;
import java.io.IOException;
import java.util.Random;

public class FilesUtils {
	private FilesUtils() {
	}
//	public static File readLines(String path) {
//		
//	}
	public static File createFile(String path) {
		File file = new File(path);
		try {
			if (!file.exists()) {
				file.createNewFile();
				System.out.println("File is created successfully !!!");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return file;
	}

	public static void createFiles(String dirpath, int nofiles, String... exts) {
		Random rd = new Random();
		for (int i = 0; i <= nofiles; i++) {
			String path = dirpath + File.separator + "f"+ i+ System.currentTimeMillis() + exts[rd.nextInt(exts.length)];
			createFile(path);
		}
	}

	public static File createDir(String path) {
		File dir = new File(path);
		dir.mkdirs();
		return dir;
	}
}
