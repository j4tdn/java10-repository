package ex;

import java.util.Arrays;

public class Ex05 {
	public static void main(String[] args) {
		int[] a = { 1, 9, 3, 4, 5, 2, 8, 7, 0, 10, 6 };
		System.out.print("Selection Sort: ");
		forEach(selectionSort(a));
		System.out.print("\nInsertion Sort : ");
		forEach(insertionSort(a));
	}

	private static int[] selectionSort(int a[]) {
		int n = a.length;
		for (int i = 0; i < n - 1; i++) {
			int min = i;
			for (int j = i + 1; j < n; j++)
				if (a[j] < a[min])
					min = j;
			int temp = a[min];
			a[min] = a[i];
			a[i] = temp;
		}
		return a;
	}

	private static int[] insertionSort(int a[]) {
		for (int i = 1; i < a.length; i++) {
			int key = a[i];
			int j = i - 1;

			while (j >= 0 && a[j] > key) {
				a[j + 1] = a[j];
				j = j - 1;
			}
			a[j + 1] = key;
		}
		return a;
	}

	public static void forEach(int[] numbers) {
		System.out.println();
		for (int item : numbers) {
			System.out.print(item + "   ");
		}
	}
}