package ddl;

import java.io.File;
import java.util.Random;

import utils.FilesUtils;

public class Ex02 {
	private static final String path = "random";

	public static void main(String[] args) {
		// createFiles("random", 20);

		File[] roots = File.listRoots();
		FilesUtils.print(roots);
		System.out.println("========================\n");
		File dir = new File(path);
		File[] dirFiles = dir.listFiles();
		FilesUtils.print(dirFiles);
		System.out.println("=========================\n");

		File[] dirPdfFiles = dir.listFiles(file -> file.isFile() && file.getName().endsWith("pdf"));
		FilesUtils.print(dirPdfFiles);

	}

	public static void createFiles(String dirPath, int nofiles) {
		Random rd = new Random();
		String[] exts = { ".mp3", ".txt", ".pdf", ".bat" };
		for (int i = 0; i < nofiles; i++) {
			String path = dirPath + File.separator + "f" + i + exts[rd.nextInt(exts.length)];
			FilesUtils.createFile(path);
		}
	}

}
