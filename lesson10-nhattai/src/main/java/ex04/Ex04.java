package ex04;

import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println("Add the 10th  element at position 3:\n" + Arrays.toString(addElement(arr, 10, 3)));
		System.out.println();
		deleteElement(arr, 3);
	}

	public static int[] addElement(int[] arr, int value, int k) {
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

	public static int deleteElement(int arr[], int k) {
		for (int i = 0; i < arr.length; i++) {
			if (i == k) {
				for (int j = i; j < arr.length - 1; j++) {
					arr[j] = arr[j + 1];
				}
				break;
			}
		}
		System.out.println("Delete a element at position k: ");
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.print(" " + arr[i]);
		}
		return k;
	}

}
