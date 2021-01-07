package datetime;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Ex07 {
	public static void main(String[] args) {
		Calendar start = Calendar.getInstance();
		start.set(2020, Calendar.APRIL, 26, 0 , 0, 0);
		Calendar today = Calendar.getInstance();

		if (today.before(start)) {
			throw new RuntimeException("Start day can not greater than today");
		}

		long lstart = start.getTimeInMillis();
		long lend = today.getTimeInMillis();
		long duration = lend - lstart;
		long left = duration;
		
		long days = TimeUnit.MILLISECONDS.toDays(duration);
		duration -=  TimeUnit.DAYS.toMillis(days);
		
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
