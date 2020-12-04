package ex01;

import java.awt.Point;
import java.util.Scanner;

public class CirPos {
	public static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		Circle cir1 = new Circle();
		System.out.println("Enter O(x,y) , R: ");
		cir1.setX(ip.nextInt());
		cir1.setY(ip.nextInt());
		cir1.setR(ip.nextInt());
		System.out.println(cir1);
		Point O = new Point(cir1.getX(), cir1.getY());
		System.out.println("Enter A(x,y): ");
		Point A = new Point(ip.nextInt(), ip.nextInt());
		double distance = distance(O, A);

		System.out.println(" Position of A: " + identify(distance, cir1.getR()));
	}

	private static Position identify(double distance, int R) {
		if (distance == R) {
			return Position.INSIDE;
		}
		if (distance < R) {
			return Position.ONSIDE;
		}
		return Position.OUTSIDE;

	}

	private static double distance(Point O, Point A) {
		return Math.sqrt(Math.pow(A.x - O.x, 2) - Math.pow(A.y - O.y, 2));

	}

}
