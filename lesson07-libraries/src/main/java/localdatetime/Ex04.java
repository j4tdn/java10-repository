package localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.Duration;

public class Ex04 {
	public static void main(String[] args) {
		// 18/8/2020 10:20:10 -> 10/10/2021 15:20:20 
		LocalDateTime datetimeStart = LocalDateTime.of(2020, 8, 18, 10, 20, 10);
		LocalDateTime dateTimeEnd = LocalDateTime.of(2021, 10, 10, 15, 20, 20);
		
		System.out.println(between(datetimeStart, dateTimeEnd));
	}
	
	private static String between(LocalDateTime datetimeStart, LocalDateTime datetimeEnd) {
		LocalDate dateStart = datetimeStart.toLocalDate();
		LocalDate dateEnd = datetimeEnd.toLocalDate();
		
		LocalTime timeStart = datetimeStart.toLocalTime();
		LocalTime timeEnd = datetimeEnd.toLocalTime();
		
		Period period = Period.between(dateStart, dateEnd);
		Duration duration = Duration.between(timeStart, timeEnd);
		
		if (timeEnd.isBefore(timeStart)) {
			duration = duration.plusDays(1);
			period = period.minusDays(1);
		}
		
		return period.toString() + " - " + duration.toString();
	}
}	
