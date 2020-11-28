package lesson02;

public class Ex02 {

	public static void main(String[] args) {
		

		System.out.println(Ex02.factorial(4) + Ex02.factorial(7) + Ex02.factorial(12) + Ex02.factorial(8));
	}

	public static long factorial(int n) {
		long g = 1;
		if (n == 0 || n == 1) {
			return g;
		} else {
			for (int i = 2; i <= n; i++) {
				g *= i;
			}
			return g;
		}
	}
}
