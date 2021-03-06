package java10.lesson10_duchung;

import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println("Add the 23th  element at position 4:\n" + Arrays.toString(add(arr, 10, 3)));
		System.out.println();
		System.out.println(Arrays.toString(remove(arr, 3)));

	}

	public static int[] add(int[] arr, int value, int k) {
		int[] result = new int[arr.length + 1];
		for (int i = 0; i < k; i++) {
			result[i] = arr[i];
		}
		result[k] = value;

		for (int i = k + 1; i < result.length; i++) {
			result[i] = arr[i - 1];
		}
		return result;
	}

	private static int[] remove(int[] a, int pos) {
		int[] tmp = new int[a.length];
		tmp = Arrays.copyOfRange(a, 0, a.length);
		for (int i = pos; i < a.length - 1; i++) {
			tmp[i] = tmp[i + 1];
		}
		System.out.println("Delete a element at position is: " + pos);

		return Arrays.copyOfRange(tmp, 0, a.length - 1);
	}

}
