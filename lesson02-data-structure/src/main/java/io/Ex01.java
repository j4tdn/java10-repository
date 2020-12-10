package io;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//enter fullname
		System.out.print("Enter fullname: ");
		String fullname = sc.nextLine();
		
		// enter age
		System.out.print("Enter age: ");
		//int age = sc.nextInt();
		
		// Cach 1: 
		//sc.nextLine();
		
		// Cach 2: 
		int age = Integer.parseInt(sc.nextLine());
		
		// enter grade 
		System.out.print("Enter grade: ");
		String grade = sc.nextLine();
		
		// enter point
		System.out.print("Enter point: ");
		float point = sc.nextFloat();
		
		System.out.println(fullname + " - " + age + " - " + grade + " - " + point);
	}
}
