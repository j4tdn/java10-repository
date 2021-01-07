package datetime;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Ex07 {
	public static void main(String[] args) {
		Calendar start = Calendar.getInstance();
		start.set(2020, 11, 01, 12, 20, 10);

		Calendar today = Calendar.getInstance();
		if (today.before(start)) {
			throw new RuntimeException("Start date can not greater than today!");
		}

		long lstart = start.getTimeInMillis();
		long lend = today.getTimeInMillis();

		long duration = lend - lstart;

		long days = TimeUnit.MILLISECONDS.toDays(duration);
		duration -= TimeUnit.DAYS.toMillis(days);

		long hours = TimeUnit.MILLISECONDS.toHours(duration);
		duration -= TimeUnit.HOURS.toMillis(hours);

		long minutes = TimeUnit.MILLISECONDS.toMinutes(duration);
		duration -= TimeUnit.MINUTES.toMillis(minutes);

		long seconds = TimeUnit.MILLISECONDS.toSeconds(duration);
		duration -= TimeUnit.SECONDS.toMillis(seconds);
	
		System.out.println("days: "+days);
		System.out.println("hours: "+hours);
		System.out.println("minutes: "+minutes);
		System.out.println("seconds: "+seconds);
	}
}
