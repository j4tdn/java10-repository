package datetime;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Ex07CountDay {
	public static void main(String[] args) {
		Calendar start = Calendar.getInstance();
		start.set(2018, Calendar.APRIL, 26, 0, 0, 0);
		
		Calendar today = Calendar.getInstance();
		
		if (today.before(start)) {
			throw new RuntimeException("Start date cann't greater than today");
		}
		
		long lStart = start.getTimeInMillis();
		long lToday = today.getTimeInMillis();
		
		long duration = lToday - lStart;
		long left = duration;
		
		long days = TimeUnit.MILLISECONDS.toDays(duration);
		left -=  TimeUnit.DAYS.toMillis(days);
		long hours = TimeUnit.MILLISECONDS.toHours(left);
		left -=  TimeUnit.HOURS.toMillis(hours);
		long min = TimeUnit.MILLISECONDS.toMinutes(left);
		left -= TimeUnit.MINUTES.toMillis(min);
		long sec = TimeUnit.MILLISECONDS.toSeconds(left);
		
		System.out.println(days + " days");
		System.out.println(hours + " hours");
		System.out.println(min + " minutes");
		System.out.println(sec + " seconds");
	}
}
