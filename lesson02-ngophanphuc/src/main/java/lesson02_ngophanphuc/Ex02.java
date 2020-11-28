package lesson02_ngophanphuc;

public class Ex02 {
	public static void main(String[] args) {
		long S = factorial(9) + factorial(7) + factorial(12) + factorial(18);
		System.out.println("Tong S = " + S);
	}

	public static long factorial(int n) {
		if (n == 1 || n == 0)
			return 1;
		return n * factorial(n - 1);
	}
}
