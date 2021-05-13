package part1;

import java.io.File;
import java.io.IOException;
import java.util.Random;

public class Ex02 {
	private static final String path = "images";
	private static final String FILE_DIR = "images";

	private static final String FILE_JPG_EXT = ".jpg";
	private static final String FILE_PNG_EXT = ".png";

	public static void main(String[] args) {
		createDir(FILE_DIR);
		createFiles(path, 30);
		renameFiles();
	}

	private static File createDir(String path) {
		File dir = new File(path);
		dir.mkdirs();
		System.out.println("File is created successfully!!!");
		return dir;
	}

	private static void renameFiles() {
		File folder = new File(FILE_DIR);
		File fList[] = folder.listFiles();
		// File f : fList
		for (int i = 0; i < fList.length; i++) {
			if (fList[i].getName().endsWith(FILE_JPG_EXT)) {
				try {
					File newfile = new File(FILE_DIR + "\\" + (i + 1) + FILE_JPG_EXT);

					if (fList[i].renameTo(newfile)) {

						System.out.println("Rename succesful: " + i + FILE_JPG_EXT);
					} else {
						System.out.println("Rename failed");
					}

				} catch (Exception e) {
					e.printStackTrace();
				}
			} else if (fList[i].getName().endsWith(FILE_PNG_EXT)) {
				try {
					File newfile = new File(FILE_DIR + "\\" + (i + 1) + FILE_PNG_EXT);
					if (fList[i].renameTo(newfile)) {
						System.out.println("Rename succesful: " + i + FILE_PNG_EXT);
					} else {
						System.out.println("Rename failed");
					}

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	private static void createFiles(String dirPath, int nofiles) {
		Random rd = new Random();
		String[] exts = { ".png", ".jpg" };
		for (int i = 0; i < nofiles; i++) {
			String path = dirPath + File.separator + System.currentTimeMillis() + i + exts[rd.nextInt(exts.length)];
			createFile(path);
		}
	}

	private static File createFile(String path) {
		File file = new File(path);
		try {
			if (!file.exists()) {
				File parent = file.getParentFile();
				if (!parent.exists()) {
					parent.mkdirs();
				}
				file.createNewFile();
				System.out.println("File is created successfully!!!");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return file;
	}
}
