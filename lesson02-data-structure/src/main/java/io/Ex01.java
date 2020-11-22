package io;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		// enter full name
		System.out.print("Enter full name: ");
		String fullname = ip.nextLine();

		// enter age
		System.out.print("Enter age: ");
		
		int age = ip.nextInt();
		//int age = Integer.parseInt(ip.nextLine()); lam lai
		ip.nextInt();

		// enter grade
		System.out.print("Enter grade: ");
		String grade = ip.nextLine();

		// enter point
		System.out.print("Enter point: ");
		float point = ip.nextFloat();

		System.out.println(fullname + " - " + age + " - " + grade + " - " + point);
	}
}
