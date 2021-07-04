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
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Properties;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import bean.FileData;
import bean.Student;

public class FileUtils {
	private FileUtils() {

	}

	public static void writeJson(File file, Object object) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			mapper.writeValue(file, object);
			System.out.println("Write file " + file.getName() + " successful !");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static <T> List<T> readJson(File file, TypeReference<List<T>> typeReference) {
		List<T> result = null;
		ObjectMapper mapper = new ObjectMapper();
		try {
			result = mapper.readValue(file, typeReference);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public static <T> List<T> readJson(File file, Class<List<T>> classType) {
		List<T> result = null;
		ObjectMapper mapper = new ObjectMapper();
		try {
			result = mapper.readValue(file, classType);
		} catch (IOException e) {
			e.printStackTrace();
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

	public static Object readObject(File file) {
		Object result = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);

			result = ois.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileUtils.close(ois, fis);
		}
		return result;
	}

	public static void writeObject(File file, Object object) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);

			oos.writeObject(object);
			System.out.println("Write file " + file.getName() + " successful");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileUtils.close(oos, fos);
		}
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

	public static <L extends FileData> void writeFiles(Path path, List<L> lines) {
		try {
			List<String> data = lines.stream().map(L::toLine).collect(Collectors.toList());
			Files.write(path, data, StandardOpenOption.APPEND);
		} catch (IOException e) {
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
			bw = new BufferedWriter(fw);

			// manipulate with file
			for (String line : lines) {
				bw.newLine();
				bw.write(line);
			}

			System.out.println("Write file " + file.getName() + " sucessful !!!");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// save and close
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
			String line = null;
			while ((line = br.readLine()) != null) {
				lines.add(line);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// close connection
			close(br, fr);
		}

		return lines;
	}

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

	public static void print(File... files) {
		Arrays.stream(files).forEach(f -> System.out.println(f.getAbsoluteFile()));
	}

	public static <E> void print(List<E> es) {
		es.stream().forEach(System.out::println);
	}

	@SuppressWarnings("unchecked")
	public static <T> List<T> safeList(Object object) {
		return (List<T>) object;
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
