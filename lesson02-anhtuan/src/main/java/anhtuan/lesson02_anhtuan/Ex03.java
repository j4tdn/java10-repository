package anhtuan.lesson02_anhtuan;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("enter number:");
		int num = Integer.parseInt(ip.nextLine());
		Symmetrical(num);
	}

	public static void Symmetrical(int num) {
		int reversedInteger = 0, surplus, originalInteger;
		originalInteger = num;
		while (num != 0) {
			surplus = num % 10;
			reversedInteger = reversedInteger * 10 + surplus;
			num /= 10;
		}
		if (originalInteger == reversedInteger)
			System.out.println(originalInteger + " is the number symmetry");
		else
			System.out.println(originalInteger + " is not the number symmetry");
	}
}
