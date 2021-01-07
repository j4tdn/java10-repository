package demo;

import java.awt.Dialog;
import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int[] digits = {3, 19, 21, 0, 15, 17, 21};
		int[] uniqueArray = getUniqueElements(digits);
		
		printf(digits);
		System.out.println("\n======");
		
		sort(uniqueArray);
		printf(uniqueArray);
	}
	private static int[] getUniqueElements(int[] elements) {
		// fixed-length
		int count = 0;
		int[] result = new int[elements.length];
		// iterate an array with 2 ways
		// for each   1 2 4 1 3 2 1
		for (int out = 0; out < elements.length; out++) {
			boolean isDuplicated = false;
			for (int in = 0; in < elements.length; in ++) {
					if (out != in && elements[out] == elements[in]) {
						isDuplicated = true;
						break;
					}
			}
			if (!isDuplicated) {
				result[count] = elements[out];
				count++;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
	private static void sort(int[] elements) {
		// 0 19 17 15 3
		//            19
		//         17 19
		//      15 17 19
		// bubble sort: sắp xếp nổi bọt
		// after a loop => a bubble element will be selected
		for (int out = elements.length-1; out > 0; out--) {
			for (int in = 0; in < out; in++) {
				if (elements[in] > elements[out]) {
					int tmp = elements[in];
					elements[in] = elements[out];
					elements[out] = tmp;
				}
			}
		}
		
	}
	
	private static void printf(int[] elements) {
		for (int element: elements) {
			System.out.print(element + "  ");
		}
	}
	
}
