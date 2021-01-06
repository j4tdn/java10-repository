import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Exercise07 {
	public static void main(String[] args) {
		Calendar date1 = Calendar.getInstance();
		date1.set(2000, 10, 28);

		Calendar date2 = Calendar.getInstance();
		date2.set(2021, 1, 6);

		System.out.println("How many days did I live in this life as up now?");
		System.out.println(betweenTwoDates(date1, date2, TimeUnit.DAYS));
	}

	public static long betweenTwoDates(Calendar date1, Calendar date2, TimeUnit timeUnit) {
		long diffInMillies = date2.getTimeInMillis() - date1.getTimeInMillis();
		return timeUnit.convert(diffInMillies, TimeUnit.MILLISECONDS);
	}
}
