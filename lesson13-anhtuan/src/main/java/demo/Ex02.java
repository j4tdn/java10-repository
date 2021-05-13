package demo;

import java.io.File;
import java.io.IOException;
import java.util.Random;

public class Ex02 {
	private static final String currentFolder = "images";
	private static final String[] extensions = { ".png", ".jpg" };

	public static void main(String[] args) {
		File file = new File(currentFolder);
		//createDir(currentFolder);
		//createFiles(currentFolder, 30);
		ascendingFiles(file, ".png");
		ascendingFiles(file, ".jpg");
	}

	private static void ascendingFiles(File file, String suffix) {
		File[] pngList = file.listFiles(f -> f.isFile() && f.getName().endsWith(suffix));
		File newFile = null;
		for (int i = 0; i < pngList.length; i++) {
			newFile = new File(currentFolder + File.separator + i + suffix);
			pngList[i].renameTo(newFile);
		}
	}
	private static File createDir(String path) {
		File dir = new File(path);
		dir.mkdirs();
		System.out.println("File is created successful!");
		return dir;
	}

	private static void createFiles(String path, int nofiles) {
		Random rand = new Random();
		for (int i = 0; i < nofiles; i++) {
			String pathToFiles = currentFolder + File.separator + System.currentTimeMillis()
					+ extensions[rand.nextInt(extensions.length)];
			File file = new File(pathToFiles);
			try {
				file.createNewFile();
				System.out.println("Create file successful!");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}