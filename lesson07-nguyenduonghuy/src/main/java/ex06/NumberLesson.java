package ex06;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class NumberLesson {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println("Number of lesson: " + countLesson(cal));
	}
	
	private static int countLesson(Calendar c) {
		Calendar c1 = Calendar.getInstance();
		c1.setTimeInMillis(c.getTimeInMillis());
		
		Calendar c2 = Calendar.getInstance();
		c2.setTimeInMillis(c.getTimeInMillis());
		c2.set(2021, Calendar.FEBRUARY, 1);
		
		int count = 0;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
		String date = "";
		while (c1.before(c2)) {
			if (c1.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY || c1.get(Calendar.DAY_OF_WEEK) == Calendar.THURSDAY) {
				date = sdf.format(c1.getTime());
				System.out.println(date);
				count ++;
			}
			c1.add(Calendar.DAY_OF_MONTH, 1);
		}
		return count;
	}
}
