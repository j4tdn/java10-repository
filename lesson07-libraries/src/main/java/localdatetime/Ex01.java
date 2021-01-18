package localdatetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Ex01 {
	public static void main(String[] args) {
		// ~ Calendar.getInstance()
		LocalDate ldate = LocalDate.now();
		// add a number of days is gonna' return a new object
		System.out.println(System.identityHashCode(ldate));
		System.out.println(System.identityHashCode(ldate.plusDays(2)));
		
		System.out.println("ldate: " + ldate);
		ldate = ldate.plusDays(2).withDayOfMonth(24);
		System.out.println("ldateplus: " + ldate) ;
		System.out.println("Year: " + ldate.getYear());
		System.out.println("Month: " + ldate.getMonth());
		System.out.println("Day: " + ldate.getDayOfMonth());

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Formatted: " + dtf.format(ldate));

		LocalDate start = LocalDate.of(2021, 2, 8);
		LocalDate end = LocalDate.of(2021, 3, 4);

		// Period is a length of time between nth day and nth day
		Period period = Period.between(start, end);
		String pString = period.getYears() + " Y " + period.getMonths() + " M " + period.getDays() + " D ";
		System.out.println("Period: " + pString);
		
		// ChronoUnit supporting for converting days into month, etc.
		System.out.println("days btw: " + ChronoUnit.DAYS.between(start, end));
	}

}
