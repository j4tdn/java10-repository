package ex03;

import java.util.Calendar;

public class LeapYear {
	public static void main(String[] args) {
		System.out.println(isLeapYear(2019));
	}
	 public static boolean isLeapYear(int year) {
	        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
	            System.out.println("This is a leap year!");
	            return true;

	        }
	        System.out.println("This is not a leap year!!");
	        return false;

	    }
}
