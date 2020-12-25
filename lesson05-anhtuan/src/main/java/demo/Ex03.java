package demo;

public class Ex03 {

	public static void main(String[] args) {
		System.out.println( isPowerOf(2, 8));
		System.out.println( isPowerOf(8, 2));
		System.out.println( isPowerOf(0, 0));
		System.out.println( isPowerOf(0, 1));
		System.out.println( isPowerOf(1, 0));

	}

	private static boolean isPowerOf(int a, int b) {
		//return isPower(a < b ? a :b, a > b ? a : b);
		if (a > b) {
			return isPower(b, a);
		}
		return isPower(a, b);
	}

	private static boolean isPower(int value, int power) {
		if (power == 1 || power == value) {
			return true;
		}
		while (power > value) {
			if (power % value != 0) {
				return false;
			}
			power /= value;

		}
		return power == value;
	}

}
