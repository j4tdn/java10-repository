package ex06;

import java.util.Calendar;

public class NumberDay {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		findDay(c);
	}

	private static void findDay(Calendar c) {
		int dem = 0;
		int dem1 = 0;
		int dem2 = 0;

		Calendar c1 = Calendar.getInstance();
		c1.setTimeInMillis(c.getTimeInMillis());
		c1.set(2021, 0, 5);

		Calendar c2 = Calendar.getInstance();
		c2.setTimeInMillis(c.getTimeInMillis());
		c2.set(2021, 1, 1);

		while (c1.before(c2)) {
			int day = c1.get(Calendar.DAY_OF_WEEK);
			if (day == Calendar.SUNDAY) {
				System.out.println("Chủ Nhật:"+
						c1.get(Calendar.DAY_OF_MONTH) + "," + c1.get(Calendar.MONTH) + "," + c1.get(Calendar.YEAR));
				dem1 = dem1 + 1;
			}
			if (day == Calendar.THURSDAY) {
				System.out.println("Thứ Năm:"+
						c1.get(Calendar.DAY_OF_MONTH) + "," + c1.get(Calendar.MONTH) + "," + c1.get(Calendar.YEAR));
				dem2 = dem2 + 1;
			}
			dem = dem1 + dem2;

			c1.add(Calendar.DAY_OF_YEAR, 1);
		}
		System.out.println("\nSố buổi đi học từ đây đến tết là:" + dem);

	}

}
