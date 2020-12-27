package datetime;

import java.util.Calendar;

/**
 * 2. Duyệt và in ra các ngày + Trong tháng + Giữa 2 mốc thời gian
 * 
 * @author KIM ANH
 *
 */
public class Ex02 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		loopDayInMonth(c);
	}

	private static void loopDayInMonth(Calendar c) {
		Calendar c1 = Calendar.getInstance();
		c1.setTimeInMillis(c.getTimeInMillis());
		c1.set(Calendar.DAY_OF_MONTH, c.getActualMinimum(Calendar.DAY_OF_MONTH));
		Calendar c2 = Calendar.getInstance();
		c2.setTimeInMillis(c.getTimeInMillis());
		c2.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
		c2.add(Calendar.DAY_OF_MONTH, 1);

		while (c1.before(c2)) {
			int day = c1.get(Calendar.DAY_OF_MONTH);
			int month = c1.get(Calendar.MONTH);
			int year = c1.get(Calendar.YEAR);
			System.out.println(day + "," + month + "," + year);
			c1.add(Calendar.DAY_OF_MONTH, 1);
		}
	}
}
