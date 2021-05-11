package exercises;

import java.io.File;
import java.io.IOException;
import java.util.Random;

public class Ex02 {
	private static final String path = "images";
	
	public static void main(String[] args) {
		File file = new File(path);
		file.mkdirs();
		getFiles();
		rename(file, ".jpg");
		rename(file, ".png");
	}
	
	private static void getFiles() {
		File f = null;
		String[] extension = {".jpg", ".png"};
		for (int i = 1; i <= 30; i++) {
			try {
				f = new File(path + File.separator + i 
							+ extension[new Random().nextInt(extension.length)]);
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	private static void rename(File file, String extension) {
		File[] files = file.listFiles(f -> f.getName().contains(extension));
		File renameFile = null;
		for (int i = 0; i < files.length; i++) {
			renameFile = new File(path + File.separator + i + "fixed" + extension); 
			files[i].renameTo(renameFile);
		}
	}
}
