package utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import bean.FileData;

public class FileUtils {
	// private constructor
	// private để tránh bên ngoài tạo đối tượng --> <File>.<Function>
	private FileUtils() {

	}

	// Function<String, R> notifies that we're gonna transform from String to R
	// the way we transform depends on the method we're gonna call in a specific
	// class
	// in this case we gonna use method reference
	public static <R> List<R> readLines(Path path, Function<String, R> func) {
		List<R> result = new ArrayList<>();

		try {
			List<String> traderAsString = Files.readAllLines(path);
			for (String line : traderAsString) {
				// transform from String type to Trader type
				Optional<R> opt = Optional.ofNullable(func.apply(line));
				if (opt.isPresent()) {
					result.add(opt.get());
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	public static <L extends FileData> void writeFiles(Path path, List<L> lines) {
		try {
			List<String> data = lines.stream().map(L::toLine).collect(Collectors.toList());

			Files.write(path, data, StandardOpenOption.APPEND);

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Write " + path.getFileName().toString() + " file successful !");
	}

	public static void writeLines(File file, String... lines) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			// open file - connection
			fw = new FileWriter(file, true);
			// write on file txt
			bw = new BufferedWriter(fw);

			// manipulate with file
			for (String line : lines) {
				bw.newLine();
				bw.write(line);
			}

			System.out.println("Write file" + file.getName() + " successful !!!");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// save and close
			close(bw, fw);
		}
	}

	// tạo một lần trên heap để sử dụng (không cần gọi thông qua đối tượng)
	public static File createFile(String path) {
		File file = new File(path);
		try {
			if (!file.exists()) {
				File parent = file.getParentFile();
				if (!parent.exists()) {
					parent.mkdirs();
				}
				file.createNewFile();
				System.out.println("File is created successfully !!!");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return file;
	}

	public static File createDir(String path) {
		File dir = new File(path);

		dir.mkdirs();

		return dir;
	}

	public static boolean delete(String path) {
		File file = new File(path);
		return file.delete();
	}

	public static void info(File file) {
		System.out.println("path: " + file.getPath());
		System.out.println("absolute path: " + file.getAbsolutePath());
		try {
			System.out.println("canonical path: " + file.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static List<String> readLines(File file) {
		List<String> lines = new ArrayList<>();
		FileReader fr = null;
		BufferedReader br = null;

		try {
			// open file ~ connection
			fr = new FileReader(file);
			br = new BufferedReader(fr);

			String line = null;
			// manipulate with file
			while ((line = br.readLine()) != null) {
				lines.add(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			close(br, fr);
		}
		return lines;
	}

	public static void print(File... files) {
		Arrays.stream(files).forEach(f -> System.out.println(f.getAbsoluteFile()));
	}

	public static <E> void print(List<E> es) {
		es.stream().forEach(System.out::println);
	}

	private static void close(AutoCloseable... closeables) {
		Arrays.stream(closeables).forEach(c -> {
			try {
				c.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}
}
