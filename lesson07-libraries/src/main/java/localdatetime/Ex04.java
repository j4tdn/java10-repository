package localdatetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class Ex04 {
	public static void main(String[] args) {
		//18.08.2020 10:10:20===> 10.10.2021 15:20:20
		LocalDateTime ldtStart =LocalDateTime.of(2020, 8, 18, 10, 20, 10);
		LocalDateTime ldtEnd =LocalDateTime.of(2021, 10, 10, 15, 20, 20);
		//aYbMcDxHymzs
		between(ldtStart, ldtEnd);
	}
	private static String between(LocalDateTime ldtStart,LocalDateTime ldtEnd) {
	//	LocalDate ldStart =ldtStart.toLocalDate();
	//	LocalDate ldEnd = ldtEnd.toLocalDate();
		
	//	LocalTime ld
		Period period = Period.between(ldtStart.toLocalDate(), ldtEnd.toLocalDate());
		String pstring = period.getYears() + " Y "
				+period.getMonths()+ " M "
				+period.getDays() + " D ";
		System.out.println("period: "+ pstring);
		
		
		Duration duration = Duration.between(ldtStart.toLocalTime(), ldtEnd.toLocalTime());
		String dstring = duration.toHoursPart() +" H "
						+duration.toMinutesPart() +" M "
						+duration.toSecondsPart() +" S ";
		System.out.println("duration: " + dstring);
		
		if (ldtEnd.isBefore(ldtStart)) {
			duration = duration.plusDays(1);
			period = period.minusDays(1);
		}
		return period.toString() + " 'T' " + duration.toString();
	}

}
