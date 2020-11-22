package bean;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Sunday {
	public static void main(String[] args) {
		LocalDate ldate = LocalDate.now();
		
		int days = 0;
		
		while(days <= 112) {
			ldate = ldate.plusDays(1);
			if (ldate.getDayOfWeek() != DayOfWeek.SUNDAY) {
				days++;
			}
		}
		System.out.println("ldate: " + ldate);
	}
}
