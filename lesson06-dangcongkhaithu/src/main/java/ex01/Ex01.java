package ex01;

import java.util.Scanner;

public class Ex01 {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		int result = 0;
		try {
			result = isEquation();
		} catch (ArithmeticException e) {
			System.out.println("Lỗi chia cho 0 !!!");
		}
		System.out.println("Kết quả: " + result);

	}

	private static int isEquation() {
		int a = 0;
		int b = 0;
		do {
			System.out.println("Nhập tham số ");
			try {
				System.out.print("a = ");
				a = Integer.parseInt(ip.nextLine());
				System.out.print("b = ");
				b = Integer.parseInt(ip.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Nhập sai kiểu dữ liệu !!");
			}
		} while (true);
		return -b / a;
	}

}
	