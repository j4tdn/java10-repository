package view1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int x, y;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input x: ");
		x = sc.nextInt();
		System.out.print("Input y: ");
		y = sc.nextInt();
		Point O = new Point(0, 0);
		Point A = new Point(x, y);
		int R = 5;
		double distance = distance(O, A, R);
		CirclePos circlePos = identify(distance, R);
			if(circlePos == circlePos.	ONSIDE && circlePos == CirclePos.OUTSIDE) {
			
		}
		
		System.out.println(circlePos.getValue());
	}

	
	private static double distance(Point O, Point A, int R) {
		return 0;
	}


	private static CirclePos identify(double distance, int R) {
		if (distance == R) {
			return CirclePos.ONSIDE;
		}
		if (distance > R) {
			return CirclePos.OUTSIDE;
		}
		return CirclePos.INSIDE;
	}

}
