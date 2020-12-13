package ex01;

import java.util.Arrays;

public class UniqueNumber {
	public static void main(String[] args) {
		int[] a = { 3, 15, 21, 0, 15, 17, 21 };

		System.out.println("Original array: " + Arrays.toString(a));

		System.out.println(Arrays.toString(getUniqueNumber(a)));

	}

	private static int[] getUniqueNumber(int[] a) {
		int[] newArr = new int[a.length];
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (i != j && a[i] == a[j]) {
					break;
				}
				newArr[count] = newArr[j];
				count++;
			}
		}

		return newArr;
	}
}
