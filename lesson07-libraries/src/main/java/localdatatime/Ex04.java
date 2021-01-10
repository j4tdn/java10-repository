package localdatatime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class Ex04 {
	public static void main(String[] args) {
		// 18.08.2020 10:20:10 ==> 10.10.2021 15:20:20;
		LocalDateTime ldtStart = LocalDateTime.of(2020, 8, 18, 10, 20, 10);
		LocalDateTime ldtEnd = LocalDateTime.of(2021, 10, 10, 15, 20, 10);

		String time = between(ldtStart, ldtEnd);
		System.out.println(between(ldtStart, ldtEnd));

		// a
	}

	private static String between(LocalDateTime ldtstart, LocalDateTime ldtend) {

		LocalDate ldStart = ldtstart.toLocalDate(); // ngay thang nam
		LocalTime ltStart = ldtstart.toLocalTime(); // gio phut giay

		LocalDate ldEnd = ldtstart.toLocalDate();
		LocalTime ltEnd = ldtstart.toLocalTime();

		Period period = Period.between(ldStart, ldEnd);
		Duration duration = Duration.between(ltStart, ltEnd);

		if (ltEnd.isBefore(ltStart)) {
			duration = duration.plusDays(1);
			period = period.minusDays(1);
		}

		return period.toString() + " 'T' " + duration.toString() + "'S'";

	}
}
