package lesson02_excercise;

import java.util.Scanner;

public class Bai4_NumberOddLargeSecond {
	public static void main(String[] args) {
		int num;

		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Enter the number of elements in the array: ");
			num = scanner.nextInt();
		} while (num < 0);
		
		int A[] = new int[num];

		System.out.println("Enter elements for the array");
		for (int i = 0; i < num; i++) {
			System.out.print("Enter the th element " + i + ": ");
			A[i] = scanner.nextInt();

		}
		int max1 = 0;
		int max2 = 0;
		for (int i = 0; i < num; i++) {
			if (max1 < A[i] && A[i] % 2 != 0) {
				max1 = A[i];
			} else {
				continue;
			}
		}
		System.out.println("Number odd large first = " + max1);

		for (int i = 0; i < num; i++) {
			if (max2 == A[i]) {
				continue;
			} else if (max2 < A[i] && A[i] < max1 && A[i] % 2 != 0) {
				max2 = A[i];
			}
		}
		System.out.println("Number odd large second = " + max2);
	}

}
