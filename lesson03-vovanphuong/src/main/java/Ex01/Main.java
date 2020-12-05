package Ex01;

import java.util.Scanner;

import Ex01.CirclePos;
import Ex01.Point;

public class Main {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Tâm 0: (0,0)
		// R : 5
		// A : (3,4)
		System.out.println("Nhập tọa độ điểm O: ");
		System.out.print("x : ");
		int xO = ip.nextInt();
		System.out.print("y : ");
		int yO = ip.nextInt();
		System.out.println("Nhập tọa độ điểm A: ");
		System.out.print("x : ");
		int xA = ip.nextInt();
		System.out.print("y : ");
		int yA = ip.nextInt();
		Point O = new Point(xO, yO);
		Point A = new Point(xA, yA);
		
		System.out.print("Nhập bán kính :");
		int R = ip.nextInt();

		double distance = distance(O, A, R);
		CirclePos circlePos = indetify(distance, R);
		
		if(circlePos == circlePos.INSIDE) {
			//todo
		}

		System.out.println(circlePos);

	}

	private static CirclePos indetify(double distance, int R) {
		if (distance == R) {
			return CirclePos.ONSIDE;
		}
		if (distance > R) {
			return CirclePos.OUTSIDE;
		}
		return CirclePos.INSIDE;
	}

	private static double distance(Point O, Point A, int R) {
		return Math.sqrt(Math.pow(A.x - O.x, 2) + Math.pow(A.y - O.y, 2));

	}

}