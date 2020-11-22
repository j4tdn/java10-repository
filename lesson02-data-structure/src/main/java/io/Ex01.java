package io;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		//enter fullname
		System.out.println("Enter fullname: ");
		String fullname = ip.nextLine();
		//enter age
		System.out.println("Enter age: ");
		int age = Integer.parseInt(ip.nextLine());
		//enter grade
		System.out.println("Enter grade: ");
		String grade = ip.nextLine();
		//enter point
		System.out.println("Enter point: ");
		float point = ip.nextFloat();
		System.out.println(fullname +"-" + age +"-"+ point +"-"+grade );
	
		
	}

}
