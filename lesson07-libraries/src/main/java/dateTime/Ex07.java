package dateTime;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Ex07 {
	public static void main(String[] args) {
		Calendar start = Calendar.getInstance();
		start.set(2019, Calendar.APRIL, 02, 1, 20, 10);
		
		Calendar now = Calendar.getInstance();
		if(now.before(start)) {
			throw new RuntimeException("Start date cannot greater than today");
			
		}
		
		long duration = now.getTimeInMillis() - start.getTimeInMillis();
		long days = TimeUnit.MILLISECONDS.toDays(duration);
		
		long redundantHours = duration - TimeUnit.DAYS.toMillis(days);		
		long hours = TimeUnit.MILLISECONDS.toHours(redundantHours);
		
		long redundantMinutes = redundantHours - TimeUnit.HOURS.toMillis(hours);		
		long minutes = TimeUnit.MILLISECONDS.toMinutes(redundantMinutes);
		
		long redundantSeconds = redundantMinutes - TimeUnit.MINUTES.toMillis(hours);		
		long seconds = TimeUnit.MILLISECONDS.toSeconds(redundantSeconds);
		
		System.out.println(days + " Days - " + hours + " hours - " + minutes + " minutes -" + seconds + " seconds" );

	}
}
