package view;

public class Ex02 {
	public static long factorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * factorial(n - 1); //recurse
	}

	public static void main(String[] args) {
		long result = factorial(1) + factorial(2) + factorial(12) + factorial(8);
		System.out.println("S = 1! + 2! + 12! + 8! = " + result);
	}
}
