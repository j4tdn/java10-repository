package localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ex03 {
	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now();
		
		LocalDate ldate = ldt.toLocalDate();
		LocalTime ltime = ldt.toLocalTime();
		
		// converts LocalDate to LocalDateTime
		ldt = ldate.atTime(ltime);
		// converts LocalTime to LocalDateTime 
		ldt = ltime.atDate(ldate);
	}
}
