package lesson02_excercise;

public class bai2 {
	public static void main(String[] args) {
		System.out.println(bai2.sum(4) + bai2.sum(7) + bai2.sum(12) + bai2.sum(18));

	}

	public static long sum(int n) {
		long tmp = 1;
		if (n == 0 || n == 1) {
			return tmp;
		} else {
			for (int i = 2; i <= n; i++) {
				tmp *= i;
			}
			return tmp;
		}
	}
}
