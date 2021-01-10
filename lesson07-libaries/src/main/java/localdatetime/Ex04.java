package localdatetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class Ex04 {
	public static void main(String[] args) {
		LocalDateTime ldtStart = LocalDateTime.of(2020, 8, 18, 10, 20, 10);
		LocalDateTime ldtEnd = LocalDateTime.of(2021, 10, 10, 8, 15, 20);
		
		String timeLove = betWeen(ldtStart, ldtEnd);
		
		System.out.println(timeLove);
	}
	
	private static String betWeen(LocalDateTime start, LocalDateTime end) {
		LocalDate ldStart = start.toLocalDate();
		LocalTime ltStart = start.toLocalTime();
		
		LocalDate ldEnd = end.toLocalDate();
		LocalTime ltEnd = end.toLocalTime();
		
		Period period = Period.between(ldStart, ldEnd);
		Duration duration = Duration.between(ltStart, ltEnd);

		if(ltEnd.isBefore(ltStart)) {
			duration = duration.plusDays(1);
			period = period.minusDays(1);
		}
		String date = period.getYears() + " Y " + period.getMonths()+" M " + period.getDays() + " D ";

		String time = duration.toHoursPart() + " H " + duration.toMinutesPart() + " M " + duration.toSecondsPart();
		
		return date + " " + time;
	}
}
