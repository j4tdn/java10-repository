package ex01;

import java.util.Scanner;

public class Main {
	public static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		Student student1 = new Student(202001, " Pham Thi Anh Dao", 8, 9);
		Student student2 = new Student(202002, " le Thanh Thuy", 9, 10);
		
		Student student3 = new Student();
		System.out.println(" Enter student3 information: ");
		System.out.print(" ID: " );  
		student3.setId(Integer.parseInt(ip.nextLine()));
		System.out.print(" FullName: " );
		student3.setFullName(ip.nextLine());
		System.out.print(" theoryPoint: " );  
		student3.setTheoryPoint(ip.nextFloat());
		System.out.print(" performPoint: " );  
		student3.setPerformPoint(ip.nextFloat());
		
	System.out.println("ID" + "\t\t" + "FullName" + "\t\t" + "theoryPoint" + "\t\t" + "performPoint" + "\t\t" + "Mean"  );
		System.out.println(student1 + "\n\n" + student2 + "\n\n" + student3 );
	}

}

