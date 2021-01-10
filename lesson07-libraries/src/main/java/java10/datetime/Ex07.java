package java10.datetime;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Ex07 {
	public static void main(String[] args) {
		Calendar start = Calendar.getInstance();
		start.set(2018, Calendar.JANUARY, 6, 0,0,0);

		Calendar today = Calendar.getInstance();

		if (today.before(start)) {
			throw new RuntimeException("Start date can't greater than today!");
		}

		long lstart = start.getTimeInMillis();
		long lend = today.getTimeInMillis();
		long duration = lstart - lend;
		long left = duration;

		long days = TimeUnit.MILLISECONDS.toDays(duration);
		left = duration - TimeUnit.DAYS.toMillis(days);

		long hours = TimeUnit.MILLISECONDS.toDays(duration);
		left -= TimeUnit.DAYS.toMillis(days);
		long minutes = TimeUnit.MILLISECONDS.toMinutes(duration);
		left -= TimeUnit.DAYS.toMillis(minutes);
		long second = TimeUnit.MILLISECONDS.toMinutes(duration);
		left -= TimeUnit.DAYS.toMillis(second);
		System.out.println("days: " + days);
		System.out.println("hours: " + hours);
		System.out.println("minutes: " + minutes);
		System.out.println("seconds: " + second);

	}
}
