package ex04;

import java.util.Calendar;
import java.util.Locale;

public class FindSunday {
	public static void main(String[] args) {
		int dem = 0;

		Calendar cal = Calendar.getInstance(new Locale("vi", "VN"));
		int realMonth = cal.getActualMinimum(Calendar.DAY_OF_MONTH);
		cal.set(Calendar.DAY_OF_MONTH, realMonth);
		int month = cal.get(Calendar.MONTH );
		do {
			int day = cal.get(Calendar.DAY_OF_WEEK);
			if (day == Calendar.SUNDAY) {
				System.out.println(cal.get(Calendar.DAY_OF_MONTH) + "," + realMonth + "," + cal.get(Calendar.YEAR));
				dem = dem + 1;
			}
			cal.add(Calendar.DAY_OF_YEAR, 1);
		} while (cal.get(Calendar.MONTH) == month);
		System.out.println("\nSố ngày chủ nhật là:" + dem);

	}
}
