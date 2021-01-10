package localdatetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Ex01 {
	public static void main(String[] args) {
		LocalDate ldate = LocalDate.now();
		System.out.println("ldate: " + ldate);
		System.out.println("ldate: " + ldate.getYear());
		System.out.println("ldate: " + ldate.getMonth());
		System.out.println("ldate: " + ldate.getDayOfMonth());

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("formatted: " + dtf.format(ldate));

		LocalDate start = LocalDate.of(2020, 03, 8); // tim khoang cach giua ngay thang nam
		LocalDate end = LocalDate.of(2021, 04, 4);

		Period period = Period.between(start, end);
		System.out.println(period.getYears() + "Y" + period.getMonths()+"M" + period.getDays() + "D" );
		
		System.out.println("days btw: " + ChronoUnit.DAYS.between(start, end));


	}
}