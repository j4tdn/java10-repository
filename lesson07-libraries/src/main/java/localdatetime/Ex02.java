package localdatetime;

import java.time.Duration;
import java.time.LocalTime;

public class Ex02 {
	public static void main(String[] args) {
		LocalTime lstart = LocalTime.of(10, 10, 10);
		LocalTime lend = LocalTime.of(12, 11, 30);
		
		System.out.println("itime: " + lstart);
		System.out.println("hour: " + lstart.getHour());
		System.out.println("minute: " + lstart.getMinute());
		System.out.println("second: " + lstart.getSecond());
		
		Duration duration = Duration.between(lstart, lend);
		String dString = duration.toHoursPart() + " H " + duration.toMinutesPart() + " M " + duration.toSecondsPart() + " S ";
		System.out.println("duration: " + dString);
	}
}
