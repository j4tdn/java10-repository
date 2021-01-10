package localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ex03 {
	public static void main(String[] args) {
		LocalDateTime lte = LocalDateTime.now();
		
		
		LocalDate ldate = lte.toLocalDate();
		LocalTime ltime = lte.toLocalTime();
		
		ldate.atTime(ltime);
		lte  = ltime.atDate(ldate);
		
		
	}
}
