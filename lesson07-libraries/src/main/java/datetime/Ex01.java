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

public class Ex01 {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println("date: " + date);
		System.out.println("time: " + date.getTime());

		
		Calendar c = Calendar.getInstance(new Locale("vi", "VN"));
		c.set(2020, 9, 15);
		c.set(Calendar.MONTH, 7);
		c.set(Calendar.DAY_OF_MONTH, 18);
		System.out.println("calendar: " + c);
		System.out.println("time: " + c.getTimeInMillis());
		
		// + Ngày, tháng, năm
		int day = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH);
		int year = c.get(Calendar.YEAR);
		
		System.out.println(day + ", " + month + ", " + year);
		
		// + Giờ, phút, giây
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int ap = c.get(Calendar.AM_PM);
		System.out.println(hour + " " + ap);
		System.out.println();
		
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		
		System.out.println(hour + ", " + minute + ", " + second);
		
		// + Số ngày trong tháng trong năm
		int nodInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		int nodInYear = c.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println(nodInMonth + ", " + nodInYear);
		
		// + Ngày trong tuần tháng năm
		// Jan, Fe, Mar, Ap, May, June, July, Au, Sep, Oc, Nov, Dev
		int dow = c.get(Calendar.DAY_OF_WEEK);
		// hardcode
		System.out.println("dow: " + (dow = Calendar.TUESDAY));
		
		// + Ngày đầu tiên trong tuần với locale
		System.out.println("fdow: " + c.getFirstDayOfWeek());
		
		System.out.println("time by tz: " + Calendar.getInstance(TimeZone.getTimeZone("Europe/Berlin")));
 	}
}
