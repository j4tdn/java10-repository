package ex01;

public class Main {
	public static void main(String[] args) {
		Point O = new Point(0, 0);
		Point A = new Point(3, 4);
		int R = 5;

		double distance = distance(O, A, R);
		CirclePosition circlePos = identify(distance, R);

		System.out.println(circlePos.getValue());
	}

	private static CirclePosition identify(double distance, int R) {
		if (distance == R) {
			return CirclePosition.ONSIDE;
		}
		if (distance > R) {
			return CirclePosition.ONSIDE;
		}
		return CirclePosition.INSIDE;
	}

	private static double distance(Point O, Point A, int R) {
		// sqrt (xA-xO)2 + (yA-yO)2
		return Math.sqrt(Math.pow(A.getX() - O.getX(), 2) + Math.pow(A.getY() - O.getY(), 2));
	}
}
