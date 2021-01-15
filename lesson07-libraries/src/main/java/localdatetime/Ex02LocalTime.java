package localdatetime;

import java.time.Duration;
import java.time.LocalTime;

public class Ex02LocalTime {
	public static void main(String[] args) {
		LocalTime start = LocalTime.of(10, 10, 10);
		LocalTime end = LocalTime.of(12, 11, 40);
		
		// tinh khoang cach giua 2 moc
		Duration duration = Duration.between(start, end);
		System.out.println(duration.toHoursPart() + " h ");
		System.out.println(duration.toMinutesPart() + " m ");
		System.out.println(duration.toSecondsPart() + " s ");
		System.out.println(duration);
	}
}
