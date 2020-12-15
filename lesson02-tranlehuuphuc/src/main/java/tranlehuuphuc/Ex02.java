package tranlehuuphuc;

public class Ex02 {
	public static void main(String[] args) {
		int a = 4;
		int b = 7;
		int c = 12;
		int d = 18;
		long Tong = factorial(4) + factorial(7) + factorial(12) + factorial(18);
		System.err.println("Tong cua day (S =4!+7! +12!+18!) la = " + Tong);
	}

	public static long factorial(int n) {
		long factorials = 1;
		if (n == 0 || n == 1) {
			return factorials;
		} else {
			for (int i = 2; i <= n; i++) {
				factorials *= i;
			}
			return factorials;
		}
	}

}
