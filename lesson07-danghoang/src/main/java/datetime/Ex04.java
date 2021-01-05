package datetime;

import java.util.Calendar;

/**
 * 2. Duyệt và in ra các ngày + Trong tháng + Giữa 2 mốc thời gian
 */

public class Ex04 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		loopDaysInMonth(c);
	}

	private static void loopDaysInMonth(Calendar c) {
		Calendar c1 = Calendar.getInstance();
		c1.setTimeInMillis(c1.getTimeInMillis());
		c1.set(Calendar.DAY_OF_MONTH, c.getActualMinimum(Calendar.DAY_OF_MONTH));

		Calendar c2 = Calendar.getInstance();
		c2.setTimeInMillis(c2.getTimeInMillis());
		c2.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));

		int count = 0;
		while (c1.before(c2)) {
			int ss = c1.get(Calendar.DAY_OF_WEEK);
			int day = c1.get(Calendar.DAY_OF_MONTH);
			int month = c1.get(Calendar.MONTH)+1;
			int year = c1.get(Calendar.YEAR);

			if (ss == Calendar.SUNDAY) {

				System.out.println(day + ", " + month + ", " + year);
				count++;
			}
			c1.add(Calendar.DAY_OF_MONTH, 1);
		}
		System.out.println("So ngay chu nhat la: " + count);
	}
}