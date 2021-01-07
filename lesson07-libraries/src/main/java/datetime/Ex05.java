package datetime;

import utils.DateUtils;

public class Ex05 {
	public static void main(String[] args) {
		int year = 2020;
		System.out.println("isLeapYear " + DateUtils.isLeapYear(year));
		
		// year % 400 = 0;
		// year % 4 - 0 && year % 100 != 0
	}
}
