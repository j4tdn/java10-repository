package ex04;

import java.util.Scanner;

public class Ex04 {
	public static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {

		People director1 = new Director();
		System.out.println("Director :");
		director1.input();

		People manager1 = new Manager();
		System.out.println("Manager :");
		manager1.input();

		People personnel1 = new Personnel();
		People personnel2 = new Personnel();
		System.out.println("personnel 1 :");
		personnel1.input();
		System.out.println("personnel 2 :");
		personnel2.input();
		
		
		System.out.print("[Director : " + director1 + "]\n[Manager : " + manager1 + "]\n[Personnel 1 : " + personnel1
				+ "]\n[Personnel 2 : " + personnel2 + "]\n");
		
		director1.salary();
		manager1.salary();
		personnel1.salary();
		personnel2.salary();
}
}
