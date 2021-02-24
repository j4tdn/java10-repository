package utils;

import java.util.Arrays;

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

	public static void bubbleSort(String[] sequences) {
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

	public static void sort1(int[] items, sortOrder order) {
		Arrays.sort(items);
		if (order == sortOrder.DESC) {
			reverse1(items);
		}
	}

	public static void reverse1(int[] items) {
		for (int i = 0; i < items.length / 2; i++) {
			int tmp = items[i];
			items[i] = items[items.length - i - 1];
			items[items.length - i - 1] = tmp;
		}
	}

	public enum sortOrder {
		ASC, DESC
	}
}
