package ex01;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int[] arr = { 3, 15, 21, 0, 15, 17, 21 };
		int[] results = getUniqueNumbers(arr);

		for (int i = 0; i < results.length; i++) {
			System.out.println(results[i]);
		}
	}

	private static int[] getUniqueNumbers(int[] arr) {
		int[] results = new int[arr.length];
		int n = 1;
		for (int i = 0; i < arr.length; i++) {
			if (!isUnique(arr, arr[i], n++)) {
				results[i] = arr[i];
			}
		}

		return results;
	}

	private static boolean isUnique(int[] intput, int k,int n) {
		for (int i = n; i < intput.length; i++) {
			if (k == intput[i]) {
				return true;
			}
		}
		return false;
	}
}
