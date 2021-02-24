package exercises;

import java.util.Arrays;

import java.util.function.Predicate;

import utils.ArrayUtils;

public class Ex01_Ex02 {
	public static void main(String[] args) {
		int[] numbers = { 1, 9, 5, 36, 12, 33 };

		// 1+ Calculate sum of odd numbers
		int sumOdd = sum(numbers, a -> a % 2 != 0);
		System.out.println("SUM = " + sumOdd);

		// 2+ Find max, min in one loop
		System.out.println(getMaxMin(numbers));

		// 3+ Add element to index k
		System.out.println("=====ADD====");
		ArrayUtils.forIndex(add(numbers, 99, 3));
		
		System.out.println("\n=====ADD2====");
		System.out.println(Arrays.toString(add2(numbers, 17, 2)));
		
		System.out.println("\n=====ADD3====");
		System.out.println(Arrays.toString(add3(numbers, 17, 2)));
		

		// 4+ Remove element from index k
		System.out.println("\n=====REMOVE====");
		ArrayUtils.forIndex(remove(numbers, 3));

		// 5+ Sort array using
		System.out.println("\n=====SORT====");
		sort(numbers);
		ArrayUtils.forIndex(numbers);

		// Ex02: Reverse an array

		System.out.println("\n=====Reverse2====");
		ArrayUtils.forIndex(reverse2(numbers));

		System.out.println("\n=====Reverse1====");
		reverse1(numbers);
		ArrayUtils.forIndex(numbers);
	}

	private static int sum(int[] digits, Predicate<Integer> predicate) {
		if (digits.length == 0) {
			return 0;
		}
		int sum = 0;
		for (int digit : digits) {
			if (predicate.test(digit)) {
				sum += digit;
			}
		}
		return sum;
	}

	private static MinMax getMaxMin(int[] digits) {
		MinMax number = new MinMax(Integer.MIN_VALUE, Integer.MAX_VALUE);
		for (int digit : digits) {
			if (digit > number.getMax()) {
				number.setMax(digit);
			}
			if (digit < number.getMin()) {
				number.setMin(digit);
			}
		}
		return number;
	}

	private static int[] add(int[] digits, int newValue, int index) {
		if (index < 0 || index >= digits.length) {
			throw new ArrayIndexOutOfBoundsException();
		}
		int[] result = new int[digits.length + 1];
		for (int i = 0; i < result.length; i++) {
			if (i < index) {
				result[i] = digits[i];
			} else if (i == index) {
				result[i] = newValue;
			} else {
				result[i] = digits[index++];
			}
		}
		return result;
	}

	// Cach 2
	// cach 3: copy all then shift right
	private static int[] add2(int[] digits, int newValue, int index) {
		if (index < 0 || index >= digits.length) {
			throw new ArrayIndexOutOfBoundsException();
		}
		int[] result = new int[digits.length + 1];
		for (int i = 0; i < index; i++) {
			result[i] = digits[i];
		}
		result[index] = newValue;
		for (int i = index + 1; i < result.length; i++) {
			result[i] = digits[i - 1];
		}

		return result;
	}

	private static int[] add3(int[] digits, int newValue, int index) {
		if (index < 0 || index >= digits.length) {
			throw new ArrayIndexOutOfBoundsException();
		}
		int[] result = new int[digits.length + 1];
		for (int i = 0; i < digits.length; i++) {
			result[i] = digits[i];
		}
		for (int i = result.length - 1; i > index; i--) {
			result[i] = result[i - 1];
		}
		result[index] = newValue;
		return result;
	}

	private static int[] remove(int[] digits, int index) {
		if (index < 0 || index >= digits.length) {
			throw new ArrayIndexOutOfBoundsException();
		}

		int[] result = new int[digits.length - 1];
		for (int i = 0; i < result.length; i++) {
			if (i < index) {
				result[i] = digits[i];
			} else {
				result[i] = digits[i + 1];// index + 1, ++index
			}
		}
		return result;
	}

	private static int[] remove1(int[] digits, int index) {
		if (index < 0 || index >= digits.length) {
			throw new ArrayIndexOutOfBoundsException();
		}

		int[] tmp = Arrays.copyOfRange(digits, 0, digits.length);
		// shift left
		for (int i = index; i < digits.length - 1; i++) {
			tmp[i] = tmp[i + 1];
		}
		return Arrays.copyOfRange(tmp, index, digits.length - 1);
	}

	// 1 6 2 4 8

	// 8 6

	private static void sort(int[] digits) {
		for (int i = 0; i < digits.length; i++) {
			for (int j = i + 1; j < digits.length; j++) {
				if (digits[i] > digits[j]) {
					int tmp = digits[i];
					digits[i] = digits[j];
					digits[j] = tmp;
				}
			}
		}
	}

	// EX02 :
	private static void reverse1(int[] digits) {
		for (int i = 0; i < digits.length / 2; i++) {
			int tmp = digits[i];
			digits[i] = digits[digits.length - i - 1];
			digits[digits.length - i - 1] = tmp;
		}
	}

	private static int[] reverse2(int[] digits) {
		int[] result = new int[digits.length];
		int index = 0;
		Arrays.sort(digits);
		for (int i = digits.length - 1; i >= 0; i--) {
			result[index++] = digits[i];
		}
		return result;
	}

}
