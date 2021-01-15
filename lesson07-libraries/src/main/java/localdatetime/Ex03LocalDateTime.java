package localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ex03LocalDateTime {
	public static void main(String[] args) {
		LocalDateTime ldatetime = LocalDateTime.now();
		LocalDate ldate = ldatetime.toLocalDate();
		LocalTime ltime = ldatetime.toLocalTime();
		
		ldatetime = ldate.atTime(ltime);
		ldatetime = ltime.atDate(ldate);
	}
}
