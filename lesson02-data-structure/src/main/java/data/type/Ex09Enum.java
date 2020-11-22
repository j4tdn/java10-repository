package data.type;

import bean.CirclePos;
import bean.Point;

public class Ex09Enum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Tâm 0: (0,0)
		// R : 5
		// A : (3,4)
		Point O = new Point(0, 0);
		Point A = new Point(3, 4);
		int R = 5;

		double distance = distance(O, A, R);
		CirclePos circlePos = indetify(distance, R);
		
		if(circlePos == circlePos.INSIDE) {
			//todo
		}

		System.out.println(circlePos);

	}

	private static CirclePos indetify(double distance, int R) {
		if (distance == R) {
			return CirclePos.ONSIDE;
		}
		if (distance > R) {
			return CirclePos.OUTSIDE;
		}
		return CirclePos.INSIDE;
	}

	private static double distance(Point O, Point A, int R) {
		return Math.sqrt(Math.pow(A.x - O.x, 2) + Math.pow(A.y - O.y, 2));

	}

}
