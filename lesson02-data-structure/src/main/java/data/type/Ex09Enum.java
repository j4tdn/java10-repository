package data.type;

import bean.CircelPos;
import bean.Point;

public class Ex09Enum {
	
	public static void main(String[] args) {
		// Oxyz
		// Tam O: (0,0)
		// R: 5
		// A: (3,4)
		Point O = new Point(0,0);
		Point A = new Point(2,4);
		int R = 5;
		double distance = distance(O, A, R);
		CircelPos circelPos = identify(distance, R);

		if(circelPos == CircelPos.INSIDE) {
			// todo
		}
	}
	
	private static CircelPos identify(double distance, int R) {
		if(distance == R) {
			return CircelPos.ONSIDE;
		}
		if (distance > R) {
			return CircelPos.OUTSIDE;
		}	
			return CircelPos.INSIDE;
	}
	
	private static double distance(Point O, Point A, int R) {
		//sqrt(xA-xO)2 + (yA-yO)2
		return Math.sqrt(Math.pow(A.x - O.x, 2) + Math.pow(A.y - O.y, 2));
	}
}
