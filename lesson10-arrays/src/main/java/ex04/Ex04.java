package ex04;

import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) {
		SumOfOdd();
		Max();
		Min();
		SortArray();

	}

	public static void SumOfOdd() {
		int[] a = { 1, 9, 5, 36, 12, 33 };
		int sum = 1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 1) {
				sum += a[i];
			}
		}
		System.out.println("Sum Of Odd: " + sum);

	}

	public static void Max() {
		int[] a = { 1, 9, 5, 36, 12, 33 };
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		System.out.println("Max: " + max);

	}

	public static void Min() {
		int[] a = { 1, 9, 5, 36, 12, 33 };
		int min = 1;
		for (int i = 0; i < a.length; i++) {
			if (min > a[i]) {
				min = a[i];
			}
		}
		System.out.println("Min: " + min);
	}

	public static void SortArray() {
		System.out.println("Mang sap xep la: ");
		int[] a = { 1, 9, 5, 36, 12, 33 };
		Arrays.sort(a);
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					a[j] = a[i];
				}
			}
			System.out.println(a[i] + " ");
		}

	}

}
