package ex;

import java.io.File;
import java.io.IOException;
import java.util.Random;

public class Ex02 {
	private static final String path = "images";
	private static final String File_Dir = "images";

	private static final String File_Jpg_Ext = ".jpg";
	private static final String File_Png_Ext = ".png";

	public static void main(String[] args) {
		createDir(File_Dir);
		createFiles(path, 30);
		renameFiles();
	}

	private static File createDir(String path) {
		File dir = new File(path);
		dir.mkdirs();
		System.out.println("Successfully!!!");
		return dir;
	}

	private static void renameFiles() {
		File folder = new File(File_Dir);
		File fList[] = folder.listFiles();
		for (int i = 0; i < fList.length; i++) {
			if (fList[i].getName().endsWith(File_Jpg_Ext)) {
				try {
					File newfile = new File(File_Dir + "\\" + (i + 1) + File_Jpg_Ext);

					if (fList[i].renameTo(newfile)) {

						System.out.println("Rename successful: " + i + File_Jpg_Ext);
					} else {
						System.out.println("Rename failed");
					}

				} catch (Exception e) {
					e.printStackTrace();
				}
			} else if (fList[i].getName().endsWith(File_Png_Ext)) {
				try {
					File newfile = new File(File_Dir + "\\" + (i + 1) + File_Png_Ext);
					if (fList[i].renameTo(newfile)) {
						System.out.println("Rename successful: " + i + File_Png_Ext);
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
				System.out.println("Successfully!!!");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return file;
	}
}