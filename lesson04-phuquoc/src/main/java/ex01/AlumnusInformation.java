package ex01;

import java.util.Scanner;

public class AlumnusInformation {
	public static void main(String[] args) {
		Alumnus alumnus01 = new Alumnus(1, "Duong Phu Quoc", 8, 9);
		Alumnus alumnus02 = new Alumnus(2, "Nguyen Van Teo", 6, 7);
		Alumnus alumnus03 = new Alumnus();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the id alumnus03: ");
		alumnus03.setIdAlumnus(scanner.nextInt());
		scanner.nextLine();
		System.out.println("Enter the full name alumnus 03: ");
		alumnus03.setFullName(scanner.nextLine());
		System.out.println("Enter the point theoretical: ");
		alumnus03.setPointTheoretical(scanner.nextFloat());
		System.out.println("Enter the point practice: ");
		alumnus03.setPointPractice(scanner.nextFloat());
		
		System.out.println("================================Alumnus List================================");
		System.out.println("" + alumnus01);
		System.out.println("" + alumnus02);
		System.out.println("" + alumnus03);
	}
}
