package localdatetime;

import java.time.Duration;
import java.time.LocalTime;

import javax.lang.model.element.NestingKind;

public class Ex02 {
public static void main(String[] args) {
	LocalTime lsstart = LocalTime.of(10,10,10);
	LocalTime ltend = LocalTime.of(12,11,30);
	
	System.out.println("ltiem: " + lsstart);
	System.out.println("hour: " + lsstart.getHour());
	System.out.println("minute: " + lsstart.getMinute());
	System.out.println("second: " + lsstart.getSecond());
	
	Duration duration = Duration.between(lsstart, ltend);
	String  dString = duration.toHoursPart() + " H " 
					+ duration.toMinutesPart()+ " M "
					+ duration.toSecondsPart() + " S " ;
	
	System.out.println("duration:"+ dString ); 
	
	
	
	
	
	}
}
