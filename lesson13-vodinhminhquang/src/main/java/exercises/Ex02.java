package exercises;

import java.io.File;
import java.io.IOException;
import java.util.Random;

public class Ex02 {
	private static final String currentFolder = "images";
	private static final String[] extensions = { ".png", ".jpg" };

	public static void main(String[] args) {
		File file = new File(currentFolder);
//		createFiles(currentFolder, 30);
		incrementingFiles(file, ".png");
		incrementingFiles(file, ".jpg");
	}

	private static void incrementingFiles(File file, String suffix) {
		File[] pngList = file.listFiles(f -> f.isFile() && f.getName().endsWith(suffix));
		File newFile = null;
		for (int i = 0; i < pngList.length; i++) {
			newFile = new File(currentFolder + File.separator + i + suffix);
			pngList[i].renameTo(newFile);
		}
	}

	private static void createFiles(String path, int numberOfFiles) {
		Random rand = new Random();

		for (int i = 0; i < numberOfFiles; i++) {
			String pathToTheseFiles = currentFolder + File.separator + i + extensions[rand.nextInt(extensions.length)];
			File file = new File(pathToTheseFiles);
			try {
				file.createNewFile();
				System.out.println("Create file successfully!!!");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
