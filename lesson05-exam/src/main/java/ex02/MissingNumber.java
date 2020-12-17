package ex02;

public class MissingNumber {
	public static void main(String[] args) {
		int[] digits = { 3, 2, 1, 6, 5 };
		System.out.println("Missed number: " + getMissingNumber(digits));
	}

	private static int getMissingNumber(int[] digits) {
		int max = digits.length + 1;
		return (max * (max + 1) / 2) - sum(digits);
	}

	private static int sum(int[] digits) {
		int result = 0;
		for (int i : digits) {
			result += i;
		}
		return result;
	}
}