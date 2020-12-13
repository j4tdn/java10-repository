package ex01;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		int[] a = new int[] { 21, 3, 15, 21, 0, 15, 17, 21 };
		
		int [] result= getUniqueNumbers(a);
		
		for(int i = 0; i < result.length; i++) {
			sortArray(result);
			System.out.print(result[i] + "   ");
			
			
		}
		
	}
	
	private static int[] getUniqueNumbers(int[] a) {
		int[] result = new int[a.length];
		int count = 0;
		// 3 0 17 0 0 0 0 0
		// Arrays.copyOfRange(result, 0, 3);
		
		for (int i = 0; i < a.length; i++) {
			if (duplicate(a, i)) {
				continue;
			}
			
			System.out.println(" Arr: " + a[i]);
			result[count] = a[i];
			count++;
		}
		// inclusive, exclusive
		//return result;
		 return Arrays.copyOfRange(result, 0, count);
	}
	public static boolean duplicate(int[] A, int index) {
		for (int i = 0; i < A.length; i++) {
			if (i != index && A[index] == A[i]) {
				return true;
			}

		}
		return false;
	}

	public static void sortArray(int[] arr) {
		int a = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					a = arr[j];
					arr[j] = arr[i];
					arr[i] = a;

				}
			}
		}
	}
}
