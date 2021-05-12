package exercises;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;


public class Ex05 {
	private static final String path = "exercise 03" + File.separator + "input.txt";
	private static Random rd = new Random();

	public static void main(String[] args) throws IOException {
		File file = createFile(path);

		int[][] arr = getArray2D(5, 4);
		pritnf(arr);
		
		List<String> data = toListString(arr);
		writeData(file, data);
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
			System.out.println("Write file successfully!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static int[][] getArray2D(int row, int col) {
		int[][] arr = new int[row][col];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = rd.nextInt(10);
			}
		}
		return arr;
	}
	
	private static void pritnf(int[][] arr) {
		System.out.println("Array 2D: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static List<String> toListString(int[][] arr) {
		String[] dataString = {"", "", "", "", ""};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				dataString[i] += arr[i][j] + " ";
			}
		}
		return Arrays.stream(dataString)
					.map(d -> d.trim())
					.collect(Collectors.toList());
	}
}
