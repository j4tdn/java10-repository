package exercises;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ex04 {
	private static final String path_input = "exercise 04/input.txt";
	private static final String path_output = "exercise 04/output.txt";
	
	public static void main(String[] args) throws IOException {
		File fileInput = createFile(path_input);
		File fileOutput = createFile(path_output);
		
		// read data from input.txt
		List<Integer> data = readData(fileInput, l -> transfer(l));
		data.forEach(System.out::println);
		
		// write data into output.txt
		List<String> dataAsString = data.stream().map(String::valueOf).collect(Collectors.toList());
		writeData(fileOutput, dataAsString);
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
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return file;
	}
	
	private static void writeData(File file, List<String> data) {
		try {
			Files.write(Paths.get(file.getPath()), data);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static List<Integer> readData(File file, Function<String, List<Integer>> func) {
		List<Integer> data = new ArrayList<>();
		try {
			List<String> lines = Files.readAllLines(Paths.get(file.getPath()));
			for (String line : lines) {
				Optional<List<Integer>> opt = Optional.ofNullable(func.apply(line));
				if (opt.isPresent()) {
					data.addAll(opt.get());
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return data.stream().sorted().collect(Collectors.toList());
	}
	
	private static List<Integer> transfer(String line) {
		return Arrays.stream(line.strip().split("[a-zA-Z]+"))
					.filter(i -> i == null || !i.equalsIgnoreCase(""))
					.map(Integer::parseInt)
					.collect(Collectors.toList());
	}
}
