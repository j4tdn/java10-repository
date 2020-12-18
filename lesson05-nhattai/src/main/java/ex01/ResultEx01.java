package ex01;

import java.util.Arrays;

public class ResultEx01 {
	public static void main(String[] args) {
		int [] digits = {3, 15, 21, 0, 15, 17, 21};
		int [] uniqueArray = getUniqueElements(digits);
		
		printf(digits);
		System.out.println("\n=================");
		sort(uniqueArray);
		printf(uniqueArray);
	}
	private static int[] getUniqueElements(int[] elements) {
		int[] result = new int[elements.length];
		boolean[] isDupFlags = new boolean[elements.length];
		//iterate an array with 2 ways
		// for index
		// for each
		for(int out = 0; out < elements.length; out++) {
			for(int in = 0; in < elements.length; in++) {
				if( !isDupFlags[out]) {
					if(out != in && elements[out] == elements[in]) {
						isDupFlags[out] = true;
						isDupFlags[in] = true;
					}
				}
			}
		}
		int count = 0;
		for(int i = 0; i < elements.length;i++) {
			if(!isDupFlags[i]) {
				result[count] = elements[i];
				count ++;
			}
		}
		
		int[] finalResult = Arrays.copyOfRange(result, 0, count);
		return finalResult;
	}
	private static void sort(int[] elements) {
		for (int out = elements.length-1; out > 0; out--) {
			for(int in = 0; in < out; in++) {
				if(elements[in] > elements[out]) {
					int tmp = elements[in];
					elements[in] = elements[out];
					elements[out] = tmp;
				}
				
			}
		}
	}
	
	private static void printf(int[] elements) {
		for(int element: elements) {
			System.out.print(element + " ");
		}
	}
}
