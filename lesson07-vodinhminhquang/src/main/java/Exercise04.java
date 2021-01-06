
import java.util.Calendar;

public class Exercise04 {
	public static void main(String[] args) {
		System.out.println("The number of Sunday in January is " + getSundays(1, 2021));
	}

	public static int getSundays(int month, int year) {
		int count = 0;

		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month, 1);

		int days = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

		for (int i = 1; i <= days; i++) {
			calendar.set(year, month, i);
			int day = calendar.get(Calendar.DAY_OF_WEEK);
			if (day == 1) {
				count++;
			}
		}
		return count;
	}
}
