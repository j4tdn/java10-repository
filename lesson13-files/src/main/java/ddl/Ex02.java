package ddl;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.Random;

import utils.FileUtils;

public class Ex02 {
	public static void main(String[] args) {
		// createFiles("random" , 20);
		File[] roots = File.listRoots();
		FileUtils.print(roots);
		
		
		
		File dir= new File(path);
		File[] dirFiles = dir.listFiles();
		FileUtils.print(dirFiles);
		
		File[] dirPdfFiles = dir.listFiles(file -> file.isFile() && file.getName().endsWith("pdf")); 
			FileUtils.print(dirPdfFiles);
					
	}
			
	public static void createFiles(String dirpath, int nofiles) {
		Random rd = new Random();
		String[] exts = {".mp3", ".txt", ".pdf", ".bat "};
		for (int i= 0; i< nofiles; i++) {
			String path = dirpath + File.separator + "f" + i + exts[rd.nextInt(exts.length)];
			FileUtils.createFile(path);
			
		}
		
	}
	
	
}
