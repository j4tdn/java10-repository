package ex01;

import java.util.Scanner;

public class Position {
	private static Scanner sc = new Scanner(System.in);
	
	public static double distance(Point p, Circle c) {
		return Math.sqrt(Math.pow(p.getX() - c.getX(), 2) + Math.pow(p.getY() - c.getY(), 2));
	}
	
	public static boolean identify(double distance, Circle c) {
		if (distance == c.getR()) {
			return true;
		}
		return false;
	}
}