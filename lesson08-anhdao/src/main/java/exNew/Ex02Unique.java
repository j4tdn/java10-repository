package exNew;

import java.util.Arrays;

public class Ex02Unique {
	public static void main(String[] args) {
		String s = "1,1,2,3,4,2,4,5,50";
		String result = String.join(" - ", getUnique(s));

		System.out.print(result);
	}

	public static String[] getUnique(String input) {
		String[] result = new String[input.length()];
		String[] numbers = input.trim().split(",");
		int index = 0;
		boolean[] flags = new boolean[numbers.length];
		for (int out = 0; out < numbers.length; out++) {
			if (!flags[out]) {
				for (int in = out + 1; in < numbers.length; in++) {
					if (numbers[out].equals(numbers[in])) {
						flags[out] = true;
						flags[in] = true;
					}
				}
			}
			if (!flags[out]) {
				result[index++] = numbers[out];
			}
		}
		return Arrays.copyOfRange(result, 0, index);
	}
}
