package tranlehuuphuc.lesson03_tranlehuuphuc;

import java.util.Scanner;

public class ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int xA, yA, xO, yO, r;
		Scanner ip = new Scanner(System.in);
		System.out.println("enter coordinates of point A: ");
		xA =ip.nextInt();
		System.out.println("enter ordinate of point A: ");
		yA = ip.nextInt();
		System.out.println("enter diaphragm of center O: ");
		xO = ip.nextInt();
		System.out.println("enter center degree O: ");
		yO = ip.nextInt();
		System.out.println("enter radius: ");
		r = ip.nextInt();
		int Rs = r * r;
		int OAs =(xA - xO) * (xA - xO) + (yA - yO) * (yA - yO);
		if (OAs < Rs) {
			System.out.println("A is a circle");
		}
		else if (OAs == Rs && OAs > Rs) {
			System.out.println("A is not a circle");
		}
	}
}
