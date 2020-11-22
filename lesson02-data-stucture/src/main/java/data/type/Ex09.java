package data.type;

import Bean.CirclePos;
import Bean.Point;

public class Ex09 {
	
    	private static final CirclePos ONSIDE = null;
		private static final CirclePos OUTSIDE = null;
		private static final CirclePos INSIDE = null;
		
		public static void main(String[] args) {
			//Oxyz
	    	//R: 5
	    	// A: (3,4)
	    	Point O = new Point(0,0);
	        Point A = new Point(9,4);
	        int R = 5;
	        double distance = distance(O, A, R);
	        CirclePos circlePos = identify(distance, R);
	        System.out.println(circlePos.getValue());
		}
	
	private static CirclePos identify(double distance, int R) {
		if (distance == R) {
			return ONSIDE;
		}
		if (distance > R) {
			return OUTSIDE;
		}
		return INSIDE;
	}

	private static double distance(Point O, Point A, int R) {
    	 // sqrt (xA-xO)2 + ( yA-yO)
    	   return Math.sqrt(Math.pow(A.x - O.x, 2) + Math.pow(A.y - O.y, 2));
	}
}