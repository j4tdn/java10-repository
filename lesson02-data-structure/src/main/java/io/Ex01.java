package io;

import java.util.Scanner;

public class Ex01 {
public static void main(String[] args) {
	Scanner ip =new Scanner(System.in);
	//enter fullname
	System.out.println(" enter fullname :");
	String fullname = ip.nextLine();
	//enter age
	System.out.println(" enter age:");
	int age = Integer.parseInt(ip.nextLine());
	// enter grade
	System.out.println(" enter grade:");
	String grade =ip.nextLine();
	// enter point
	System.out.println("enter point");
	float point =ip.nextFloat();
	System.out.println(fullname + "-" +age + "-" + point +"-" + grade );
}
}
