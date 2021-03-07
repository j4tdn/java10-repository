package sorting;

import java.util.Arrays;

public class Utils {
	public static void InsertionSort(int[] numbers) {
		int key, j;
		// marker
		for (int i = 1; i < numbers.length; i++) {
			// Select the first unsorted element
			key = numbers[i];
			j = i - 1;
			while (j >= 0 && numbers[j] > key) {
				numbers[j + 1] = numbers[j];
				j--;
			}
			numbers[j + 1] = key;
		}
	}
	
	public static void BubbleSort(int[] numbers) {
		for(int i = 0; i < numbers.length - 1; i++) {
			for(int j = i + 1; j < numbers.length; j++) {
				if(numbers[i] > numbers[j]) {
					int tmp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = tmp;
				}
			}
		}
	}
	
	public static void SelectionSort(int[] numbers) {
		// i ~ anchor for the border between sorted and unsorted elements
		for(int i = 0; i < numbers.length - 1; i++) {
			// anchor: marking the smallest number
			int smallest = i;
			for(int j = i + 1; j < numbers.length; j++) {
				if(numbers[smallest] > numbers[j]) {
					smallest = j;
				}
			}
			int tmp = numbers[i];
			numbers[i] = numbers[smallest];
			numbers[smallest] = tmp;
		}
	}
	
	public static int[] MergeSort(int[] numbers) {
		int[] left = Arrays.copyOfRange(numbers, 0, numbers.length / 2);
		int[] right = Arrays.copyOfRange(numbers, numbers.length / 2, numbers.length);
		
		Arrays.sort(left);
		Arrays.sort(right);
		
		int i1 = 0;
		int i2 = 0;
		
		int[] result = new int[numbers.length];
		for(int i = 0; i < numbers.length; i++) {
			// case 1: right is all put into result array
			// case 2: make sure for not being out of bound situation 
			// and if value of i1 is smaller than value of i2 --> put the smaller one into result array
			if(i2 >= right.length || (i1 < left.length && left[i1] <= right[i2])) {
				result[i] = left[i1];
				i1++;
			} else { //right[i2] < left[i1]
				result[i] = right[i2];
				i2++;
			}
		}
		return result;
	}
}
