package utils;

import java.util.Arrays;

import sorting.SortOrder;

public class ArrayUtils {
	private ArrayUtils() {

	}

	// for-index
	public static void forIndex(int[] items) {
		System.out.println();
		for (int i = 0; i < items.length; i++) {
			System.out.print("a[" + i + "] = " + items[i] + "  ");
		}
	}

	// for-each
	public static void forEach(int[] items) {
		System.out.println();
		for (int item : items) {
			System.out.print(item + " ");
		}
	}

	public static void forIndex2D(int[][] items) {
		for (int row = 0; row < items.length; row++) {
			for (int col = 0; col < items[row].length; col++) {
				System.out.print(items[row][col] + " ");
			}
			System.out.println();
		}
	}

	public static void getOdd(int[] items) {
		System.out.println("Các số lẻ trong mảng: ");
		for (int i = 0; i < items.length; i++) {
			if (items[i] % 2 != 0) {
				System.out.println(items[i]);
			}
		}
	}

	public static void getEven(int[] items) {
		System.out.println();
		System.out.println("Các số chẵn trong mảng: ");
		for (int i = 0; i < items.length; i++) {
			if (items[i] % 2 == 0) {

				System.out.println(items[i]);
			}
		}
	}

	// giảm dần
	public static void bubbleSort(int[] numbers) {
		// pivot: out
		for (int out = numbers.length - 1; out > 0; out--) {
			for (int in = 0; in < out; in++) {
				if (numbers[in] < numbers[out]) {
					int tmp = numbers[in];
					numbers[in] = numbers[out];
					numbers[out] = tmp;
				}
			}
		}
	}

	public static void sort(int[] numbers, SortOrder order) {
		Arrays.sort(numbers);
		if (order == SortOrder.DESC) {
			reverse(numbers);
		}
	}

	private static void reverse(int[] numbers) {
		for (int i = 0; i < numbers.length / 2; i++) {
			int tmp = numbers[i];
			numbers[i] = numbers[numbers.length - i - 1];
			numbers[numbers.length - i - 1] = tmp;
		}
	}

	public static void bubbleSort(String[] sequences) {
		// pivot: out
		for (int out = sequences.length - 1; out > 0; out--) {
			if (sequences[out] == null) {
				continue;
			}
			for (int in = 0; in < out; in++) {
				if (sequences[in] == null) {
					String tmp = sequences[in];
					sequences[in] = sequences[out];
					sequences[out] = tmp;
					break;
				}
				if (sequences[in] == null || sequences[in].compareTo(sequences[out]) > 0) {
					String tmp = sequences[in];
					sequences[in] = sequences[out];
					sequences[out] = tmp;
				}
			}
		}
	}
}
