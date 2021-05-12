package exercises;

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
		// createFiles(currentFolder, 20);
		// createDirectory(currentFolder, 4);

		// MOVE IMAGE FILEs PROCEDURE
		// select suitable extension of image file
		File[] listImageFiles = findSpecificExtensionFiles("g");
		moveToSpecificDir(listImageFiles, "image");

		// MOVE MUSIC FILEs PROCEDURE
		// select suitable extension of music file
		File[] listMp3Files = findSpecificExtensionFiles(".mp3");
		moveToSpecificDir(listMp3Files, "music");
		File[] listMp4Files = findSpecificExtensionFiles(".mp4");
		moveToSpecificDir(listMp4Files, "music");

		// MOVE BAT FILEs PROCEDURE
		File[] listBatFiles = findSpecificExtensionFiles(".bat");
		moveToSpecificDir(listBatFiles, "system");

		// COPY JAVA FILEs PROCEDURE
		File[] listJavaFiles = findSpecificExtensionFiles(".java");
		copyToSpecificDir(listJavaFiles, "coding");

		// DELETE .TXT FILEs PROCEDURE
		File[] listTxtFiles = findSpecificExtensionFiles(".txt");
		deleteSpecificFiles(listTxtFiles, currentFolder);
	}

	private static File[] findSpecificExtensionFiles(String suffix) {
		File filePath = new File(currentFolder);
		File[] listFiles = null;
		// select suitable extension
		for (int i = 0; i < extensions.length; i++) {
			listFiles = filePath.listFiles(pathname -> pathname.isFile() && pathname.getName().endsWith(suffix));
		}
		return listFiles;
	}

	private static void moveToSpecificDir(File[] listFiles, String dirName) {
		for (File file : listFiles) {
			Path fromPath = file.toPath();

			File targetFile = new File(currentFolder + File.separator + dirName + File.separator + file.getName());
			Path toPath = targetFile.toPath();
			try {
				Files.move(fromPath, toPath, StandardCopyOption.REPLACE_EXISTING);
				System.out.println("Move " + file.getName() + " successfully !!!");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private static void copyToSpecificDir(File[] listFiles, String dirName) {
		for (File file : listFiles) {
			// path of the current position
			Path fromPath = file.toPath();

			// path of the target position
			// path has to refer to the path of specific file
			File targetFile = new File(currentFolder + File.separator + dirName + File.separator + file.getName());
			Path toPath = targetFile.toPath();
			try {
				Files.copy(fromPath, toPath, StandardCopyOption.REPLACE_EXISTING);
				System.out.println("Copy " + file.getName() + " successfully !!!");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private static void deleteSpecificFiles(File[] listFiles, String dirName) {
		for (File file : listFiles) {
			// path of the current position
			Path filePath = file.toPath();

			try {
				Files.delete(filePath);
				System.out.println("Delete " + file.getName() + " successfully !!!");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private static void createDirectory(String path, int numberOfDirectories) {
		Random rand = new Random();
		String[] folderNames = { "image", "music", "system", "coding" };

		for (int i = 0; i < numberOfDirectories; i++) {
			String pathFolders = currentFolder + File.separator + folderNames[rand.nextInt(folderNames.length)];
			File folder = new File(pathFolders);
			folder.mkdirs();
			System.out.println("Create folders successfully !!!");
		}
	}

	private static void createFiles(String path, int numberOfFiles) {
		Random rand = new Random();

		for (int i = 0; i < numberOfFiles; i++) {
			String pathToTheseFiles = currentFolder + File.separator + System.currentTimeMillis()
					+ extensions[rand.nextInt(extensions.length)];
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
