package localdatetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class Ex04 {
	public static void main(String[] args) {
		LocalDateTime start = LocalDateTime.of(2020, 10, 8, 10, 20, 10);
		LocalDateTime end = LocalDateTime.of(2021,  10, 10, 8, 22, 20);
		
		String result = between(start, end);
		System.out.println(result);
	}
	
	private static String between (LocalDateTime ldtStart, LocalDateTime ldtEnd) {
		Period period = Period.between(ldtStart.toLocalDate(), ldtEnd.toLocalDate());
		Duration duration = Duration.between(ldtStart.toLocalTime(), ldtEnd.toLocalTime());
		
		// trong trường hợp giờ kết thúc trước giờ bắt đầu
		// ta giảm 1 ngày (vì chưa hết 24h)
		// và cộng bù vào giờ một khoảng thời gian là 24 tiếng
		if (ldtEnd.toLocalTime().isBefore(ldtStart.toLocalTime())) {
			duration = duration.plusDays(1);
			period = period.minusDays(1);
		}
		
		return period.toString() + " 'T' "
		+ duration.toString(); 
	}
}
