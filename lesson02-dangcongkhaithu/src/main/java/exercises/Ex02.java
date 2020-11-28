package exercises;

public class Ex02 {
	public static void main(String[] args) {
		long s = getFactorial(4) + getFactorial(7) + getFactorial(12) + getFactorial(18);

		System.out.println(s);
	}

	private static long getFactorial(int a) {
		long result = 1;

		for (int i = 1; i <= a; i++) {
			result = result * i;
		}
		return result;
	}
}
