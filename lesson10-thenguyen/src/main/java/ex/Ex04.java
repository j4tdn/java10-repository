package ex;

import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 5, 6, 7, 8, 9 };
		System.out.println("Thêm phần tử vào vị trí:\n" + Arrays.toString(addElement(nums, 4, 1)));
		System.out.println("Xóa phần tử tại vị trí:\n" + Arrays.toString(delete(nums, 2)));

	}

	private static int[] addElement(int[] arr, int nums, int k) {

		int[] result = new int[arr.length + 1];
		for (int i = 0; i < k; i++) {
			result[i] = arr[i];
		}
		result[k] = nums;

		for (int i = k + 1; i < result.length; i++) {
			result[i] = arr[i - 1];
		}
		return result;
	}

	private static int[] delete(int[] arr, int k) {
		if (k > arr.length - 1 || k < 0)
			return arr;

		int[] temp = new int[arr.length - 1];

		for (int i = 0; i < k; i++)
			temp[i] = arr[i];
		for (int i = k + 1; i < arr.length; i++)
			temp[i - 1] = arr[i];
		return temp;
	}
}
