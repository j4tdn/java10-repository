package localdatetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class Ex04 {
	public static void main(String[] args) {
		LocalDateTime ldStart = LocalDateTime.of(2021, 10, 8, 10, 20, 10);
		LocalDateTime ldEnd = LocalDateTime.of(2021, 10, 10, 8, 22, 20);
		
		String result = between(ldStart, ldEnd);
		System.out.println(result);

	}

	private static String between(LocalDateTime ldStart, LocalDateTime ldEnd) {
	
		LocalDate ldateStart = ldStart.toLocalDate();
		LocalDate ldateEnd = ldEnd.toLocalDate();

		LocalTime ltimeStart = ldStart.toLocalTime();
		LocalTime ltimeEnd = ldEnd.toLocalTime();

		Period period = Period.between(ldateStart, ldateEnd);
		Duration duration = Duration.between(ltimeStart, ltimeEnd);
		
		if (ltimeEnd.isBefore(ltimeStart)) {
			duration = duration.plusDays(1);
			
			period = period.minusDays(1);
		}
		
		return period.toString() + " 'T' " + duration.toString();

	}

}
