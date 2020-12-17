package ex03;

public class IsPower {
	public static void main(String[] args) {
		System.out.println(isPowerOf(2, 1024));
		System.out.println(isPowerOf(8, 2));
		System.out.println(isPowerOf(64, 4));
		System.out.println(isPowerOf(3, 28));
	}
	
	private static boolean isPowerOf(int a, int b) {
		return isPower(a < b ? a : b, a > b ? a : b);
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