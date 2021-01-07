package dateTime;

import java.util.Calendar;

import utils.DateUtils;

import static java.util.Calendar.*;

public class Ex04 {
public static void main(String[] args) {
	Calendar start = getInstance();
	start.set(DAY_OF_MONTH, start.getActualMinimum(DAY_OF_MONTH));
	
	Calendar end = getInstance();
	end.set(DAY_OF_MONTH, end.getActualMaximum(DAY_OF_MONTH));
     
	while(start.before(end)) {
		if(start.get(DAY_OF_WEEK) == SUNDAY) {
			System.out.println(DateUtils.toString(start));
			start.add(DAY_OF_MONTH, 7);
		}else {
			start.add(DAY_OF_MONTH, 1);

		}
		
		
	}


}
}
