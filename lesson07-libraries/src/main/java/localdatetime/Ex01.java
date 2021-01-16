package localdatetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Ex01 {
	public static void main(String[] args) {
		// singleton, factory, strategy
		LocalDate ldate = LocalDate.now();
		ldate = ldate.plusDays(2).withDayOfMonth(24);// +2 day
		System.out.println("ldate:" + ldate);
		System.out.println("year:" + ldate.getYear());
		System.out.println("month:" + ldate.getMonth());
		System.out.println("day:" + ldate.getDayOfMonth());

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("formatted:" + dtf.format(ldate));

		LocalDate start = LocalDate.of(2021, 3, 8);
		LocalDate end = LocalDate.of(2021, 4, 9);
		Period period = Period.between(start, end);
		String pString = period.getYears() + "," + period.getMonths() + "," + period.getDays();
		System.out.println("period:" + pString);

		System.out.println("days:" + ChronoUnit.DAYS.between(start, end));// tinh ngay
	}

}