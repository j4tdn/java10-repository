package localdatetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Ex01 {
	public static void main(String[] args) {
		LocalDate ldate = LocalDate.now();
		ldate = ldate.plusDays(2);
		ldate.withDayOfMonth(24);
		
		System.out.println("ldate :" + ldate.plusDays(2));
		System.out.println("ldate : " +ldate.withDayOfMonth(24));

//		System.out.println(System.identityHashCode(ldate));
//		System.out.println(System.identityHashCode(ldate.plusDays(2)));

		System.out.println("ldate: " + ldate);
		System.out.println("year :" + ldate.getYear());
		System.out.println("month :" + ldate.getMonthValue());
		System.out.println("day :" + ldate.getDayOfMonth());

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd//MM//yyyy");
		System.out.println("formatted: " + dtf.format(ldate));

		LocalDate start = LocalDate.of(2019, 8, 04);
		LocalDate end = LocalDate.of(2021, 6, 10);
		Period period = Period.between(start, end); // vd 1- 5 == 1 2 3 4
		String pString = period.getYears() + " Y " + period.getMonths() + " M " + period.getDays() + " D ";

		System.out.println("period :" + pString);
		System.out.println("period: " + period);

		System.out.println("days  :" + ChronoUnit.DAYS.between(start, end));

	}

}
