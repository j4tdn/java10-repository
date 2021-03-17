
package exercises;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 1, 7, 11, 11, 6, 14 };

		// 1. Loại bỏ những phần tử trùng nhau trong mảng
		System.out.println(Arrays.toString(getUnique(numbers)));
		System.out.println("==================================");

		// 2. So sánh giá trị trung bình của 5 phần tử đầu tiên so với 5 phần tử cuối
		compareMean(numbers);
		System.out.println("==================================");

		// 3.Sắp xếp mảng theo thứ tự tăng dần sử dụng sắp xếp kiểu chèn insertion sort
		insertionSort(numbers);
		System.out.println(Arrays.toString(numbers));
		System.out.println("==================================");

		// 4.Tìm số lớn thứ 3 trong mảng
		System.out.println( getThirdLargest(numbers));
	}

	private static int[] getUnique(int[] digits) {
		int[] result = new int[digits.length];
		boolean[] flags = new boolean[digits.length];
		int index = 0;
		for (int out = 0; out < digits.length; out++) {
			if (!flags[out]) {
				for (int in = out + 1; in < digits.length; in++) {
					if (digits[out] == digits[in]) {
						flags[out] = true;
						flags[in] = true;
					}
				}

			}
			if (!flags[out]) {
				result[index++] = digits[out];
			}
		}
		return Arrays.copyOfRange(result, 0, index);
	}

	private static void compareMean(int[] digits) {

		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < digits.length / 2; i++) {
			sum1 += digits[i];
		}
		for (int i = digits.length / 2; i < digits.length; i++) {
			sum2 += digits[i];
		}
		int mean1 = sum1 / 5;
		int mean2 = sum2 / 5;

		if (mean1 > mean2) {
			System.out.println("Mean of the first 5 elements > Mean of the last 5 elements " + mean1 + ">" + mean2);
		} else if (mean1 == mean2) {
			System.out.println("Mean of the first 5 elements = Mean of the last 5 elements " + mean1 + "=" + mean2);
		} else {
			System.out.println("Mean of the first 5 elements < Mean of the last 5 elements " + mean1 + "<" + mean2);
		}
	}

	private static void insertionSort(int[] digits) {
		for (int i = 1; i < digits.length; i++) {
			int key = digits[i];
			int j = i - 1;
			while (j >= 0 && digits[j] > key) {
				digits[j + 1] = digits[j];
				j = j - 1;
			}
			digits[j + 1] = key;
		}
	}

	private static int getThirdLargest(int[] digits) {
		int[] arr = digits;
		Arrays.sort(arr);
		int count = 0;

		int[] results = new int[arr.length];
		boolean[] flags = new boolean[arr.length];
		for (int out = 0; out < arr.length; out++) {
			if (!flags[out]) {
				for (int in = out + 1; in < arr.length; in++) {
					if (arr[out] == arr[in]) {
						flags[out] = true;
						flags[in] = true;
					}
				}
				results[count++] = arr[out];
			}
		}
		int[] a = Arrays.copyOfRange(results, 0, count);
		return a[a.length - 3];
	}
}
