package NhatTai.lesson02_nhattai;

import java.util.Scanner;

public class ex01 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("enter a: ");
		int a = Integer.parseInt(ip.nextLine());
		System.out.print("enter b: ");
		int b = Integer.parseInt(ip.nextLine());
		System.out.print("enter c: ");
		int c = Integer.parseInt(ip.nextLine());

		ascending(a, b, c);

	}

	private static void ascending(int a, int b, int c) {
		int tmp;
		if (a > b) {
			tmp = a;
			a = b;
			b = tmp;
		}
		if (a > c) {
			tmp = a;
			a = c;
			c = tmp;
		}
		if (b > c) {
			tmp = b;
			b = c;
			c = tmp;
		}

		System.out.println("ascending: " + a + b + c);

	}
}
