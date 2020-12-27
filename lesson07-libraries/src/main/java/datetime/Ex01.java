package datetime;

import java.awt.CardLayout;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 * 1. Lấy thông tin về thời gian với timezone
 * + Ngày, Tháng, Năm 
 * + Giờ 12-24, Phút, Giây 
 * + Số ngày trong tháng, năm 
 * + Ngày trong tuần, tháng, năm 
 * + Tuần trong tháng, năm
 * + Ngày đầu tiên trong tuần với locale
 *   =>>> Epoch day
 */
public class Ex01 {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println("date: " + date);
		System.out.println("time: " + date.getTime());

		//Calendar c = Calendar.getInstance();
		Calendar c = Calendar.getInstance(new Locale("vi", "VN"));
		c.set(2020, 9, 15);
		c.set(c.MONTH, 7);
		c.set(c.DAY_OF_MONTH, 18);
		System.out.println("calendar: " + c);
		System.out.println("time: " + c.getTimeInMillis());

		// + Ngày, Tháng, Năm
		int day = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH);
		int year = c.get(Calendar.YEAR);
		System.out.println(day + " , " + month + " , " + year);
		
		// Giờ 12-24, Phút, Giây
		int hours = c.get(Calendar.HOUR);
		int minute = c.get(Calendar.MINUTE);
		int seconds = c.get(Calendar.SECOND);
		int ap = c.get(Calendar.AM_PM);
		System.out.println(hours + " , " + minute + " , " + seconds + " , " + ap);

		// Số ngày trong tháng, năm
		int noInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		int noInYear = c.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println(noInMonth + " , " + noInYear);
		
		//Ngày trong tuần, tháng, năm 
		int dow = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("dow: " + (dow == Calendar.MARCH));
		System.out.println("locale: "+ Locale.getDefault());
		
		//Tuần trong tháng, năm
		
		
		//JAN, FE, MAR, AP, MAY, JUNE, JULY, AU, SEP, OCT, NOV, DEC
		
		//Ngày đầu tiên trong tuần với locale
		System.out.println("fdow: " +c.getFirstDayOfWeek());
		
		System.out.println("time by timezone: " + Calendar.getInstance(TimeZone.getTimeZone("Europe/Berlin")));
	}

}
