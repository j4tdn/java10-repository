package Ex04;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		int arr[] = { 1, 3, 6, 5, 4, 3, 8, 9, 6 };
//		int max = max(arr, arr.length);
//		System.out.println(max);

		System.out.println(getLeastCommonMultiple(arr, arr.length));

	}

	public static int max(int[] arr, int n) {
		int max = arr[0];
		for (int i = 1; i < n; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;

	}

	public static int getLeastCommonMultiple(int[] arr, int n) {
		int max = max(arr, arr.length);
		int multiples = 1;
		int count = 0;
		for (int i = 1; i <= n; i++) {
			multiples = max * i;
			int j = 0;
			
			while (multiples % arr[j] == 0) {
				count++;
				j++;
			}

		}
		return multiples;
	}
}
