package tranlehuuphuc;

public class Ex06 {
	public static void main(String[] agrs) {
		int i = 2;
		int j = 1;
		do {
			i = i + 1;
			if (isPrime(i)) {
				j = j + 1;
			}

		} while (j != 200);
		System.out.println(i);
	}

	public static boolean isPrime(int a) {
		for (int i = 2; i <= a / 2; i++) {
			if (a % i == 0) {
				return false;
			}
			
		}
		
		return true;
	}

}
