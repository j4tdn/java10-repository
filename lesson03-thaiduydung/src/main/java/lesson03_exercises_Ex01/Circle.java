package ex01;

import java.util.Scanner;

public class Circle {
	private float x;
	private float y;
	private float R;
	
	private static Scanner sc = new Scanner(System.in);
	
	public Circle() {
	}

	public Circle(float x, float y, float r) {
		super();
		this.x = x;
		this.y = y;
		R = r;
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

	public float getR() {
		return R;
	}

	public void setR(float r) {
		if (r <= 0) {
			throw new RuntimeException("Invalid R!");
		}
		R = r;
	}

	public void input() {
		System.out.print("Enter the x of the circle: ");
		x = sc.nextFloat();
		System.out.print("Enter the y of the circle: ");
		y = sc.nextFloat();
		System.out.print("Enter the radius of the circle: ");
		R = sc.nextFloat();
	}
	
	@Override
	public String toString() {
		return "C(" + x + ", " + y + ", " + R + ")";
	}
}