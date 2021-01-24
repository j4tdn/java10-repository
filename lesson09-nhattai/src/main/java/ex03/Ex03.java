package ex03;

import java.util.Scanner;

public class Ex03 {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("input: ");
		permutation(ip.next());
	}

	public static void permutation(String str) {
		permutation("", str);
	}

	private static void permutation(String prefix, String str) {
		int n = str.length();
		if (n == 0)
			System.out.println("output: " + prefix);
		else {
			for (int i = 0; i < n; i++)
				permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
		}
	}
}
