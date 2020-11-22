package data.type;

import bean.CirclePos;
import bean.Point;

public class Ex09Enum {

//	private static final String INSIDE = "trong duong tron";
//	private static final String ONSIDE = "tren duong tron";
//	private static final String OUTSIDE = "ngoai duong tron";

	public static void main(String[] args) {
		// Tam 0 :(1,1)
		// R:5

		// A: (3,4)

		Point O = new Point(0, 0);
		Point A = new Point(3, 4);
		int R = 4;

		double distance = distance(O, A, R);
		CirclePos circlepos = identify(distance, R);
		// System.out.println(position);
//		System.out.println(circlepos);
//
//		System.out.println(circlepos.getValue());
//		if (cirlepos == CirclePos.INSIDE) {
//			
//		}
		
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

	private static double distance(Point O, Point A, int R) {
		return Math.sqrt(Math.pow(A.x - O.x, 2) + (Math.pow(A.y - O.y, 2)));
	}

}
