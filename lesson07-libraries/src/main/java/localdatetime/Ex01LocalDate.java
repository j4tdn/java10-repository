package localdatetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Ex01LocalDate {
	public static void main(String[] args) {
		LocalDate lDate = LocalDate.now();
		// add day
		lDate = lDate.plusDays(2);
		lDate = lDate.withDayOfMonth(2);
		
		System.out.println(lDate);
		System.out.println(lDate.getYear());
		System.out.println(lDate.getMonth());
		System.out.println(lDate.getDayOfMonth());
		
		// format
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyy");
		System.out.println(dtf.format(lDate));
		
		// khoang cach giua 2 moc thoi gian
		LocalDate start = LocalDate.of(2020, Month.OCTOBER, 4);
		LocalDate end = LocalDate.of(2021, Month.OCTOBER, 28);
		Period period = Period.between(start, end);
		System.out.println(period.getYears() + " Y " + period.getMonths() +" M " + period.getDays() + " D");
		
		// tinh ngay giua 2 moc thoi gian
		System.out.println(ChronoUnit.DAYS.between(start, end));
	}
}
