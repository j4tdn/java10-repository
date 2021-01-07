package datetime;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Ex07 {
	public static void main(String[] args) {
		Calendar start = Calendar.getInstance();
		start.set(2021, Calendar.JANUARY, 6, 0, 0, 0);

		Calendar today = Calendar.getInstance();

		if (today.before(start)) {
			throw new RuntimeException("start date cannot greater than today!!");

		}

		long lstrat = start.getTimeInMillis();
		long lend = today.getTimeInMillis();
		long duration = lend - lstrat;
		long left = duration;

		long days = TimeUnit.MILLISECONDS.toDays(duration);
		duration -= TimeUnit.DAYS.toMillis(days);

		long hours = TimeUnit.MILLISECONDS.toHours(duration);
		duration -= TimeUnit.HOURS.toMillis(hours);

		long minutes = TimeUnit.MILLISECONDS.toMinutes(duration);
		duration -= TimeUnit.HOURS.toMillis(minutes);

		long seconds = TimeUnit.MILLISECONDS.toSeconds(duration);
		duration -= TimeUnit.HOURS.toMillis(seconds);

		System.out.println("day: " + days);
		System.out.println("hour: " + hours);
		System.out.println("minute: " + minutes);
		System.out.println("second: " + seconds);
	}

}