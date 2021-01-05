package ex04;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Holidays {
	public static void main(String[] args) {
		daysBetween2Dates();
	}

	public static void daysBetween2Dates() {
		// Định dạng thời gian
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

		Calendar c1 = Calendar.getInstance();

		Calendar c2 = Calendar.getInstance();
		Calendar c = Calendar.getInstance();
		int count = 0;
		c2.set(2021, 01, 01);
		long noDay = (c2.getTime().getTime() - c1.getTime().getTime()) / (24 * 3600 * 1000);

		System.out.print("Số ngày giữa " + dateFormat.format(c1.getTime())

				+ " và " + dateFormat.format(c2.getTime()) + ": " + noDay + "\n");
		while (c1.before(c2)) {

			int da = c1.get(Calendar.DAY_OF_WEEK);
			int day = c1.get(Calendar.DAY_OF_MONTH);
			int month = c1.get(Calendar.MONTH);
			int year = c1.get(Calendar.YEAR);
			c1.add(Calendar.DAY_OF_MONTH, 1);
			if (da == Calendar.SUNDAY || da == Calendar.THURSDAY) {
				count++;

			}

		}
		System.out.println("The number days studying: " + count);

	}
}
