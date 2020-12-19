package ex01;

import java.util.Scanner;

public class Ex01 {

	private static final Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {

		Student st1 = new Student(12, "Đặng Công Thư", 10, 9);
		Student st2 = new Student(10, "Đặng Công Khải", 6, 5);
		Student st3 = new Student();

		System.out.println("Nhập thông tin sv3:");
		System.out.print("Mã sinh vien: ");
		st3.setId(Integer.parseInt(ip.nextLine()));
		System.out.print("Họ và tên: ");
		st3.setName(ip.nextLine());
		System.out.print("Điểm lí thuyết: ");
		st3.setPointLT(Float.parseFloat(ip.nextLine()));
		System.out.print("Điểm thực hành: ");
		st3.setPointTH(Float.parseFloat(ip.nextLine()));
		System.out.println();

		Student[] students = {st1, st2, st3};
		for(Student student : students) {
			System.out.println(student);
		}

	}

}
