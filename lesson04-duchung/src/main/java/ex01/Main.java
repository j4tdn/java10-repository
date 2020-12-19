package ex01;

import java.util.Scanner;

public class Main {
private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Student stu1 = new Student(239, "Trần Đức Hùng", 8.5f, 9);
		
		Student stu2 = new Student(156, "Trần Thị Thu Hồng", 8, 9);
		
		Student stu3 = new Student();
		System.out.println("Student 3");
		System.out.println("Enter ID: ");
		stu3.setId(Long.parseLong(sc.nextLine()));
		System.out.println("Enter full name: ");
		stu3.setFullName(sc.nextLine());
		System.out.println("Enter theoretical: ");
		stu3.setTheoretical(sc.nextFloat());
		System.out.println("Enter practical: ");
		stu3.setPractical(sc.nextFloat());
		
		System.out.println("=========================");
		System.out.println("Student List: ");
		System.out.println(stu1);
		System.out.println(stu2);
		System.out.println(stu3);
	}
}
