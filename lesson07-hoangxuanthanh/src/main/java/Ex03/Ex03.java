package Ex03;

public class Ex03 {
		public static void main(String[] args) {
			System.out.println(isLeapYear(2020));
		}
		 public static boolean isLeapYear(int year) {
		        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) 
		        {
		            System.out.println("This is a leap year!");
		            return true;

		        }
		        else {
		        System.out.println("This is not a leap year!!");
		        return false;
		    }
	}
}