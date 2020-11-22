package data.type;

import bean.CirclePos;
import bean.Point;

public class Ex09Enum {
		
	public static void main(String[] args) {
		//Tâm O(0,0)
		//R: 5
		//A(3,4)
		
		Point O = new Point(0, 0);
		Point A = new Point(2, 4);
		
		int R = 5;
		
		double distance = distance(O, A, R);
		
		CirclePos circlePos = identify(distance, R);
		System.out.println(circlePos.getValue());
		System.out.println(circlePos);
		System.out.println(circlePos.name());
		
		if (circlePos == circlePos.INSIDE) {
			//do something
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
	
	private static double distance (Point O, Point A, int R) {
		return Math.sqrt(Math.pow(A.x - O.x, 2) + Math.pow(A.y - O.y, 2));
	}
}
