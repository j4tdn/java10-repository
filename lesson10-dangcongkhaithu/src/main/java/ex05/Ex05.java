package ex05;

import java.util.Arrays;

public class Ex05 {
	public static void main(String[] args) {
		int[] numbers = { 1, 4, 5, 3, 2, 6 };
		
		//bubbleSort(numbers);
		selectionSort(numbers);
		
		System.out.println(Arrays.toString(numbers));
	}

	// bubble sort
	private static void bubbleSort(int[] numbers) {
		for(int out = numbers.length - 1; out > 0; out-- ) {
			for(int in = 0; in < out; in++) {
				if(numbers[in] > numbers[out]) {
					int tmp = numbers[in];
					numbers[in] = numbers[out];
					numbers[out] = tmp;
				}
			}
		}
	}
	
	//Selection Sort
	private static void selectionSort(int[] numbers) {
		for(int i = 0; i < numbers.length; i++) {
			int min = i;
			for(int j = i+1; j < numbers.length;j++) {
				if(numbers[j] < numbers[min]) {
					min = j;
					int tmp = numbers[i];
					numbers[i] = numbers[min];
					numbers[min] = tmp;
				}
			}
			
		}
	}
}
