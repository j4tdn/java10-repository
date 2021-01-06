import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Exercise05 {
	public static void main(String[] args) {
		Date d1 = new Date(2020, 1, 1);
		Date d2 = new Date(2021, 1, 1);
		
		boolean isLeapYear = (getDifferenceDays(d1, d2) > 365) ? true : false;
		if (isLeapYear) {
			System.out.println("2020 is a leap year");
			System.exit(0);
		}
		System.out.println("2020 is not a leap year");

	}
	public static long getDifferenceDays(Date d1, Date d2) {
	    long diff = d2.getTime() - d1.getTime();
	    return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
}
