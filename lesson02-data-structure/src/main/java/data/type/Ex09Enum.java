package data.type;

import java.awt.Point;

import bean.CirclePos;

public class Ex09Enum {

	public static void main(String[] args) {
		// Oxyz
		// tam O:(0;0)
		// R = 5
		// A(3,4)
		Point O = new Point(0, 0);
		Point A = new Point(3, 4);
		int R = 5;
		double distance = distance(O, A);

		CirclePos circlePos = identify(distance, R);

		System.out.println(circlePos);// in ra name
		System.out.println(circlePos.getValue());// in ra value

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
		// sqrt((xA-xO)2 + (yA-yO)2)
		return Math.sqrt(Math.pow(A.x - O.x, 2) + Math.pow(A.y - O.y, 2));
	}
}
