package utils;

import java.util.Arrays;

import sorting.SortOrder;

public class ArrayUtils {
	public ArrayUtils() {
	}

	// for-index
	public static void forIndex(int[] items) {
		System.out.println();
		for (int i = 0; i < items.length; i++) {
			System.out.print("a[" + i + "] = " + items[i] + " ");
		}
	}

	// for-each
	public static void forEach(int[] items) {
		System.out.println();
		for (int item : items) {
			System.out.print(item + " ");
		}
	}

	public static void forEachString(String[] items) {
		System.out.println();
		for (String item : items) {
			System.out.print(item + " ");
		}
	}

	public static void forIndex2D(int[][] items) {
		System.out.println();
		for (int row = 0; row < items.length; row++) {
			for (int col = 0; col < items[row].length; col++) {
				System.out.print(items[row][col] + " ");
			}
			System.out.println();
		}
	}

	public static int[] sort(int[] items) {
		for (int i = 0; i < items.length; i++) {
			// out: bubble element
			for (int j = i + 1; j < items.length; j++) {
				if (items[i] > items[j]) {
					int tmp = items[i];
					items[i] = items[j];
					items[j] = tmp;
				}
			}
		}
		return items;
	}

	public static void bubbleSort(int[] numbers) {
		// pivot: out
		for (int out = numbers.length - 1; out > 0; out--) {
			for (int in = 0; in < out; in++) {
				if (numbers[in] < numbers[out]) {
					int tmp = numbers[out];
					numbers[out] = numbers[in];
					numbers[in] = tmp;
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

	public static void reverse(int[] numbers) {
		for (int i = 0; i < numbers.length / 2; i++) {
			int tmp = numbers[i];
			numbers[i] = numbers[numbers.length - i - 1];
			numbers[numbers.length - i - 1] = tmp;
		}
	}

	public static void bubbleSort(String[] sequences) {
		for (int out = sequences.length - 1; out > 0; out--) {
			// null fist

			for (int in = 0; in < out; in++) {
				if (sequences[in].compareTo(sequences[out]) > 0) {
					String tmp = sequences[in];
					sequences[in] = sequences[out];
					sequences[out] = tmp;
				}
			}
		}
	}

	public static void bubbleSortNullF(String[] sequences) {
		for (int out = sequences.length - 1; out > 0; out--) {
			// null fist
			for (int in = 0; in < out; in++) {
				if (sequences[in] == null) {
					continue;
				}
				if (sequences[out] == null || sequences[in].compareTo(sequences[out]) > 0) {
					String tmp = sequences[in];
					sequences[in] = sequences[out];
					sequences[out] = tmp;
				}
			}
		}
	}
  
	public static void bubbleSortNullLast(String[] sequences) {
		for (int out = sequences.length - 1; out > 0; out--) {
			// null fist
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
				if (sequences[in].compareTo(sequences[out]) > 0) {
					String tmp = sequences[in];
					sequences[in] = sequences[out];
					sequences[out] = tmp;
				}
			}
		}
	}
     // 1 2 null 8 3 4 null
	// 1 2 4 null 3 8 null
}
