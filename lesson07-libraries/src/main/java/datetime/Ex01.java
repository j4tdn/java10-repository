package datetime;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import javax.swing.text.html.MinimalHTMLWriter;

/**
 * 1. Lấy thông tin về thời gian với timezone + Ngày, Tháng, Năm + Giờ 12-24,
 * Phút, Giây + Số ngày trong tháng, năm + Ngày trong tuần, tháng, năm + Tuần
 * trong tháng, năm + Ngày đầu tiên trong tuần với locale =>>> Epoch day
 */

public class Ex01 {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println("date: " + date);
		System.out.println("time"+ date.getTime());

		Calendar c = Calendar.getInstance(new Locale("vi", "VN"));
		c.set(c.MONTH,7);
		c.set(c.DAY_OF_MONTH,18);
		
		System.out.println("calendar: " + c);
		System.out.println("time"+ c.getTimeInMillis());
		
		
		// Ngay thang nam
		int day = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH);
		int year = c.get(Calendar.YEAR);
		System.out.println(day + ", " + month +", "+ year +", ");
		
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		int ap = c.get(Calendar.AM_PM);
		System.out.println(hour + ", " + minute +", " + second +", " +ap );
		//so ngay trong thang nam
		int dayofMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		int nudInYear = c.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println(dayofMonth + ", " + nudInYear);
		
		// so ngay trong tuan
		int dow = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("dow: " + dow);
		// ngay dau tien trong tuan voi locale
		System.out.println("locale: " + Locale.getDefault());
		System.out.println("fdow:" + c.getFirstDayOfWeek());
		System.out.println("time by tz: " + Calendar.getInstance(TimeZone.getTimeZone("Europe/Berlin")));
	}
}
