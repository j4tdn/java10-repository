package lesson07;

import java.util.Calendar;

/**
 * Đếm xem tháng hiện có bao nhiêu ngày chủ nhật. In ra thông tin dd/MM/yyyy
 *
 */
public class Ex04 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		sundayInMonth(c);
	}

	private static void sundayInMonth(Calendar c) {
		Calendar c1 = Calendar.getInstance();
		c1.setTimeInMillis(c.getTimeInMillis());
		c1.set(Calendar.DAY_OF_MONTH, c.getActualMinimum(Calendar.DAY_OF_MONTH));

		Calendar c2 = Calendar.getInstance();
		c2.setTimeInMillis(c.getTimeInMillis());
		c2.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
		c2.add(Calendar.DAY_OF_MONTH, 1);
		int count = 0;
		while (c1.before(c2)) {
			if (c1.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				++count;
				int day = c1.get(Calendar.DAY_OF_MONTH);
				int month = c1.get(Calendar.MONTH) + 1;
				int year = c1.get(Calendar.YEAR);
				System.out.println(day + " - " + month + " - " + year);

			}
			c1.add(Calendar.DAY_OF_MONTH, 1);
		}
		System.out.println("Số ngày Chủ nhật trong tháng : " + count);
	}
}
