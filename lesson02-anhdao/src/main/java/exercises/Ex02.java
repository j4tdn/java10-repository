package exercises;

public class Ex02 {
	/*
	 * Bài 2: Viết chương trình tính tổng S = 4! +7! + 12! + 18!
	 */
	public static void main(String[] args) {
		long S = factorial(4) + factorial(7) + factorial(12) + factorial(18);
		System.out.println("S = 4! +7! + 12! + 18! =" + S);
	}

	public static long factorial(int n) {
		long a = 1;
		if (n == 0 || n == 1) {
			return a;
		}
		for (int i = 2; i <= n; i++) {
			a *= i;
		}
		return a;
	}
}
