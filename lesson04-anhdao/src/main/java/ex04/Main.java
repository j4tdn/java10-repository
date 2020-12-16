package ex04;

import java.util.Scanner;

public class Main {
	public static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		// initial data of company
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
		
		// output data employees
		System.out.print("Director : " + director1 + "\n Manager : " + manager1 + "\n personnel 1 : " + personnel1
				+ "\n personnel 2 : " + personnel2);
		
		// salary
		director1.salary();
		manager1.salary();
		personnel1.salary();
		personnel2.salary();
	}
	
}
