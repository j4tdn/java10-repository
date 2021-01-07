package ex03;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex03 
{
    public static void main( String[] args )
    {
		String pattern = "dd/MM/yyyy EEEE hh:mm:ss a";
		DateFormat df = new SimpleDateFormat(pattern);

		Date date = new Date();
		System.out.println(pattern + ": " + df.format(date));

	
    }
}
