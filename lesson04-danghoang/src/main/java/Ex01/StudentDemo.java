package Ex01;

import java.util.Scanner;

public class StudentDemo {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		Student St1 = new Student(001, "Kevin Dang", 9, 9);
		Student St2 = new Student(002, "Alex Nguyen", 7, 8);
		Student St3 = new Student();
		System.out.println("Enter 3rd student information ");
		System.out.print("Nhập MSV:");
		St3.setIdStudent(Long.parseLong(ip.nextLine()));
		System.out.print("Nhập tên:");
		St3.setFullName(ip.nextLine());
		System.out.print("Nhập điểm lý thuyết:");
		St3.setThPoint(ip.nextFloat());
		System.out.print("Nhập điểm thực hành:");
		St3.setPrPoint(ip.nextFloat());

		System.out.println(St1);
		System.out.println(St2);
		System.out.println(St3);
	}

}