package ddl;

import java.io.File;
import java.io.FileFilter;
import java.nio.file.Files;
import java.util.Random;

import utils.FileUtils;

public class Ex02 {
	private static final String path = "random";
	public static void main(String[] args) {
		//createFiles("random", 20);
		
		
		File[] roots = File.listRoots();
		FileUtils.print(roots);
		
		System.out.println("==================================");
		
		File dir = new File(path);
		File[] dirFiles = dir.listFiles();
		FileUtils.print(dirFiles);
		
		System.out.println("==================================");
		
		File[] dirPdfFiles = dir.listFiles(file -> file.isFile() && file.getName().endsWith("pdf"));
		FileUtils.print(dirPdfFiles);
	}
	
	public static void createFiles(String dirPath, int numbeOfiles) {
		Random rd = new Random();
		String[] exts = {".mp3", ".txt", ".pdf", ".bat"};
		for(int i =0; i < numbeOfiles; i++) {
			String path = dirPath + File.separator + "f" + i + exts[rd.nextInt(exts.length)] ;
			FileUtils.createFile(path);
		}
	}
}
