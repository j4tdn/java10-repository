package utils;

import java.util.Arrays;

import sorting.SortOrder;

public class ArrayUtils {
	public static void bubbleSort(String[] sequences) {
		//pivot: out
		for(int out = sequences.length - 1; out > 0; out--) {
			if(sequences[out] == null) {
				continue;
			}
			
			for(int in = 0; in < out; in ++) {
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
	
	public static void sort(int[] numbers, SortOrder order) {
		Arrays.sort(numbers);
		if(order == SortOrder.DESC) {
			reverse(numbers);
		}
	}
	
	private static void reverse(int[] numbers) {
		for(int i = 0; i < numbers.length/2;i++) {
			int tmp = numbers[i];
			numbers[i] = numbers[numbers.length-i-1];
			numbers[numbers.length-i-1] = tmp;
		}
	}
}
