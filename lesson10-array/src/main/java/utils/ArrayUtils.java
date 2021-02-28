package utils;

import java.util.Arrays;

import sorting.SortOrder;

public class ArrayUtils {
	private ArrayUtils() {
		
	}
	// for-index
	public static void forIndex(int[] items) {
		for (int i = 0; i < items.length; i++) {
			System.out.print("items[" + i + "]: " + items[i]);
		}
	}
	
	// for-each
	public static void forEach(int[] items) {
		for (int i : items) {
			System.out.print(i + " ");
		}
	}
	
	public static void forIndex2D(int[][] items) {
		for(int row = 0; row < items.length; row++) {
			for(int col = 0; col < items[row].length; col++) {
				System.out.print(items[row][col] + " ");
			}
		}
	}
	
	public static void bubbleSort(int[] numbers) {
		// pivot: out
		for(int out = numbers.length - 1; out > 0; out--) {
			for(int in = 0; in < out; in++) {
				if(numbers[in] < numbers[out]) {
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
		for(int i = 0; i < numbers.length / 2; i++) {
			int tmp = numbers[i];
			numbers[i] = numbers[numbers.length - i - 1];
			numbers[numbers.length - i - 1] = tmp;
		}
	}
	
	public static void bubbleSort(String[] sequences) {
		// pivot: out
		// null appears in the last position
		for(int out = sequences.length - 1; out > 0; out--) {
			// vị trí đầu bằng null thì bỏ qua vòng lặp thứ out, tiếp tục vòng lặp out - 1
			if(sequences[out] == null) {
				continue;
			}
			for(int in = 0; in < out; in++) {
				if(sequences[in] == null) {
					String tmp = sequences[in];
					sequences[in] = sequences[out];
					sequences[out] = tmp;
					break;
				}
				if(sequences[in].compareTo(sequences[out]) > 0) {
					String tmp = sequences[in];
					sequences[in] = sequences[out];
					sequences[out] = tmp;
				}
			}
		}
	}
}
