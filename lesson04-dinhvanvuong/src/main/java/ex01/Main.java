package ex01;

import java.util.Scanner;

public class Main {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Student sv1 = new Student(3626, "Đinh Văn Vương", 9, 8);
		Student sv2 = new Student(2635, "Dương Quốc Bảo", 10, 8);
		Student sv3 = new Student();
		System.out.println("Student Three:");
		System.out.println("Enter ID: ");
		sv3.setId(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter full name: ");
		sv3.setFullName(sc.nextLine());
		System.out.println("Enter TheoreticalPoint: ");
		sv3.setTheoreticalPoint(sc.nextFloat());
		System.out.println("Enter PracticePoint: ");
		sv3.setPracticePoint(sc.nextFloat());

		System.out.println("==============================");
		System.out.println("Student: ");
		System.out.println(sv1);
		System.out.println("======================================================");
		System.out.println(sv2);
		System.out.println("======================================================");
		System.out.println(sv3);

	}

}
