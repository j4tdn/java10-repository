package localdatetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class Ex04 {
	public static void main(String[] args) {
		// 18.08.2020 10:20:10 ==> 10.10.2021 15:20:20
		LocalDateTime ldtStart = LocalDateTime.of(2021, 10, 8, 10, 20, 10);
		LocalDateTime ldtEnd = LocalDateTime.of(2021, 10, 10, 8, 22, 20);
		
		String result = between(ldtStart, ldtEnd);
		System.out.println(result);
		// a Y b M c D x H y m z s
		
		
	}
	
	private static String between(LocalDateTime ldtStart, LocalDateTime ldtEnd) {
		LocalDate ldStart = ldtStart.toLocalDate();
		LocalDate ldEnd = ldtEnd.toLocalDate();
		
		LocalTime ltStart = ldtStart.toLocalTime();
		LocalTime ltEnd = ldtEnd.toLocalTime();
		
		Period period = Period.between(ldStart, ldEnd);
		Duration duration = Duration.between(ltStart, ltEnd);
		
		if (ltEnd.isBefore(ltStart)) {
			duration = duration.plusDays(1);
			period = period.minusDays(1);
		}
		
		return period.toString() +  "'T'" +  duration.toString();
	}
}
