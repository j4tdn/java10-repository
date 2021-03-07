package ex;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int[] numbers = { 1, 5, 3, 4, 5, 3, 2, 3, 1, 1 };
		System.out.println("So sánh 5 phần tử đầu và cuối:");
		compare(numbers);
		System.out.println("================");
		System.out.println("Xoá phần tử trùng nhau:");
		System.out.println(Arrays.toString(removeDuplicates(numbers)));
		System.out.println("================");
		System.out.println("Sắp xếp các phần tử:");
		insertionSort(numbers);
		forEach(numbers);
		System.out.println("\n===================");
		System.out.println("phần tử lớn nhất thứ 3:");
		System.out.println(find3largest(numbers));

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
		float be = 0;
		float af = 0;
		for (int i = 0; i < numbers.length / 2; i++) {
			be = be + numbers[i];

		}
		for (int i = numbers.length / 2; i < numbers.length; i++) {
			af = af + numbers[i];

		}
		be = be / 5;
		af = af / 5;
		if (be > af) {
			System.out.println("before > after : " + be + " > " + af);
		} else if (be == af) {
			System.out.println("before = after : " + be + " = " + af);
		} else {
			System.out.println("before < after : " + be + " < " + af);
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

	public static int find3largest(int[] numbers) {
		Arrays.sort(numbers);
		int n = numbers.length;
		int check = 0, count = 1;
		for (int i = 1; i <= n; i++) {
			if (count < 4) {
				if (check != numbers[n - i]) {
					check = numbers[n - i];
					count++;
				}
			} else
				break;
		}
		return check;
	}
}
