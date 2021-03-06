package ex01;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int[] numbers = { 2, 1, 3, 4, 5, 5, 1, 3, 2, 4 };
		System.out.println("So sánh 5 phần tử đầu và cuối:");
		compare(numbers);
		System.out.println("================");
		System.out.println("Xoá phần tử trùng nhau:");
		System.out.println(Arrays.toString(removeDuplicates(numbers)));
		System.out.println("================");
		System.out.println("Sắp xếp các phần tử:");
		insertionSort(numbers);
		forEach(numbers);
	}

	public static void forEach(int[] numbers) {
		System.out.println();
		for (int item : numbers) {
			System.out.print(item + "   ");
		}
	}

	private static int[] removeDuplicates(int[] numbers) {

		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length - 1; j++) {
				if (numbers[j] == numbers[i]) {
					numbers[j] = 0;
				}
			}
		}
		numbers[numbers.length - 1] = 0;
		return numbers;
	}

	private static void compare(int[] numbers) {
		float before = 0;
		float after = 0;
		for (int i = 0; i < numbers.length / 2; i++) {
			before = before + numbers[i];

		}
		for (int i = numbers.length / 2; i < numbers.length; i++) {
			after = after + numbers[i];

		}
		before = before / 5;
		after = after / 5;
		if (before > after) {
			System.out.println("before > after : " + before + " > " + after);
		} else if (before == after) {
			System.out.println("before = after : " + before + " = " + after);
		} else {
			System.out.println("before < after : " + before + " < " + after);
		}
	}

	private static void insertionSort(int numbers[]) {
		int n = numbers.length;
		for (int i = 1; i < n; ++i) {
			int key = numbers[i];
			int j = i - 1;
			while (j >= 0 && numbers[j] > key) {
				numbers[j + 1] = numbers[j];
				j = j - 1;
			}
			numbers[j + 1] = key;
		}
	}

}