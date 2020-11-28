package lesson02;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {

		Prime(200);
	}

	static int Prime(int n) {

		int counter = 1; // For 1 and 2. assuming n is not 1 or 2.
		int i = 2;
		int x = 2;
		int tempLength = n;

		while (counter <= n) {
			for (; i <= tempLength; i++) {
				for (x = 2; x < i; x++) {
					if (i % x == 0) {
						break;
					}
				}
				if (x == i && counter < n) {
					// System.out.printf("\n%d is prime", x);
					counter++;
					if (counter == n) {
						System.out.printf("\n%d is prime", x);
						return counter;
					}
				}
			}
			tempLength = tempLength + n;
		}
		return 0;
	}
}