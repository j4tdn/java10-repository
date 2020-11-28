package anhtuan.lesson02_anhtuan;

public class Ex02 {
	public static void main(String[] args) {
		long x = factorial(4) + factorial(7) + factorial(12) + factorial(18);
		System.out.println("S = 4!+7!+12!+18!=" + x);

	}

	private static long factorial(int n) {
		if (n == 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}
}
