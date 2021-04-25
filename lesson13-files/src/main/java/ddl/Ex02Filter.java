package ddl;

import java.io.File;
import java.util.Random;

import utils.FileUtils;

public class Ex02Filter {
	private static final String path = "random";

	public static void main(String[] args) {
//		createFiles("random", 20);
		File[] roots = File.listRoots();
		FileUtils.printf(roots);
		System.out.println("================");

		File dir = new File(path);
		File[] list = dir.listFiles();
		FileUtils.printf(list);
		System.out.println("================");

		File[] listFilter = dir.listFiles(f -> f.isFile() && f.getName().endsWith("pdf"));
		FileUtils.printf(listFilter);
	}

	public static void createFiles(String dirPath, int nof) {
		Random rd = new Random();
		String[] exts = { ".mp3", ".txt", ".pdf", ".bat" };
		for (int i = 0; i < nof; i++) {
			String path = dirPath + File.separator + "f" + i + exts[rd.nextInt(exts.length)];
			FileUtils.createFile(path);
		}
	}
}
