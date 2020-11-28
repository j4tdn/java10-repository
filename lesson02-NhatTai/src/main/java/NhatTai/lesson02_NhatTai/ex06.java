package NhatTai.lesson02_NhatTai;

public class ex06 {
	public static void main(String[] args) {
		int i = 0;
		int count = 1;
		do {
			i++;
			if (isPrime(i)) {
				count++;
			}
		} while (count <= 200);
		System.out.println("The prime number 200th: " + i);
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
