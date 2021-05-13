package demo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Random;

public class Ex01 {
	private static final String currentFolder = "garbage";
	private static final String[] extensions = { ".png", ".jpg", ".jpeg", ".mp3", ".mp4", ".bat", ".java", ".txt" };

	public static void main(String[] args) {
		 //createFiles(currentFolder, 20);
		 createDirectory(currentFolder, 4);

		 // Move
		File[] listImageFiles = findfileType("g");
		moveToDir(listImageFiles, "image");
		System.out.println("============================");

		// Move
		File[] listMp3Files = findfileType(".mp3");
		moveToDir(listMp3Files, "music");
		
		// Move
		File[] listMp4Files = findfileType(".mp4");
		moveToDir(listMp4Files, "music");
		System.out.println("============================");

		// Move
		File[] listBatFiles = findfileType(".bat");
		moveToDir(listBatFiles, "system");
		System.out.println("============================");

		// Copy
		File[] listJavaFiles = findfileType(".java");
		copyToDir(listJavaFiles, "coding");
		System.out.println("============================");

		// Delete
		File[] listTxtFiles = findfileType(".txt");
		deleteFiles(listTxtFiles, currentFolder);
	}

	private static File[] findfileType(String suffix) {
		File filePath = new File(currentFolder);
		File[] listFiles = null;
		for (int i = 0; i < extensions.length; i++) {
			listFiles = filePath.listFiles(pathname -> pathname.isFile() && pathname.getName().endsWith(suffix));
		}
		return listFiles;
	}

	private static void moveToDir(File[] listFiles, String dirName) {
		for (File file : listFiles) {
			Path fromPath = file.toPath();

			File targetFile = new File(currentFolder + File.separator + dirName + File.separator + file.getName());
			Path toPath = targetFile.toPath();
			try {
				Files.move(fromPath, toPath, StandardCopyOption.REPLACE_EXISTING);
				System.out.println("Move " + file.getName() + " successful!");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private static void copyToDir(File[] listFiles, String dirName) {
		for (File file : listFiles) {
			Path fromPath = file.toPath();

			File targetFile = new File(currentFolder + File.separator + dirName + File.separator + file.getName());
			Path toPath = targetFile.toPath();
			try {
				Files.copy(fromPath, toPath, StandardCopyOption.REPLACE_EXISTING);
				System.out.println("Copy " + file.getName() + " successful!");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private static void deleteFiles(File[] listFiles, String dirName) {
		for (File file : listFiles) {
			Path filePath = file.toPath();

			try {
				Files.delete(filePath);
				System.out.println("Delete " + file.getName() + " successful!");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private static void createDirectory(String path, int nofiles) {
		Random rand = new Random();
		String[] folderNames = { "image", "music", "system", "coding" };

		for (int i = 0; i < nofiles; i++) {
			String pathFolders = currentFolder + File.separator + folderNames[rand.nextInt(folderNames.length)];
			File folder = new File(pathFolders);
			folder.mkdirs();
			System.out.println("Create folders successful!");
		}
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
