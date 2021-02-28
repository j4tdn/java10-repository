package demoSortingEx03;

import java.util.Arrays;

import utils.ArrayUtils;

public class Ex01 {
	public static void main(String[] args) {
		int[] numbers = { 1, 5, 9, 4, 6, 11 };
		//descending
		bubbleSort1(numbers);
		ArrayUtils.forEach(numbers);
		
		System.out.println("===================");
		
		//ascending
		Arrays.sort(numbers);
		ArrayUtils.forEach(numbers);

		
	}
	//Ex01: Sorting with int manually
	public static void bubbleSort(int [] digits) {
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
	private static void bubbleSort1(int [] digits) {
		for(int out = 0; out <digits.length	; out++ ) {
			for(int in =0; in <digits.length-1-in;in++) {
				if(digits[in] > digits[in+1]) {
					int tmp = digits[in+1];
					digits[in +1]= digits[in];
					digits[in]= tmp;
				}
			}
		}
	}
	
	
}
