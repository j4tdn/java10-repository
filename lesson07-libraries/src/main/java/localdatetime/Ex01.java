package localdatetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Ex01 {
public static void main(String[] args) {
	LocalDate lDate=LocalDate.now();
	lDate=lDate.plusDays(2).withDayOfMonth(24);
	
	
	System.out.println("ldate: "+lDate);
	System.out.println("year: " + lDate.getYear());
	System.out.println("month: " +lDate.getMonth());
	System.out.println("day: " +lDate.getDayOfMonth());
	
	DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy");
	System.out.println("formatted: "+dtf.format(lDate));
	
	LocalDate start= LocalDate.of(2020, 3, 8);
	LocalDate end= LocalDate.of(2021, 4, 4);
	Period period= Period.between(start, end);
	String pString= period.getDays()+ " D "+period.getMonths()+" M "+period.getYears()+" Y ";
	System.out.println("period: "+pString);
	
	System.out.println("days btw: "+ChronoUnit.DAYS.between(start, end)); 
	
}
}
