package ex04;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class NumberOfSunday {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(new Locale("vi", "VN"));
		System.out.println("Number of sunday in this month: " + countSunday(cal));
	}
	
	private static int countSunday(Calendar c) {
		Calendar c1 = Calendar.getInstance();
		c1.setTimeInMillis(c.getTimeInMillis());
		c1.set(Calendar.DAY_OF_MONTH, c.getActualMinimum(Calendar.DAY_OF_MONTH));
		
		Calendar c2 = Calendar.getInstance();
		c2.setTimeInMillis(c.getTimeInMillis());
		c2.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
		c2.add(Calendar.DAY_OF_MONTH, 1);
		
		int count = 0;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
		String date = "";
		
		while (c1.before(c2)) {
			if (c1.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				date = sdf.format(c1.getTime());
				System.out.println(date);
				count++;
			}
			c1.add(Calendar.DAY_OF_MONTH, 1);
		}
		return count;
	}
}