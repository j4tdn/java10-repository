package utils;

import java.util.Arrays;
import sorting.SortOrder;
public class ArrayUtils {
	public static void main(String[] args) {

	}

//for index
	public static void forIndex(int[] items) {
		for (int i = 0; i < items.length; i++) {
			System.out.print("a[" + i + "]=" + items[i] + "  ");
		}
	}

// for each
	public static void foreach(int[] items) {
		System.out.println();
		for (int item : items) {
			System.out.print(item + " ");
		}
	}
	
	public static void forIndex2D(int[][] items) {
	 for (int row=0; row <items.length;row ++) {
		 for(int col=0;col<items[row].length;col++) {
			 System.out.print(items[row][col] + " ");
		 }
		 System.out.println();
	 }
	}
	public static void bubblesort(int[] numbers) {
		for (int out = numbers.length - 1; out > 0; out--) {
			for (int in = 0; in < out; in++) {
				if (numbers[in] > numbers[out]) {
					// swap
					int tmp = numbers[out];
					numbers[out] = numbers[in];
					numbers[in] = tmp;
				}
			}
		}
	}
	
	public static void bubblesort(String[] sequense) {
		for (int out = sequense.length - 1; out > 0; out--) {
			if (sequense[out] == null) {
				continue;
			}
			for (int in = 0; in < out; in++) {
				if (sequense[in] == null) {
					String tmp = sequense[out];
					sequense[out] = sequense[in];
					sequense[in] = tmp;
					break;
				}
				if (sequense[in].compareTo(sequense[out]) >0 ) {
					// swap
					String tmp = sequense[out];
					sequense[out] = sequense[in];
					sequense[in] = tmp;
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
			numbers[i] = numbers[numbers.length-i-1];
			numbers[numbers.length-i-1] = tmp;
		}
	}
}
