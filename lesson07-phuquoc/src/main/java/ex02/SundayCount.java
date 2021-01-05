package ex02;

import java.util.Calendar;

public class SundayCount {
	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();
		sundayCount(c);
	}

	private static void sundayCount(Calendar c) {
		int count = 0;

		Calendar c1 = Calendar.getInstance();

		Calendar c2 = Calendar.getInstance();
		c2.set(2021, 01, 01);
		c1.set(Calendar.DAY_OF_MONTH, 1);
		while (c1.before(c2)) {
			int da = c1.get(Calendar.DAY_OF_WEEK);
			int day = c1.get(Calendar.DAY_OF_MONTH);
			int month = c1.get(Calendar.MONTH);
			int year = c1.get(Calendar.YEAR);
			c1.add(Calendar.DAY_OF_MONTH, 1);
			if (da == Calendar.SUNDAY ) {
				count++;
				System.out.println(day + "," + month + "," + year +" is sunday");
			}

		}
		System.out.println("Number of Sundays in the current month: " + count);

	}

}