package Sorting;

public class Ex01 {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 5, 9, 4, 6, 11 };
		sort(arr);
	}

	public static void sort(int[] numbers) {
		int temp = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] > numbers[j]) {
					temp = numbers[j];
					numbers[j] = numbers[i];
					numbers[i] = temp;
				}

			}

			System.out.print(numbers[i] + " ");
		}
	}
}
