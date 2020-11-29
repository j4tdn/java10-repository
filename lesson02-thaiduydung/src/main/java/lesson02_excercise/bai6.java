package lesson02_excercise;

public class bai6 {
	public static void main(String[] args) {
		int i = 0;
		int count = 1;
		do {
			i++;
			if (isPrime(i)) {
				count++;
			}
		} while (count <= 200);
		System.out.println("so nguyen to thu 200 : " + i);
	}

	public static boolean isPrime(int n) {
		if (n < 2) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
