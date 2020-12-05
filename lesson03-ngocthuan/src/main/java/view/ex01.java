package view;

import java.util.Scanner;

public class ex01 {
        public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int xA, yA, xO, yO, r;
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the coordinate of point A: ");
			xA = input.nextInt();
			System.out.println("Enter the ordinatea of point A");
	        yA = input.nextInt();
			System.out.println("Enter the diaphagm of the center O: ");
			xO = input.nextInt();
			System.out.println("Enter the center degree O: ");
			yO = input.nextInt();
			System.out.println("Enter the radius: )");
			r = input.nextInt();
			int RSquared = r * r;
			int OASquared = (xA - xO) * (xA - xO) + (yA - yO) * (yA - yO);
			if (OASquared < RSquared) {
				System.out.println("A thuoc duong tron");
			}else if (OASquared == RSquared && OASquared > RSquared) {
				System.out.println("A khong thuoc duong tron");
			
			}
		}
}
