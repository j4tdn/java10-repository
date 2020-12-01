package lesson02;

import java.util.Scanner;

public class Ex01 {
	  //bai1
public static void main(String[] args) {
	
	try (Scanner ip = new Scanner(System.in)) {
		System.out.print("number a: ");
		int a = Integer.parseInt(ip.nextLine());
		System.out.print("number b: ");
		int b = Integer.parseInt(ip.nextLine());
		System.out.print("number c: ");
		int c = Integer.parseInt(ip.nextLine());

		ascending(a, b, c);
	}

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
