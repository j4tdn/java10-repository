package localDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ex03 {
	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now();
		//convert localDateTime ==> localDate 
		LocalDate ldate =  ldt.toLocalDate();
		LocalTime ltime =  ldt.toLocalTime();
		
		
	  ldt=	ldate.atTime(ltime);
	  ldt=	ltime.atDate(ldate);
	}
}
