package ddl;

import java.io.File;
import java.util.Random;

import utils.FileUtils;

public class Ex02 {
	private static final String path = "random" ;
	public static void main(String[] args) {
//		createFiles("random", 20);
		
		File[] roots = File.listRoots();
		FileUtils.print(roots);
		
		System.out.println("======================");
		File dir = new File(path);
		File[] dirFiles = dir.listFiles();
		FileUtils.print(dirFiles);

		System.out.println("======================");
		File[] dirPdffiles = dir.listFiles(
				file -> file.isFile() && file.getName().endsWith(".pdf"));
			
		FileUtils.print(dirPdffiles);
		}
	
	
	public static void createFiles(String dirpath, int nofiles) {
		Random rd = new Random();
		String[] exts = {".mp3", ".txc", ".pdf", ".bat"};
		for (int i = 0; i < nofiles; i++) {
			String path = dirpath + File.separator + "f" + i + exts[rd.nextInt(exts.length)];
			FileUtils.createFile(path);
		}
		
	}

}
