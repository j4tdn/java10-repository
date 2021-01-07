package ex04;

import java.util.Calendar;

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
			int dow=c1.get(Calendar.DAY_OF_WEEK);
			int day = c1.get(Calendar.DAY_OF_MONTH);
			int month = c1.get(Calendar.MONTH)+1;
			int year = c1.get(Calendar.YEAR);
			if(dow==Calendar.SUNDAY) {
				System.out.println(day + "-" + month + "-" + year);	
				count++;
			}
			c1.add(Calendar.DAY_OF_MONTH, 1);
		}
		System.out.println("Số ngày Chủ nhật: " + count);
	}
}
