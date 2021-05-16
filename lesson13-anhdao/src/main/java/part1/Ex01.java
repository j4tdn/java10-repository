package part1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Random;

import utils.FilesUtils;
import static utils.FilesUtils.*;

public class Ex01 {
	private static final String dirPath = "garbage";

	public static void main(String[] args) {
		// created “garbage” folder
		File folder1 = createDir(dirPath);

		// In “garbage” folder:
		// + created 4 folders,
		String[] folder2 = { "image", "music", " system", " coding" };
		for (int i = 0; i < folder2.length; i++) {
			createDir(dirPath + File.separator + folder2[i]);
		}
		// + 20 files
		String[] exts1 = { ".png", ".jpg", ".jpeg", ".mp3", ".mp4", ".bat", ".java", ".txt" };

		// createFiles(dirPath, 20, exts1);

		// 1. Move files as required
		
		//.bat --> system
		moveFile(folder1, exts1[5], folder2[2]);
		//.mp3, .mp4 --> music
		moveFile(folder1, exts1[3], folder2[1]);
		moveFile(folder1, exts1[4], folder2[1]);
		//.png, .jpg, .jpeg ---> image
		moveFile(folder1, exts1[0], folder2[0]);
		moveFile(folder1, exts1[1], folder2[0]);
		moveFile(folder1, exts1[2], folder2[0]);
		
		// 2.Copy .java --> coding
		File [] javaFiles = folder1.listFiles(f ->f.isFile() && f.getName().endsWith(exts1[6])); 
		for (File java: javaFiles) {
			createFile(folder1 + File.separator + folder2[3]+ File.separator + java.getName() );
	}
	    // 3. delete .txt 
		File [] txtFiles = folder1.listFiles(f ->f.isFile() && f.getName().endsWith(exts1[7])); 
		for (File txt: txtFiles) {
			txt.delete();
		}
	}

	public static void moveFile(File folder1, String ext, String folder2Name) {
		File[] extsFiles = folder1.listFiles(f -> f.isFile() && f.getName().endsWith(ext));

		for (File exts : extsFiles) {
			try {
				if (exts.renameTo(new File(folder1 + File.separator + folder2Name + File.separator + exts.getName()))) {
					System.out.println(" File is moved successful!");
				} else {
					System.out.println(" File is failed to moved!");

				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}