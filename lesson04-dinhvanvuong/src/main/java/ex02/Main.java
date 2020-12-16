package ex02;

import java.util.Scanner;

public class Main {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter Import Array: ");
		int n = sc.nextInt();
		int[] Arr = new int[n];
			Calculate(Arr, a -> a % 7 == 0);
			Calculate(Arr, a -> (a % 5 == 0) && (a % 7 == 0));
			Calculate(Arr, a -> a % 5 == 0);
		
	}

	public static void Calculate(int[] arr, Programme programme) {
		for (int i = 0; i < arr.length; i++) {
			if (programme.edit(arr[i])) {
				System.out.print(arr[i] + " ");
			}

		}
	}
}