import java.util.Arrays;

import sorting.Utils;

public class Ex01 {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 3, 1 };
		int[] flags = new int[numbers.length];

		System.out.println("Finding unique element in an array");
		printFor(numbers);
		findingDuplicateElements(numbers, flags);
		printUniqueElements(numbers, flags);
		System.out.println("\n===============");
		int[] newNumbers = { 1, 6, 9, 4, 0, 2, 4, 6, 1, 12, 12, 12, 9, 9, 9, 9 };
		int[] arrLeft = Arrays.copyOfRange(newNumbers, 0, newNumbers.length / 2);
		int[] arrRight = Arrays.copyOfRange(newNumbers, newNumbers.length / 2, newNumbers.length);
		printFor(newNumbers);
		if (mean(arrLeft) > mean(arrRight)) {
			System.out.println("Tổng trung bình của 5 phần tử đầu lớn hơn tổng trung bình của 5 phần tử sau của mảng");
		} else if (mean(arrLeft) < mean(arrRight)) {
			System.out.println("Tổng trung bình của 5 phần tử sau lớn hơn tổng trung bình của 5 phần tử đầu của mảng");
		} else {
			System.out.println("Tổng trung bình của 5 phần tử sau bằng tổng trung bình của 5 phần tử đầu của mảng");
		}
		System.out.println("===============");
		Arrays.sort(newNumbers);
		System.out.println(Arrays.toString(newNumbers));
		theThirdLargest(newNumbers);
		System.out.println("===============");
		int[] insertionArray = { 9, 1, 9, 2, 5, 3, 7, 8 };
		Utils.InsertionSort(insertionArray);
		printFor(insertionArray);

	}

	private static void theThirdLargest(int[] newNumbers) {
		int count = 0;
		int nthLargest = newNumbers[newNumbers.length - 1];
		for (int i = newNumbers.length - 1; i > 0; i--) {
			if (nthLargest > newNumbers[i]) {
				count++;
				nthLargest = newNumbers[i];
			}
			if (count == 2) {
				System.out.println("Third Max: " + newNumbers[i]);
				break;
			}
		}
	}

	private static int mean(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum / (arr.length);
	}

	private static void findingDuplicateElements(int[] numbers, int[] flags) {
		for (int i = 0; i < numbers.length / 2; i++) {
			for (int j = numbers.length - 1; j > i; j--) {
				if (numbers[i] == numbers[j]) {
					flags[i] = 1;
					flags[j] = 1;
				}
			}
		}
	}

	public static void printFor(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	private static void printUniqueElements(int[] numbers, int[] flags) {
		for (int i = 0; i < flags.length; i++) {
			if (flags[i] == 0) {
				System.out.print(numbers[i] + " ");
			}
		}
	}

}
