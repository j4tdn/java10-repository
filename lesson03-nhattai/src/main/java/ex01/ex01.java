package ex01;

import java.util.Scanner;

public class ex01 {
	public static void main(String[] args) {
		float xA, yA, xO, yO, R;
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the Abscissa  A: ");
		xA = ip.nextFloat();
		System.out.println("Enter the ordinale  A: ");
		yA = ip.nextFloat();
		System.out.println("Enter the Abscissa  O: ");
		xO = ip.nextFloat();
		System.out.println("Enter the ordinale  O: ");
		yO = ip.nextFloat();
		System.out.println("enter the radius  R: ");
		R = ip.nextFloat();
		double distanceOA = Math.pow((xA-xO), 2) + Math.pow((yA-yO), 2) ;
		//double distanceOA = (xA-xO)*(xA-xO) + (yA-yO)*(yA-yO);
		float R2 = R*R;
		if(distanceOA <= R2) {
			System.out.println("the point A belongs to the circle. ");
		}else {
			System.out.println("the point A is not on the circle. ");
		}
		
	}

}
