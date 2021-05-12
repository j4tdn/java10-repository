package exercises;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Random;

import org.apache.commons.io.FileUtils;

public class Ex01 {
	private static final String path = "garbage";

	public static void main(String[] args) {
		File file = new File(path);

		getChildFolders();
		getChildFiles();

		String[] image = { ".png", ".jpg", ".jpeg" };
		String[] music = { ".mp3", ".mp4" };
		String[] system = { ".bat" };
		String[] coding = { ".java" };

		moveTo(file, "image", image);
		moveTo(file, "music", music);
		moveTo(file, "system", system);

		copyTo(file, "coding", coding);

		delete(file, ".txt");
	}

	// create 4 child folders
	private static void getChildFolders() {
		File f = null;
		String[] folders = { "image", "music", "system", "coding" };
		for (String folder : folders) {
			f = new File(path + File.separator + folder);
			f.mkdirs();
		}
		System.out.println("Create new child folders successfully!");
	}

	// create child files
	private static void getChildFiles() {
		File f = null;
		String[] extension = { ".png", ".jpg", ".jpeg", ".mp3", ".mp4", ".bat", ".java", ".txt" };
		for (int i = 1; i <= 20; i++) {
			try {
				f = new File(path + File.separator + i + extension[new Random().nextInt(extension.length)]);
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Create new child files successfully!");
	}

	private static void moveTo(File file, String folder, String... extension) {
		for (String ex : extension) {
			File[] files = file.listFiles(f -> f.getName().contains(ex));
			for (File m : files) {
				try {
					Files.move(Paths.get(m.getPath()),
							Paths.get(file.getPath() + File.separator + folder + File.separator + m.getName()),
							StandardCopyOption.REPLACE_EXISTING);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Moving " + ex + " files into " + folder + " successfully!");
		}

	}

	// using org.apache.commons.io
	private static void copyTo(File file, String folder, String... extension) {
		for (String ex : extension) {
			File[] files = file.listFiles(f -> f.getName().contains(ex));
			File destFile = null;
			try {
				for (File c : files) {
					destFile = new File(path + File.separator + folder + File.separator + c.getName());
					FileUtils.copyFile(c, destFile);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("Coping " + ex + " files to " + folder + " successfully!");
		}
	}

	private static void delete(File file, String... extension) {
		for (String ex : extension) {
			File[] files = file.listFiles(f -> f.getName().contains(ex));
			for (File d : files) {
				try {
					Files.delete(Paths.get(d.getPath()));
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Deleting " + ex + " files successfully!");
		}

	}
}
