package lesson07;

import java.util.GregorianCalendar;

// Kiểm tra 1 năm có phải là năm nhuận.

public class Ex05 {
	public static void main(String[] args) {
		boolean isLeapYear = isLeapYear(2020);
		System.out.println(isLeapYear ? "Leap Year" : "NOT");
		System.out.println("===============================");
		
		// hoặc dùng cách này
		GregorianCalendar gr = new GregorianCalendar();
		System.out.println(gr.isLeapYear(2020) ? "Leap Year" : "NOT");

	}

	private static boolean isLeapYear(int year) {
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}

}
