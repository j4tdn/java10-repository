package localdatetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Ex01 {
	public static void main(String[] args) {
		//singleton, factory, straty
		LocalDate ldate = LocalDate.now();
		ldate = ldate.plusDays(2)
				.withDayOfMonth(24);
		
		System.out.println("ldate: " + ldate);
		System.out.println("year: "+ldate.getYear());
		System.out.println("month: "+ldate.getMonth());
		System.out.println("day: "+ldate.getDayOfMonth());
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("foematted: "+ dtf.format(ldate));
		
		
		LocalDate start = LocalDate.of(2020, 3, 8);
		LocalDate end = LocalDate.of(2021, 4, 4);
		Period period = Period.between(start, end );
		String pstring = period.getYears() + " Y "
						+period.getMonths()+ " M "
						+period.getDays() + " D ";
		System.out.println("period: "+ pstring);
		System.out.println("days btw: "+ChronoUnit.DAYS.between(start, end));
		
	}
}
