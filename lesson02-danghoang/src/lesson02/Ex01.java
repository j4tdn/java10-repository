package lesson02;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int a = ip.nextInt();
		int b = ip.nextInt();
		int c = ip.nextInt();
		int temp;
		if (a > b) {
			temp = a;
			a = b;
			b = temp;
		}

		if (a > c) {
			temp = a;
			a = c;
			c = temp;
		}

		if (b > c) {
			temp = b;
			b = c;
			c = temp;
		}

		System.out.print(a + " ");
		System.out.print(b + " ");
		System.out.println(c);

	}

}
