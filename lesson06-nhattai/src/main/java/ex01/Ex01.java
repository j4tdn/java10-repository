package ex01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		double result = 0;
		do {
			try {
				result = fde();
				break;
			} catch (RuntimeException e) {
				System.out.println(e.getMessage());
				System.out.println("Nhập lại !!!");
			}
		} while (true);

	}

	private static double fde() throws RuntimeException {
		int a, b;
		double result = 0;
		DecimalFormat decimalFormat = new DecimalFormat("#.##"); // làm tròn đến 2 chữ số thập phân
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập vào số a: ");
		a = scanner.nextInt();
		System.out.println("Nhập vào số b: ");
		b = scanner.nextInt();

		if (a == 0) {
			if (b == 0) {
				System.out.println("Phương trình này có vô số nghiệm.");
			} else {
				throw new RuntimeException();
			}
		} else {
			result = (double) -b / a;
			System.out.println("Phương trình có nghiệm x = " + decimalFormat.format(result) + ".");
		}
		return result;
	}
}
