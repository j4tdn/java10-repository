package localdatetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Ex01 {
	public static void main(String[] args) {
		LocalDate ldate = LocalDate.now();
		ldate = ldate.plusDays(2).withDayOfMonth(24);;
		
		
		System.out.println("ldate: " + ldate);
		System.out.println("year: " + ldate.getYear());
		System.out.println("month: " + ldate.getMonth());
		System.out.println("date: " + ldate.getDayOfMonth());
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("formatted: " +dtf.format(ldate));
		
		LocalDate start = LocalDate.of(2020, 3, 8);
		LocalDate end = LocalDate.of(2021, 4, 4);
		
		//khoang cach start den end
		Period period = Period.between(start, end);
		String pString = period.getYears() + " Y " 
						+ period.getMonths() + " M "
						+ period.getDays() + " D " ;
		
		System.out.println("period: " + pString);
		
		System.out.println("period: " + pString);
		System.out.println("days bw: " + ChronoUnit.DAYS.between(start, end));
	}
}
