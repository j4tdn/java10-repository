package ex01;

import java.util.Scanner;

public class demo {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		Students St1 = new Students(001, "Nguyễn Văn Anh Tuấn", 7, 9);
		Students St2 = new Students(002, "Trần Nhật Tài", 6, 8);
		Students St3 = new Students();
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
