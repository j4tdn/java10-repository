package java10.datetime;


import static java.util.Calendar.*;
import java.util.Calendar;

import utils.DateUtils;

public class ex04 
{
    public static void main( String[] args )
    {
      Calendar c = getInstance();
      Calendar start = getInstance();
      start.set(DAY_OF_MONTH, start.getActualMinimum(Calendar.DAY_OF_MONTH));
      
      Calendar end = getInstance();
      end.set(DAY_OF_MONTH, end.getActualMaximum(Calendar.DAY_OF_MONTH));
      end.add(DAY_OF_MONTH, 1);
      while(start.before(end)){
    	  
    	  if (start.get(Calendar.DAY_OF_WEEK)== Calendar.SUNDAY) {
    		 
    		  System.out.println(DateUtils.toString(start));
    		  start.add(DAY_OF_MONTH, 7);
    	  }
    	  else {
    	  start.add(Calendar.DAY_OF_MONTH, 1);
    	  }
    	  }
    }
}
