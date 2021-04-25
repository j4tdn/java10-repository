package ddl;

import java.io.File;
import java.util.Random;

import util.FileUtil;

public class Ex02 {
	
	private static final String path = "";
	
	public static void main(String[] args) {
		//createFiles("random", 20);
		File[] roots = File.listRoots();
		FileUtil.print(roots);
		
		File dir = new File(path);
		File[] dirFiles = dir.listFiles();
		FileUtil.print(dirFiles);
		
		File[] dirPdfFiles = dir.listFiles(file -> file.isFile() && file.getName().endsWith(".pdf"));
		FileUtil.print(dirPdfFiles);
		
	}

	public static void createFiles(String dirPath, int numOfFiles) {
		Random rd = new Random();
		String[] exts = { ".mp3", ".txt", ".pdf", ".bat" };
		for (int i = 0; i < numOfFiles; i++) {
			String path = dirPath + File.separator + "f" + i + exts[rd.nextInt(exts.length)];
			FileUtil.createFile(path);
		}
	}
}
