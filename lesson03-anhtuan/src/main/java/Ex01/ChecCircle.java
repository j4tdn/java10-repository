package Ex01;

import java.util.Scanner;

public class ChecCircle {
	public static void main(String[] args) {
		int x, y;
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter point coordinates A: \n");
		System.out.print("Input x: ");
		x = ip.nextInt();
		System.out.print("Input y: ");
		y = ip.nextInt();
		Point O = new Point(0, 0);
		Point A = new Point(x, y);
		int R = 5;
		double distance = distance(O, A);
		CirclePos circlePos = identify(distance, R);
		if (circlePos == CirclePos.ONSIDE || circlePos == CirclePos.INSIDE) {
			System.out.println("point A is on a circle");
		} else {
			System.out.println("point A is not on the circle");
		}
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

	private static double distance(Point O, Point A) {
		return Math.sqrt(Math.pow(A.x - O.x, 2) + Math.pow(A.y - O.y, 2));

	}
}
