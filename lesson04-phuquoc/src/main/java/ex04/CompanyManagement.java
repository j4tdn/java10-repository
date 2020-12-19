package ex04;

import java.util.Scanner;

public class CompanyManagement {
	public static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("============President============");
		People president1 = new President();
		president1.input();
		
		System.out.println("============Manager============");
		People manager1 = new Manager();
		manager1.input();
		
		System.out.println("============Staff 1============");
		People staff1 = new Staff();
		staff1.input();
		
		People staff2 = new Staff();
		staff2.input();

		System.out.print("[President : " + president1 + "]\n[Manager : " + manager1 + "]\n[Staff 1 : " + staff1
				+ "]\n[Staff 2 : " + staff2 + "]\n");
		
		president1.salary();
		manager1.salary();
		staff1.salary();
		staff2.salary();
	}
}