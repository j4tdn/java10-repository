package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo {
	public static void main(String[] args) {

		DateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");

		Date currentDate = new Date();
		Date date1 = null;
		Date date2 = null;

		try {
			String startDate = "25-12-2020 ";
			String endDate = simpleDateFormat.format(currentDate);

			date1 = simpleDateFormat.parse(startDate);
			date2 = simpleDateFormat.parse(endDate);

			long getDiff = date2.getTime() - date1.getTime();

			long getDaysDiff = getDiff / (24 * 60 * 60 * 1000);

			System.out.println(
					"Differance between date " + startDate + " and " + endDate + " is " + getDaysDiff + " days.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
