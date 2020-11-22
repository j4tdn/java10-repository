package io;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nhập xuất");

		Scanner ip = new Scanner(System.in);
		// Nhập string -- enter string
		// enter full name
		System.out.println("Nhập chuỗi full name : ");
		String fullname = ip.nextLine();
		
		
		// enter age

		System.out.println("Nhập tuổi");
		int age = ip.nextInt();
//		int age = Integer.parseInt(ip.nextLine());
		//-> xem lại 

		
		// enter grade : lớp
		System.out.println("Nhập lớp: ");
		String grade = ip.nextLine();

		// enter diem trung bình point
		System.out.println("Nhập điểm trung bình: ");
		float point = ip.nextFloat();

		System.out.println(fullname + " - " + age + " - " + grade + " - " + point);

	}

}
//dòng 22-24 thêm sau khi code tất cả trước : hiện tượng trôi lệnh
// sau khi enter sẽ lưu lệnh enter là 1 giá trị:
