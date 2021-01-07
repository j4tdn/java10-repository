package datetime;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Ex07 {
	public static void main(String[] args) {
		Calendar start = Calendar.getInstance();
		start.set(2018, Calendar.APRIL, 26);
		
		Calendar today = Calendar.getInstance();
		
		if (today.before(start)) {
			throw new RuntimeException("Start date cannot greater than today!");
		}
		
		long lstart = start.getTimeInMillis();
		long lend = today.getTimeInMillis();
		long duration = lend - lstart;
		long left = duration;
		// 1 hour = 100s
		// 1 min = 10s
		// 1 s
		// 123 s
		
		// 100 + 20 + 3
		// 24 60 60 1000
		long days = TimeUnit.MILLISECONDS.toDays(duration);
		left -= TimeUnit.DAYS.toMillis(days);
		
		long hours = TimeUnit.MILLISECONDS.toHours(left);
		left -= TimeUnit.HOURS.toMillis(hours);
		
		long minutes = TimeUnit.MILLISECONDS.toMinutes(left);
		left -= TimeUnit.MINUTES.toMillis(minutes);
		
		long seconds = TimeUnit.MILLISECONDS.toSeconds(left);
		left -= TimeUnit.SECONDS.toMillis(seconds);		
	
		System.out.println("days: " + days);
		System.out.println("hours: " + hours);
		System.out.println("minutes: " + minutes);
		System.out.println("seconds: " + seconds);
	}
}
