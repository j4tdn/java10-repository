package Ex02;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double time1 = 0.0;
		int hour1 = 0;
		int minute1 = 0;
		System.out.print("Age: ");
		int age = sc.nextInt();
		System.out.print("Hour:");
		int hour = sc.nextInt();
		System.out.print("Minute:");
		int minute = sc.nextInt();

		System.out.println("Time start :");
		int time = sc.nextInt();
		
		if (age >= 1 && age <= 3) {
			time1 = 20.0;
		} else if (age >= 4 && age <= 13) {
			time1 = 11.0;
		} else if (age >= 14 && age <= 17) {
			time1 = 9.0;
		} else if (age >= 18 && age <= 64) {
			time1 = 8.0;
		} else {
			time1 = 7.5;
		}

		double sum = time * 60 + time1 * 60 - (hour * 60 + minute);

		if (sum >= 24 * 60) {
		 hour1 = (int) (sum / 60 - 24);
			minute1 = (int) (sum - 24 * 60 - hour1 * 60);
		} else {
			hour1 = (int) (sum / 60);
			minute1 = (int) (sum - hour1 * 60);
		}
		System.out.println("Good time: " + hour1 + ":" + minute1);
	}
}