package ex01;

import java.util.Scanner;

public class StudentDemo {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		Student St1 = new Student(001, "Tạ Quốc Thắng", 7, 7);
		Student St2 = new Student(002, "Tạ Quốc Thông", 8, 8);
		Student St3 = new Student();
		System.out.println("Student 3");
		System.out.print("Nhập MSV:");
		St3.setIdStudent(Long.parseLong(ip.nextLine()));
		System.out.print("Nhập tên:");
		St3.setFullName(ip.nextLine());
		System.out.print("Nhập điểm lý thuyết:");
		St3.setTheoreticalPoint(ip.nextFloat());
		System.out.print("Nhập điểm thực hành:");
		St3.setPracticePoint(ip.nextFloat());
		
		System.out.println(St1);
		System.out.println(St2);
		System.out.println(St3);
	}
}
