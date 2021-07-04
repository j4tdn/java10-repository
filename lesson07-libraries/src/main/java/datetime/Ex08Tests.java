package datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.WeekFields;
import java.util.Arrays;
import java.util.Locale;
import java.util.TimeZone;

public class Ex08Tests {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		WeekFields wf = WeekFields.of(Locale.getDefault());
		System.out.println("wyear: " +  date.get(wf.weekOfMonth()));
		
		LocalDateTime ltime = LocalDateTime.now(ZoneId.of("Europe/Berlin"));
		LocalDateTime ltimeGMT = LocalDateTime.now(ZoneId.of("Etc/GMT-2"));
		System.out.println(ltime);
		System.out.println(ltimeGMT);
		
		Locale[] locales = Locale.getAvailableLocales();
		String[] ids = TimeZone.getAvailableIDs();
		
		Arrays.stream(locales).forEach(System.out::println);
		System.out.println("==================");
		Arrays.stream(ids).forEach(System.out::println);
		
		
	}
}
