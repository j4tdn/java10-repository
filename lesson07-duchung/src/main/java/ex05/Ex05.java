package ex05;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		int year;
		System.out.println("Mời bạn nhập vào năm: ");
		year = new Scanner(System.in).nextInt();
		checkLeapYear(year);

	}

	private static void checkLeapYear(int year) {
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println("Năm " + year + " là năm nhuận!");
				} else {
					System.out.println("Năm " + year + " không phải là năm nhuận!");
				}
			} else {
				System.out.println("Năm " + year + " là năm nhuận!");
			}
		} else {
			System.out.println("Năm " + year + " không phải là năm nhuận!");
		}
	}

}
