package ex01;

import java.util.Arrays;

public class UniqueNumber {
	public static void main(String[] args) {
		int[] digit = { 3, 15, 21, 0, 15, 17, 21 };
		int[] uniqueArray = getUniqueElement(digit);

		printf(digit);
		System.out.println();

		sort(uniqueArray);
		printf(uniqueArray);
	}

	private static int[] getUniqueElement(int[] elements) {
		// fixed-length
		int[] result = new int[elements.length];
		boolean[] isDupFlags = new boolean[elements.length];
		// iterate an array with 2 ways
		// + for index
		// + for each
		for (int out = 0; out < elements.length; out++) {
			for (int in = 0; in < isDupFlags.length; in++) {
				if (!isDupFlags[out]) {
					if (out != in && elements[out] == elements[in]) {
						isDupFlags[in] = true;
						isDupFlags[out] = true;
					}
				}
			}
		}
		int count = 0;
		for (int i = 0; i < elements.length; i++) {
			if (!isDupFlags[i]) {
				result[count++] = elements[i];
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}

	private static void sort(int[] elements) {
		// bubble sort
		for (int out = elements.length - 1; out > 0; out--) {
			for (int in = 0; in < out; in++) {
				if (elements[in] > elements[out]) {
					int tmp = elements[in];
					elements[in] = elements[out];
					elements[out] = tmp;
				}
			}
		}
	}

	private static void printf(int[] elements) {
		for (int element : elements) {
			System.out.print(element + "\t");
		}
	}
}