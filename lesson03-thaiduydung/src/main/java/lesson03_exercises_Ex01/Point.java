package ex01;

import java.util.Scanner;

public class Point {
	private float x;
	private float y;
	
	private static Scanner sc = new Scanner(System.in);
	
	public Point() {
	}
	
	public Point(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public void create() {
		System.out.print("Enter the x of the point P: ");
		x = sc.nextInt();
		System.out.print("Enter the x of the point P: ");
		y = sc.nextInt();
	}
	
	@Override
	public String toString() {
		return "P(" + x + "," + y + ")";
	}
}

