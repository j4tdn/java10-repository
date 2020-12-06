package ex01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		do {
			Circle c = new Circle();
			c.input();
			Point p = new Point();
			p.create();
			
			double distance = Position.distance(p, c);
			if (Position.identify(distance, c)) {
				System.out.println(p + " is INSIDE of " + c);
				System.out.println("------------------------------");
			} else {
				System.out.println(p + " isn't INSIDE of " + c);
				System.out.println("------------------------------");
			}
			
			System.out.println("Do you want to continue? (Y/N)");
			String choose = new Scanner(System.in).nextLine();
			if (choose.equalsIgnoreCase("N")) {
				System.out.println("Bye!");
				System.exit(0);
			}
		} while (true);
	}
}
