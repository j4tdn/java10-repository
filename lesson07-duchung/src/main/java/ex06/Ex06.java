package ex06;

import java.util.Calendar;

public class Ex06 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		loopDayInMonth(c);
	}

	private static void loopDayInMonth(Calendar c) {
		Calendar c1 = Calendar.getInstance();
		c1.setTimeInMillis(c.getTimeInMillis());
		c1.isSet(Calendar.DAY_OF_MONTH);
		
		Calendar c2 = Calendar.getInstance();
		c2.set(2021,02,01);
		c2.add(Calendar.DAY_OF_MONTH, 1);
        int count=0;
		while (c1.before(c2)) {
			int da=c1.get(Calendar.DAY_OF_WEEK);
			int day = c1.get(Calendar.DAY_OF_MONTH);
			int month = c1.get(Calendar.MONTH)+1;
			int year = c1.get(Calendar.YEAR);
			if(da==Calendar.SUNDAY || da==Calendar.THURSDAY ) {
				count++;
			}
			c1.add(Calendar.DAY_OF_MONTH, 1);
		}
		System.out.println("\nSố buổi đi học là:" + count);
	}
}
