package ex05;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Calendar;

public class FindTime {
	public static void main(String[] args) {
		LocalDateTime from = LocalDateTime.of(1999, 9, 21, 1, 00, 00);
		LocalDateTime to = LocalDateTime.of(2021, 1, 05, 12, 51, 00);
		
		LocalDateTime conversant = LocalDateTime.of(2016, 8, 8, 1, 00, 00);
		LocalDateTime now = LocalDateTime.of(2021, 1, 05, 12, 51, 00);
		
		Duration duration = Duration.between(from, to);
		System.out.println("The time from birth to the present: \n" + duration.toDays() + " days, "
				+ duration.toHours() + " hours ," + duration.toMinutes() + " minutes, "+ duration.toSeconds()+" seconds ");
		
		Duration duration1 = Duration.between(conversant, now);
		System.out.println("\nThe acquainted time: \n" + duration1.toDays() + " days, "
				+ duration1.toHours() + " hours ," + duration1.toMinutes() + " minutes, "+ duration1.toSeconds()+" seconds ");
	}
}
