package view;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value n : ");
		n = sc.nextInt();
		int s = sumFactorial(n);
	}

	private static int sumFactorial(int n) {
		int s = 1;
		for (int i = 1; i < n; i++) {
			s = (s + i) * i;
			System.out.println("sumFactorial: " + s);
			System.out.println(s);
		}
		return s;
	}

}
