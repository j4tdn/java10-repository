package ex01;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		Students St1 = new Students(001, "Trần Nhật Tài", 7, 9);
		Students St2 = new Students(002, "Tuấn Nguyễn", 6, 8);
		Students St3 = new Students();
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
