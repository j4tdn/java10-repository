package exercises;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Ex04 {
	private static final String currentFile = "wickedString.txt";
	private static final String resultFile = "resultFile.txt";

	public static void main(String[] args) {
		File f = new File(currentFile);
		File f2 = new File(resultFile);
		String result = "";
		try {
			List<String> fileAsString = Files.readAllLines(f.toPath());

			for (String temp : fileAsString) {
				Optional<String> opt = Optional.ofNullable(temp);
				if (opt.isPresent()) {
					result = opt.get();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		Path resultFilePath = f2.toPath();
		String[] arr = result.trim().split("[a-z]+");
		try {
			List<Integer> data = Arrays.stream(arr).map(t -> Integer.parseInt(t)).sorted().collect(Collectors.toList());
			List<String> convertedData = data.stream().map(t -> String.valueOf(t)).collect(Collectors.toList());

			Files.write(resultFilePath, convertedData, StandardOpenOption.APPEND);
			System.out.println("Write successfully !!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}