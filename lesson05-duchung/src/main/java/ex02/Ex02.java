package ex02;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02 {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<Integer> arra = new ArrayList<Integer>();
		System.out.print("input array: ");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		System.out.print("Imports elements in the array: \n");
		for (int i = 1; i < n; i++) {
			do {
				System.out.printf("a[%d] = ", i);
				arr[i] = scanner.nextInt();
			} while (arr[i] > n);
		}
		int j = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (j == arr[i]) {
				j++;
				continue;
			} else {
				arra.add(j);
				i--;
				j++;
			}
		}
		System.out.println("Missing numbers are ");
		for (int r : arra) {
			System.out.println(" " + r);
		}
	}
}

