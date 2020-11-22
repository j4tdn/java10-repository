package data.type;

import java.awt.Point;

import bean.CirclePos;

public class Ex09Enum {

	public static void main(String[] args) {
		// Tam O:(0,0)
		// R: 5
		// A: (3,4)
		Point O = new Point(0, 0);
		Point A = new Point(4, 4);
		int R = 5;
		double distance = distance(O, A, R);
		CirclePos circlePos = identify(distance, R);
		if( circlePos == CirclePos.Inside) {
			
		}
		System.out.println(circlePos.getValue());

	}

	private static CirclePos identify(double distance, int R) {
		if (distance == R) {
			return CirclePos.Onside;
		}
		if (distance > R) {
			return CirclePos.Outside;
		} else
			return CirclePos.Inside;
	}

	private static double distance(Point O, Point A, int R) {
		return Math.sqrt(Math.pow(A.x - O.x, 2) + Math.pow(A.y - O.y, 2));
	}
}
