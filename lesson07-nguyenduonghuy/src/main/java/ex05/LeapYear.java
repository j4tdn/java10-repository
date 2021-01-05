package ex05;

import java.util.Calendar;
import java.util.Locale;

public class LeapYear {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(new Locale("vi", "VN"));
		cal.set(Calendar.YEAR, 2024);
		if (isLeapYear(cal)) {
			System.out.println(cal.get(Calendar.YEAR) + " is a leap year");
		} else {
			System.out.println(cal.get(Calendar.YEAR) + " isn't a leap year");
		}
	}
	
	private static boolean isLeapYear(Calendar c) {
		return c.getActualMaximum(Calendar.DAY_OF_YEAR) == 366;
	}
}
