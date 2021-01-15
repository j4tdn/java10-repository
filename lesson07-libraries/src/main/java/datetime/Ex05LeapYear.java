package datetime;

import utils.DateUtils;

public class Ex05LeapYear {
	public static void main(String[] args) {
		int year = 2012;
		System.out.println("isLeapYear: " + DateUtils.isLeapYear(year));
	}
}