package hoangxuanthanh.lesson03_hoangxuanthanh;

import java.util.Scanner;

public class Ex01{
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int xA, yA, xO, yO, r;
			Scanner input = new Scanner(System.in);
			System.out.print("Enter the coordinate of point A : ");
			xA = input.nextInt();
			System.out.print("Enter the ordinate of point A : ");
			yA = input.nextInt();
			System.out.print("enter the diaphragm of the center O : ");
			xO = input.nextInt();
			System.out.print("enter the center degree O : ");
			yO = input.nextInt();
			System.out.print("Enter the radius : ");
			r = input.nextInt();
			int RSquared = r * r;
			int OASquared = (xA - xO) * (xA - xO) + (yA - yO) * (yA - yO);		
			if (OASquared < RSquared) {
				System.out.println("A is a circle ");
			} else if (OASquared == RSquared && OASquared > RSquared) {
				System.out.println("A is not a circle");
			}
		}
	}