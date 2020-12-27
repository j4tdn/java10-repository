package datetime;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
1. Lấy thông tin về thời gian với timezone
	+ Ngày, Tháng, Năm
	+ Giờ 12-24, Phút, Giây
	+ Số ngày trong tháng, năm
	+ Ngày trong tuần, tháng, năm
	+ Tuần trong tháng, năm
	+ Ngày đầu tiên trong tuần với locale
	=>>> Epoch day
 */

public class Ex01TimeZone {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println("date: " + date);
		System.out.println("time: " + date.getTime());
		
		Calendar cal = Calendar.getInstance();
		cal = Calendar.getInstance(new Locale("vi", "VN"));
		cal.set(2020, 9, 15);
		cal.set(Calendar.MONTH, 7);
		cal.set(Calendar.DAY_OF_MONTH, 18);
		cal.set(Calendar.HOUR_OF_DAY, 20);
		System.out.println("calendar: " + cal);
		System.out.println("time: " + cal.getTimeInMillis());
		
		// + Ngày, Tháng, Năm
		int day = cal.get(Calendar.DATE);
		int month = cal.get(Calendar.MONTH);
		int year = cal.get(Calendar.YEAR);
		System.out.println(day + "/" + month + "/" + year);
		
		// + Giờ 12-24, Phút, Giây
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		System.out.println(sec + ":" + min + ":" + hour);
		
		// + Số ngày trong tháng, năm
		int nodInMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		int nodInYear = cal.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println(nodInMonth + "-" + nodInYear);
		
		// + Ngày trong tuần, tháng, năm
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
		int dayOfYear = cal.get(Calendar.DAY_OF_YEAR);
		System.out.println(dayOfWeek + "-" + dayOfMonth + "-" + dayOfYear);
		
		// + Tuần trong tháng, năm
		int weekOfMonth = cal.get(Calendar.WEEK_OF_MONTH);
		
		// + Ngày đầu tiên trong tuần với locale
		System.out.println("first day of week: " + cal.getFirstDayOfWeek());
		
		// Timezone 
		System.out.println("time by timezone: " + Calendar.getInstance(TimeZone.getTimeZone("Europe/Berlin")));
	}
}
