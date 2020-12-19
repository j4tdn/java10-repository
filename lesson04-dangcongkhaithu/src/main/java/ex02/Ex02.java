package ex02;

import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		int[] arr = { 3, 5, 7, 35, 14, 25 };

		for (int i : sort(arr, a -> (a % 7 == 0) && (a % 5 != 0))) {
			System.out.println(i);
		}
		for (int i : sort(arr, a -> ((a % 7 == 0) && (a % 5 == 0)) || ((a % 7 != 0) && (a % 5 != 0)))) {
			System.out.println(i);
		}
		for (int i : sort(arr, a -> (a % 5 == 0) && (a % 7 != 0))) {
			System.out.println(i);
		}

	}

	private static int[] sort(int[] arr, Condition condition) {
		int[] result = new int[arr.length];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (condition.test(arr[i])) {
				result[count++] = arr[i];
			}
		}

		return Arrays.copyOfRange(result, 0, count);
	}

}
