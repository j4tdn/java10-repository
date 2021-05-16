package part1;

import utils.FilesUtils;
import static utils.FilesUtils.*;

import java.io.File;

public class Ex02 {
	private static final String dirpath = "images";
	private static final String[] exts = { ".jpg", ".png" };

	public static void main(String[] args) {
		File folderOri = createDir(dirpath);

		createFiles(dirpath,30, exts);

		// Rename file
		File[] pngFile = folderOri.listFiles(f -> f.isFile() && f.getName().endsWith(exts[0]));
		for (int i = 0; i < pngFile.length; i++) {
			pngFile[i].renameTo(new File(dirpath + File.separator + Integer.sum(1, i) + exts[0]));
			//pngFile[i].delete();
		}
		File[] jpgFile = folderOri.listFiles(f -> f.isFile() && f.getName().endsWith(exts[1]));
		for (int i = 0; i < jpgFile.length; i++) {
			jpgFile[i].renameTo(new File(dirpath + File.separator + Integer.sum(1, i) + exts[1]));
			//jpgFile[i].delete();
		}

	}

}
