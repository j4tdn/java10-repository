package utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Properties;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.fasterxml.jackson.databind.ObjectMapper;

import bean.FileData;

public class FileUtils {
	private FileUtils() {
	}

	// Definition
	public static File createFile(String path) {
		File file = new File(path);
		try {
			if (!file.exists()) {
				File parent = file.getParentFile();
				if (!parent.exists()) {
					parent.mkdirs();
				}
				file.createNewFile();
				System.out.println("Create file successfully!");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return file;
	}

	public static File createDirectory(String path) {
		File dirFile = new File(path);
		dirFile.mkdirs();
		return dirFile;
	}

	public static boolean delete(String path) {
		File file = new File(path);
		return file.delete();
	}

	public static void info(File file) {
		System.out.println("path: " + file.getPath());
		System.out.println("abs Path: " + file.getAbsolutePath());
		try {
			System.out.println("canonical path: " + file.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static <E> void printf(@SuppressWarnings("unchecked") E... es) {
		Arrays.stream(es).forEach(System.out::println);
	}

	// Manipulation
	public static void writeLine(File file, String... lines) {
		// open file - connection
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(file, true);
			bw = new BufferedWriter(fw);

			// manipulate with file
			for (String student : lines) {
				bw.newLine();
				bw.write(student);
			}

			System.out.println("Write file " + file.getName() + " successfully!");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// save & close
			close(bw, fw);
		}
	}

	public static List<String> readLines(File file) {
		List<String> lines = new ArrayList<>();
		FileReader fr = null;
		BufferedReader br = null;

		try {
			// open file - connection
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			// manipulate with file
			String line = "";
			while ((line = br.readLine()) != null) {
				lines.add(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// save & close
			close(br, fr);
		}
		return lines;
	}
	
	public static <E extends FileData> void writeFiles(Path path, List<E> lines) {
		List<String> data = lines.stream().map(E::toLine).collect(Collectors.toList());
		try {
			Files.write(path, data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Write file successfully!");
	}
	
	public static <T> List<T> readLines(Path path, Function<String, T> func) {
		List<T> data = new ArrayList<>();
		try {
			List<String> lines = Files.readAllLines(path);
			for (String line : lines) {
				Optional<T> opt = Optional.ofNullable(func.apply(line));
				if (opt.isPresent()) {
					data.add(opt.get());
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return data;
	}
	
	public static void writeObject(File file, Object obj) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(obj);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(oos, fos);
		}
	}
	
	@SuppressWarnings("unchecked")
	public static <T> List<T> readObject(File file) {
		List<T> result = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			
			result = (List<T>) ois.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(ois, fis);
		}
		return result;
	}
	
	public static Properties getProperties(File file) {
		Properties props = new Properties();
		try {
			props.load(new FileInputStream(file));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return props;
	}
	
	public static void writeJson(File file, Object obj) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			mapper.writeValue(file, obj);
			System.out.println("Write file " + file.getName() + " successfully!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static <T> T readJson(File file, Class<T> classType) {
		T result = null;
		ObjectMapper mapper = new ObjectMapper();
		try {
			result = mapper.readValue(file, classType);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public static void close(AutoCloseable... closeables) {
		Arrays.stream(closeables).forEach(c -> {
			try {
				c.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}
}
