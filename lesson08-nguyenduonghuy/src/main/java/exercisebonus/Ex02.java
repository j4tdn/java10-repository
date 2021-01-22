package exercisebonus;

import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		String s = "1,1,2,3,4,2,4,5,50";
		int[] arrayNumber = toNumberArray(s);
		int[] arrayUniqueNumber = getUniqueNumber(arrayNumber);
		System.out.println(Arrays.toString(arrayUniqueNumber));
	}
	
	private static int[] toNumberArray(String s) {
		String[] arrStringNumber = s.split(",");
		int[] arrNumber = new int[arrStringNumber.length];
		for (int i = 0; i < arrNumber.length; i++) {
			arrNumber[i] = Integer.parseInt(arrStringNumber[i]);
		}
		return arrNumber;
	}
	
	private static int[] getUniqueNumber(int[] arrNumber) {
		int[] result = new int[arrNumber.length];
		boolean[] isDupFlags = new boolean[arrNumber.length];
		for (int out = 0; out < arrNumber.length; out++) {
			for (int in = 0; in < isDupFlags.length; in++) {
				if (!isDupFlags[out]) {
					if (out != in && arrNumber[out] == arrNumber[in]) {
						isDupFlags[in] = true;
						isDupFlags[out] = true;
					}
				}
			}
		}
		int count = 0;
		for (int i = 0; i < arrNumber.length; i++) {
			if (!isDupFlags[i]) {
				result[count++] = arrNumber[i];
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
}
