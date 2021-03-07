package ex04;

import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) {
		int[] digits = { 6, 2, 4, 8, 10, 7, 9 };
		System.out.println("ADD new value : " + Arrays.toString(addElement(digits, 3, 44)));
		System.out.println("REMOVE value : " + Arrays.toString(removeElement(digits, 2)));
	}

	public static int[] addElement(int[] numbers, int index, int nvalue) {
		if (index < 0 || index >= numbers.length) {
			throw new ArrayIndexOutOfBoundsException();
		}
		int[] results = new int[numbers.length + 1];
		for (int i = 0; i < index; i++) {
			results[i] = numbers[i];
		}
		results[index] = nvalue;
		for (int i = index + 1; i < results.length; i++) {
			results[i] = numbers[index++];
		}
		return results;
	}

	public static int[] removeElement(int[] numbers, int index) {
		if (index < 0 || index >= numbers.length) {
			throw new ArrayIndexOutOfBoundsException();
		}
		int[] tmp = Arrays.copyOfRange(numbers, 0, numbers.length);
		for (int i = index; i < tmp.length - 1; i++) {
			tmp[i] = numbers[i + 1];
		}
		return Arrays.copyOfRange(tmp, 0, tmp.length - 1);
	}

}