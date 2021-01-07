package ex07;

import java.util.Calendar;
import java.util.Locale;

public class HowManyDay {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance(new Locale("vi", "VN"));
		
		Calendar anni = Calendar.getInstance(new Locale("vi", "VN"));
		anni.set(2020, Calendar.JANUARY, 18, 0, 0, 0);
		
		Calendar birthday = Calendar.getInstance(new Locale("vi", "VN"));
		birthday.set(2000, Calendar.JANUARY, 23, 0, 0, 0);

		System.out.print("In love days: ");
		countDay(now, anni);
		System.out.println("------------------");
		System.out.print("Live days: ");
		countDay(now, birthday);
	}

	private static void countDay(Calendar c1, Calendar c2) {
		long getDiff = c1.getTimeInMillis() - c2.getTimeInMillis();
		// 1 day = 24h; 1h = 60m; 1m = 60s; 1s = 1000ms
		long dayDiff = getDiff / (24 * 60 * 60 * 1000);
		long hourDiff = getDiff / (60 * 60 * 1000) % 24;
		long minDiff = getDiff / (60 * 1000) % 60;
		long secDiff = getDiff / 1000 % 60;
		System.out.println(dayDiff + " days - " + hourDiff + " hours - " + 
						minDiff + " minutes - " + secDiff + " seconds.");
	}
}
