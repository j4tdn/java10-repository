package lesson02;

import java.util.Scanner;

public class Ex06 {
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dem = 0;
		for (int i = 0;; i++) {
			if (isPrime(i)) {
				dem++;
			}
			if (dem == 200) {
				System.out.println("So nguyen to thu 200 la : " + i);
				break;
			}
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