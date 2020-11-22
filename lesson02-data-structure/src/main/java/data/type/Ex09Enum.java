package data.type;


import bean.CirclePos;
import bean.Point;

public class Ex09Enum {
	private static final String INSIDE ="Trong đường tròn";
	private static final String OSNIDE ="Trên đường tròn";
	private static final String OUTSIDE ="Ngoài đường tròn";
	public static void main(String[] args) {
		// tâm O: (0, 0)
		//Oxyz
		//R: 5
		//A: (3, 4)
		Point O = new Point(0, 0);
		Point A = new Point(3, 4);
		int R = 5;
		double distance =distance(O, A, R);
		CirclePos circlePos = identify(distance, R);
		if (circlePos == CirclePos.INSIDE) {
			
		}
	}
	private static CirclePos identify (double distance, int R ) {
		if (distance == R) {
			return CirclePos.INSIDE;
		}
		if (distance > R) {
			return  CirclePos.OUTSIDE;
			
		}
		return CirclePos.ONSIDE;
		
	}
	private static double distance(Point O, Point A, int r) {
		return Math.sqrt(Math.pow(A.x - O.x, 2) + Math.pow(A.y - O.y, 2));
		
	}

}
