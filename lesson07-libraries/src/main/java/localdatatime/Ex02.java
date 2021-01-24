package localdatatime;

import java.time.Duration;
import java.time.LocalTime;

public class Ex02 {
public static void main(String[] args) {
	LocalTime ltStart = LocalTime.of(10, 10, 10);
	LocalTime ltEnd = LocalTime.of(12, 11, 30);
	System.out.println("ltime: " +ltStart);
	System.out.println("hour " + ltStart.getHour());
	System.out.println("minute " + ltStart.getMinute());
	System.out.println("second " + ltStart.getSecond());
	
	Duration duration = Duration.between(ltStart, ltEnd);
	
	System.out.println(duration.getSeconds());
	
	System.out.println("duration: " + duration);
	
}
}
