package ex;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		Integer[] a = { 1, 6, 2, 3, 4, 5, 6, 5, 4, 3, 2, 1 };
		System.out.println("Compares the first and last 5 elements:");
		compare(a);
		System.out.println("================");
		System.out.println("Delete duplicate elements:");
		forIndex(removeDuplicates(a));
		System.out.println("\n================");
		thirdLargestNumberInAnArray(a);
		System.out.println("================");
		System.out.println("The arrangement of the elements:");
		insertionSort(a);
		forIndex(a);
	}

	private static Integer[] removeDuplicates(Integer[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length - 1; j++) {
				if (a[j] == a[i]) {
					a[j] = null;
				}
			}
		}
		a[a.length - 1] = null;
		return a;
	}

	private static void compare(Integer[] a) {
		float before = 0;
		float after = 0;
		for (int i = 0; i < a.length / 2; i++) {
			before = before + a[i];

		}
		for (int i = a.length / 2; i < a.length; i++) {
			after = after + a[i];

		}
		before = before / 5;
		after = after / 5;
		if (before > after) {
			System.out.println("before > after : " + before + ">" + after);
		} else if (before == after) {
			System.out.println("before = after : " + before + "=" + after);
		} else {
			System.out.println("before < after : " + before + "<" + after);
		}
	}

	private static void insertionSort(Integer a[]) {
		for (int i = 1; i < a.length; ++i) {
			if (a[i] != null) {
				int key = a[i];
				int j = i - 1;

				while (j >= 0 && a[j] > key) {
					a[j + 1] = a[j];
					j = j - 1;
				}
				a[j + 1] = key;
			}
		}

	}

	public static void thirdLargestNumberInAnArray(Integer[] a) {
		int size = a.length;
		int temp;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length - 1; j++) {
				if (a[i] == null || a[j] == null) {
					continue;
				}
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Third largest number is: " + a[(size / 2) - 3]);
	}

	public static void forIndex(Integer[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] != null) {
				System.out.print(a[i] + "   ");
			}
			continue;
		}
	}
}
