package anhtuan.lesson02_anhtuan;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		int n;
		Scanner ip = new Scanner(System.in);
		System.out.println("Decimal=");
		n = ip.nextInt();
		System.out.println("binary:" + Binary(n));
	}

	private static String Binary(int n) {
		int remainder;
		String result = "";
		while (n > 0) {
			remainder = n % 2;
			n = n / 2;
			result = remainder + result;
		}
		return result;
	}
}
