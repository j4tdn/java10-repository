package Ex01;

public class Main {
	public static void main(String[] args) {
		Point O = new Point(0,0);
		Point A = new Point(5,6);
		int R = 4;
		
		double distance = distance(O,A,R);
		CirclePos circlepos = identify(distance, R);
	}
	
	private static CirclePos identify(double distance,int R) {
		if (distance ==R) {
			return CirclePos.ONSIDE;
		}
		if (distance > R) {
			return CirclePos.OUTSIDE;
		}
		return CirclePos.INSIDE;
	}
	
	private static double distance(Point O,Point A,int R) {
		return Math.sqrt(Math.pow(A.x-O.x, 2)+ (Math.pow(A.y-O.y, 2))); 
	}

}
