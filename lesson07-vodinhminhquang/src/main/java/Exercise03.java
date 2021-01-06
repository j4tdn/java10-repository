import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Exercise03 {
	public static void main(String[] args) {
		ZonedDateTime date = ZonedDateTime.of(LocalDate.of(1993, Month.JULY, 29), LocalTime.of(7, 30),
				ZoneId.of("Europe/Berlin"));
		System.out.println(date);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E yyyy-MM-dd HH:mm");
		System.out.println(date.format(formatter));
	}
}
