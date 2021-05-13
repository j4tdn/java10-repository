package part1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Random;

public class Ex01 {
	private static final String FILE_DIR = "garbage";

	private static final String folders_IMAGE = "garbage\\image";
	private static final String folders_CODING = "garbage\\coding";
	private static final String folders_MUSIC = "garbage\\music";
	private static final String folders_SYSTEM = "garbage\\system";

	private static final String FILE_TEXT_EXT = ".txt";
	private static final String FILE_BAT_EXT = ".bat";
	private static final String FILE_MP3_EXT = ".mp3";
	private static final String FILE_MP4_EXT = ".mp4";
	private static final String FILE_JPG_EXT = ".jpg";
	private static final String FILE_JPEG_EXT = ".jpeg";
	private static final String FILE_PNG_EXT = ".png";
	private static final String FILE_JAVA_EXT = ".java";

	public static void main(String[] args) {

		System.out.println("===============================");
		createDir(FILE_DIR);
		System.out.println("===============================");
		createDir(folders_CODING);
		createDir(folders_IMAGE);
		createDir(folders_MUSIC);
		createDir(folders_SYSTEM);
		System.out.println("===============================");
		createFiles(FILE_DIR, 20);
		moveFiles();
		System.out.println("===============================");
		deleteFiles();
		System.out.println("===============================");
		coppyFiles();
	}

	private static void createFiles(String dirPath, int nofiles) {
		Random rd = new Random();
		String[] exts = { ".png", ".jpg", ".jpeg", ".mp3", ".mp4", ".bat", ".java", ".txt" };
		for (int i = 0; i < nofiles; i++) {
			String path = dirPath + File.separator + System.currentTimeMillis() + i + exts[rd.nextInt(exts.length)];
			createFile(path);
		}
	}

	private static File createFile(String path) {
		File file = new File(path);
		try {
			if (!file.exists()) {
				File parent = file.getParentFile();
				if (!parent.exists()) {
					parent.mkdirs();
				}
				file.createNewFile();
				System.out.println("File is created successfully!!!");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return file;
	}

	private static File createDir(String path) {
		File dir = new File(path);
		dir.mkdirs();
		System.out.println();
		return dir;
	}

	private static void deleteFiles() {
		File folder = new File(FILE_DIR);
		File fList[] = folder.listFiles();
		for (File f : fList) {
			if (f.getName().endsWith(FILE_TEXT_EXT)) {
				f.delete();
				System.out.println("Delete file" + FILE_TEXT_EXT + " successfully");
			}
		}
	}

	private static void moveFiles() {
		File folder = new File(FILE_DIR);
		File fList[] = folder.listFiles();
		for (File f : fList) {
			if (f.getName().endsWith(FILE_MP3_EXT) || f.getName().endsWith(FILE_MP4_EXT)) {
				f.renameTo(new File(folders_MUSIC, f.getName()));
				System.out.println("move file" + FILE_MP4_EXT + FILE_MP3_EXT + " to image folder successfully");
			} else if (f.getName().endsWith(FILE_JPG_EXT) || f.getName().endsWith(FILE_JPEG_EXT)
					|| f.getName().endsWith(FILE_PNG_EXT)) {
				f.renameTo(new File(folders_IMAGE, f.getName()));
				System.out.println("move file to image folder successfully");
			} else if (f.getName().endsWith(FILE_BAT_EXT)) {
				f.renameTo(new File(folders_SYSTEM, f.getName()));
				System.out.println("move file" + FILE_BAT_EXT + " vào system folder successfully");
			}
		}
	}

	private static void coppyFiles() {
		File old_folder = new File(FILE_DIR);
		File fList[] = old_folder.listFiles();
		for (File f : fList) {
			File new_folder = new File(folders_CODING + File.separator + f.getName());
			if (f.getName().endsWith(FILE_JAVA_EXT)) {
				System.out.println(f.toPath());
				try {
					Files.copy(f.toPath(), new_folder.toPath(), StandardCopyOption.REPLACE_EXISTING);
				} catch (IOException e) {
					e.printStackTrace();
				}
				System.out.println("Coppy file" + FILE_JAVA_EXT + " successfully");
			}
		}

	}
}
