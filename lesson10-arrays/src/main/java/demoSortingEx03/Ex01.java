package demoSortingEx03;

import java.util.Arrays;

import utils.ArrayUtils;

public class Ex01 {
	public static void main(String[] args) {
		int[] numbers = { 1, 5, 9, 4, 6, 11 };
		//descending
		 bubbleSort(numbers);
		ArrayUtils.forEach(numbers);
		
		System.out.println("===================");
		
		//ascending
		Arrays.sort(numbers);
		ArrayUtils.forEach(numbers);

		
	}
	//Ex01: Sorting with int manually
	private static void bubbleSort(int [] digits) {
		for(int out = digits.length-1; out >0; out-- ) {
			for(int in =0; in <out;in++) {
				if(digits[in]< digits[out]) {
					int tmp = digits[out];
					digits[out]= digits[in];
					digits[in]= tmp;
				}
			}
		}
	}
	
}
