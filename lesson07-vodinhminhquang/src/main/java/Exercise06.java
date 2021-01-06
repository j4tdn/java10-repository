import java.util.Calendar;

public class Exercise06 {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		today.set(2021, 1, 6);
		Calendar tet = Calendar.getInstance();
		tet.set(2021, 2, 1);

		int count = 0;
		while (today.before(tet)) {
			if (today.get(Calendar.DAY_OF_WEEK) == Calendar.THURSDAY
					|| today.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				count++;
			}
			today.add(Calendar.DAY_OF_MONTH, 1);
		}
		System.out.println("The number of classes which we are gonna take before Tet is " + count);
	}
}