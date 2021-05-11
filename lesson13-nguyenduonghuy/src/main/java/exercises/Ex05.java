package exercises;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Ex05 {
	private static Scanner sc = new Scanner(System.in);
	private static Random rd = new Random();

	public static void main(String[] args) {
		File file = new File("input.txt");

		int[][] arr = getArray2D(5, 4);
		pritnf(arr);
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
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static List<String> toListString(int[][] arr) {
		List<String> data = new ArrayList<>();
		
		return data;
	}
}
