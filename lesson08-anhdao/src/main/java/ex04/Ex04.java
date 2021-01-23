package ex04;

import java.util.Arrays;
import java.util.Scanner;

public class Ex04 {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		do {
			try {
				System.out.print("Enter first number: ");
				int input1 = Integer.parseInt(ip.nextLine());
				System.out.print("Enter second number: ");
				int input2 = Integer.parseInt(ip.nextLine());
				if (Arrays.equals(primeDivisor(input1), primeDivisor(input2))) {
					System.out.println("==== YES ========");
				} else {
					System.out.println("==== NO ========");
				}
				break;
			} catch (NumberFormatException e) {
				System.out.println("Input must a number !");
			}
			System.out.println("=============================");
		} while (true);
	}

	private static int[] primeDivisor(int input) {
		int[] primeArray = new int[100];
		int count = 0;
		int index = 0;
		int prime = 2;
		int[] result = new int[primeArray.length];

		while (input > 1) {
			if (input % prime == 0) {
				input /= prime;
				primeArray[count++] = prime;
			} else {
				prime++;
			}
		}
		boolean[] flags = new boolean[primeArray.length];
		for (int out = 0; out < primeArray.length; out++) {
			if (!flags[out]) {
				for (int in = out + 1; in < primeArray.length; in++) {
					if (primeArray[out] == (primeArray[in])) {
						flags[out] = true;
						flags[in] = true;
					}
				}
				result[index++] = primeArray[out];
			}
		}
		return Arrays.copyOfRange(result, 0, index);
	}

}
