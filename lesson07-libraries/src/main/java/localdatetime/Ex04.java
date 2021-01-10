package localdatetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Ex04 {
	public static void main(String[] args) {
		// 18.08.2020 10:20:10 ==> 10.10.2021 15:20:20
		LocalDateTime ldtstart = LocalDateTime.of(2020,8,18,10,20,10);
		LocalDateTime ldtend = LocalDateTime.of(2021,10,10,15,20,20);
		between(ldtstart, ldtend);
		
		
		// a Y b M c D x H y m z s 
	}
	private static String between(LocalDateTime ldtstart, LocalDateTime ldtend) {
		Period period = Period.between(ldtstart.toLocalDate(), ldtend.toLocalDate());
		String pString = period.getDays()+ " D " 
						+ period.getMonths()+ " M "
				+period.getYears() + " Y " ;
		System.out.println("period: " + pString);
		Duration duration = Duration.between(ldtstart.toLocalTime(), ldtend.toLocalTime());
		String ptString = duration.toHoursPart()+ " H "
						+ duration.toMinutesPart() + " M "
						+ duration.toSecondsPart()+ " S " ;
		System.out.println("duration:"+ ptString);
		
		if ( ldtend.isBefore(ldtstart)) {
			duration = duration.plusDays(1);
			period = period.minusDays(1);
		}
		return period.toString() + " 'T' " + duration.toString();
		
						
		
		
		
		
	}

}
