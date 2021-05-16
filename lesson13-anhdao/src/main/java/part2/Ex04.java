package part2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import utils.FilesUtils;

public class Ex04 {
	private static final String path = "data" + File.separator + "input.txt";
	private static final String path1 = "data" + File.separator + "output.txt";

	public static void main(String[] args) {
		// create file input.txt in folder data
		FilesUtils.createFile(path);
		Path inputPath = Paths.get(path);
		
		// create file input.txt in folder data
		File output = FilesUtils.createFile(path1);
		//read file input.txt
		List<Integer> readInput = readLines(inputPath);
		List<String> writeOutput = new ArrayList<>();
		
		//Write file output.txt
		for(Integer rI : readInput) {
			writeOutput.add(String.valueOf(rI));
		}
		writeLines(output, writeOutput);

	}

	private static List<Integer> readLines(Path path) {
		List<Integer> result = new ArrayList<>();
		try {
			List<String> charSequenceLines = Files.readAllLines(path);
			for (int i = 1; i < charSequenceLines.size(); i++) {

				String[] digitChars = charSequenceLines.get(i).split("[a-z]+");
				if (digitChars.length > 500) {
					System.out.println("Invalid !!!");
				} else {
					for (String digitChar : digitChars)
						result.add(Integer.parseInt(digitChar));
				}

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		result.sort((Integer o1, Integer o2) -> o1.compareTo(o2));
		return result;
	}

	public static void writeLines(File file, List<String> digitsList) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			// open file - connection
			fw = new FileWriter(file, true);
			bw = new BufferedWriter(fw);

			// manipulate with file
			for (String line : digitsList) {
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
