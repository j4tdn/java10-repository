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
		System.out.println("date: " +date);
		System.out.println("time: "+date.getTime());
		
		Calendar c = Calendar.getInstance(new Locale("vi", "VN"));
		c.set(2020, 9, 15);
		c.set(c.MONTH, 7);
		c.set(c.DAY_OF_MONTH, 18);
		System.out.println("calendar: " +c);
		System.out.println("time: "+c.getTimeInMillis());
		
		// ngay thang nam
		int day = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH);
		int year = c.get(Calendar.YEAR);
		System.out.println(day + "," + month + "," + year);
		// gio phut giay
		int hour = c.get(Calendar.HOUR);
		int minute = c.get(Calendar.MINUTE);
		int millisecond = c.get(Calendar.MILLISECOND);
		System.out.println(hour + ","  + minute + "," + millisecond);
		// so ngay ngay trong thang
		int nodeInYear = c.getActualMaximum(Calendar.DAY_OF_YEAR);
		int nodInMoth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(nodInMoth + "," + nodeInYear);
		// ngay trong tuan, thang
		int dow = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("dow: "+(dow == Calendar.TUESDAY));
		
		// ngay dau tien trong tuan
		System.out.println("locale: "+Locale.getDefault());
		System.out.println("fdow: "+c.getFirstDayOfWeek());
		
		System.out.println("time by tz: "+Calendar.getInstance(TimeZone.getTimeZone("Europe/Berlin")));
	}
}
