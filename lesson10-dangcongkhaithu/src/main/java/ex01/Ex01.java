package ex01;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 3, 1 };

		System.out.println("Loại bỏ các phần tử trùng nhau: ");
		int[] output = getUnique(numbers);
		for (int out : output) {
			System.out.print(out + "  ");
		}
		System.out.println();
		System.out.println("So sánh giá trị trung bình ");
		average(numbers, 5);
		System.out.println("Sắp xếp theo thứ tự tăng dần: ");
		insertionSort(numbers);
		for (int number : numbers) {
			System.out.print(number + " ");
		}
		System.out.println();
		System.out.println("Phần tử lớn thứ 3 trong mảng");
		int result = max3(numbers);
		System.out.println(result);

	}

	private static int[] getUnique(int[] numbers) {
		int[] result = new int[numbers.length];
		int k = 0;
		for (int i = 0; i < numbers.length; i++) {
			int tmp = numbers[i];
			if (!isUnique(numbers, tmp)) {
				result[k++] = tmp;
			}
		}

		return Arrays.copyOfRange(result, 0, k);
	}

	private static boolean isUnique(int[] numbers, int value) {
		int count = 0;
		for (int i : numbers) {
			if (i == value) {
				count++;
			}
		}
		if (count > 1) {
			return true;
		}
		return false;
	}

	private static void average(int[] numbers, int index) {
		int start = 0;
		int end = 0;
		for (int i = 0; i < index; i++) {
			start = start + numbers[i];
		}
		start = start / index;
		for (int i = numbers.length - 1; i > numbers.length - (index + 1); i--) {
			end = end + numbers[i];
		}
		end = end / index;
		if (start > end) {
			System.out.println("start > end");
		} else if (start < end) {
			System.out.println("start < end");
		} else {
			System.out.println("start = end");
		}

	}

	private static void insertionSort(int[] numbers) {
		int count = 0;
		for (int i = 1; i < numbers.length; i++) {
			count = numbers[i];
			int j = i;
			while (j > 0 && numbers[j - 1] > count) {
				numbers[j] = numbers[j - 1];
				j--;
			}
			numbers[j] = count;
		}
	}

	private static int max3(int[] numbers) {
		int[] result = new int[numbers.length];
		int k = 0;
		for (int i = 0; i < numbers.length; i++) {
			int tmp = numbers[i];
			if (!contains(result, tmp)) {
				result[k++] = tmp;
			}
		}
		int[] output = Arrays.copyOfRange(result, 0, k);
		insertionSort(output);
		return output[output.length - 3];
	}

	private static boolean contains(int[] numbers, int value) {
		for (int i : numbers) {
			if (i == value) {
				return true;
			}
		}
		return false;
	}
}