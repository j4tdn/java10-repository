package exercises;

public class Ex06 {
	public static void main(String[] args) {
		int k = 0;
		int count = 0;
		while (true) {
			if (isPrime(k)) {
				count++;
			}
			if (count == 200) {
				System.out.println("Số nguyên tố thứ 200 là: " + k);
				break;
			}
			k++;
		}
	}

	private static boolean isPrime(int n) {
		if (n < 2) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
