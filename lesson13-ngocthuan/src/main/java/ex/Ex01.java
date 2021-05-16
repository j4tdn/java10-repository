package ex;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Random;

public class Ex01 {
	private static final String File_Dir = "garbage";

	private static final String folders_Image = "garbage\\image";
	private static final String folders_Coding = "garbage\\coding";
	private static final String folders_Music = "garbage\\music";
	private static final String folders_System = "garbage\\system";

	private static final String File_Text_Ext = ".txt";
	private static final String File_Bat_Ext = ".bat";
	private static final String File_Mp3_Ext = ".mp3";
	private static final String File_Mp4_Ext = ".mp4";
	private static final String File_Jpg_Ext = ".jpg";
	private static final String File_Jpeg_Ext = ".jpeg";
	private static final String File_Png_Ext = ".png";
	private static final String File_Java_Ext = ".java";

	public static void main(String[] args) {

		System.out.println("===============================");
		createDir(File_Dir);
		System.out.println("===============================");
		createDir(folders_Coding);
		createDir(folders_Image);
		createDir(folders_Music);
		createDir(folders_System);
		System.out.println("===============================");
		createFiles(File_Dir, 20);
		move();
		System.out.println("===============================");
		delete();
		System.out.println("===============================");
		coppy();
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

	private static void delete() {
		File folder = new File(File_Dir);
		File fList[] = folder.listFiles();
		for (File f : fList) {
			if (f.getName().endsWith(File_Text_Ext)) {
				f.delete();
				System.out.println("Delete file" + File_Text_Ext + " successfully");
			}
		}
	}

	private static void move() {
		File folder = new File(File_Dir);
		File fList[] = folder.listFiles();
		for (File f : fList) {
			if (f.getName().endsWith(File_Mp3_Ext) || f.getName().endsWith(File_Mp4_Ext)) {
				f.renameTo(new File(folders_Music, f.getName()));
				System.out.println("move file" + File_Mp4_Ext + File_Mp3_Ext + " to image folder successfully");
			} else if (f.getName().endsWith(File_Jpg_Ext) || f.getName().endsWith(File_Jpeg_Ext)
					|| f.getName().endsWith(File_Png_Ext)) {
				f.renameTo(new File(folders_Image, f.getName()));
				System.out.println("move file to image folder successfully");
			} else if (f.getName().endsWith(File_Bat_Ext)) {
				f.renameTo(new File(folders_System, f.getName()));
				System.out.println("move file" + File_Bat_Ext + " vào system folder successfully");
			}
		}
	}

	private static void coppy() {
		File old_folder = new File(File_Dir);
		File fList[] = old_folder.listFiles();
		for (File f : fList) {
			File new_folder = new File(folders_Coding + File.separator + f.getName());
			if (f.getName().endsWith(File_Java_Ext)) {
				System.out.println(f.toPath());
				try {
					Files.copy(f.toPath(), new_folder.toPath(), StandardCopyOption.REPLACE_EXISTING);
				} catch (IOException e) {
					e.printStackTrace();
				}
				System.out.println("Coppy file" + File_Java_Ext + " successfully");
			}
		}

	}
}