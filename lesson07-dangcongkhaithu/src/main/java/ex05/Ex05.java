package ex05;

import java.util.Calendar;

public class Ex05 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println("Năm hiện tại là năm nhuận !!");
		} else {
			System.out.println("Năm hiện tại không phải năm nhuận !!");
		}

	}

}
