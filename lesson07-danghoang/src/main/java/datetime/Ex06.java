package datetime;

import java.util.Calendar;
import java.util.Locale;

/**
 * 2. Duyệt và in ra các ngày + Trong tháng + Giữa 2 mốc thời gian
 */

public class Ex06 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		loopDaysInMonth(c);
	}

	private static void loopDaysInMonth(Calendar c) {
		Calendar c1 = Calendar.getInstance(new Locale("vi", "VN"));
		c1.setTimeInMillis(c.getTimeInMillis());
		c1.isSet(Calendar.DAY_OF_MONTH);;

		Calendar c2 = Calendar.getInstance(new Locale("vi", "VN"));
		c2.set(c.YEAR,2021);
		c2.set(c.MONTH,2);
		c2.set(c.DAY_OF_MONTH,1);

		int count = 0;
		while (c1.before(c2)) {
			int ss = c1.get(Calendar.DAY_OF_WEEK);
			int day = c1.get(Calendar.DAY_OF_MONTH);
			int month = c1.get(Calendar.MONTH)+1;
			int year = c1.get(Calendar.YEAR);

			if (ss == Calendar.SUNDAY || ss == Calendar.THURSDAY) {

				System.out.println(day + ", " + month + ", " + year);
				count++;
			}
			c1.add(Calendar.DAY_OF_MONTH, 1);
		}
		System.out.println("So buoi di hoc: " + count);
	}
}