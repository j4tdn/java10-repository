package nguyenduonghuy.lesson02_nguyenduonghuy;

import java.util.Arrays;
import java.util.Random;

public class Ex01 {
	public static void main(String[] args) {
		int[] a = new int[3];
		for (int i = 0; i < a.length; i++) {
			a[i] = new Random().nextInt(10);
		}
		System.out.println("Original array: " + Arrays.toString(a));

		// Bubble soft
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int tmp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = tmp;
				}
			}
		}
		System.out.println("Soted array: " + Arrays.toString(a));
	}
}