package lesson02;

public class Ex06 {                //bai6

	public static void main(String[] args) {

		int i = 0;
		int count = 0;
		do {
			i++;
			if (isPrime(i)) {
				count++;
			}

		} while (count < 200);
		System.out.println(" 200th prime number:" + i);

	}

// check isPrime
	public static boolean isPrime(int a) {
		if (a < 2) {
			return false;
		}
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}
}
