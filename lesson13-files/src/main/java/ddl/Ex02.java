package ddl;

import java.io.File;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Random;

import utils.FileUtils;

public class Ex02 {
	private static final String path = "random";
	
	public static void main(String[] args) {
		// createFiles("random", 20);
		File[] roots = File.listRoots();
		FileUtils.print(roots);
		
		File dir = new File(path);
		File[] dirFile = dir.listFiles();
		
		FileUtils.print(dirFile);
		
		System.out.println("================================================");
		File[] dirPdfFiles = dir.listFiles(file -> file.isFile() && file.getName().endsWith("pdf")); 
		
		FileUtils.print(dirPdfFiles);
		
	}
	
	@SuppressWarnings("unused")
	private static void createFiles(String dirPath, int nofile) {
		Random rand = new Random();
		String[] exts = {".mp3", ".txt", ".pdf", ".bat"};
		
		for(int i = 0; i < nofile; i++) {
			String path = dirPath + File.separator + "f" 
								+ i + exts[rand.nextInt(exts.length)];
			FileUtils.createFile(path);
		}
	}
}
