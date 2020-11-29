package practise;

import java.util.Scanner;

public class Pra02If_else {
	public static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("enter point :");
		float point = ip.nextFloat();
		if (point <0|| point>10) {
			System.out.println(" wrong");
		}else {
			if (point < 5) {
				System.out.println("Yeu");
			} else if (point <= 6.5) {
				System.out.println("Tb");

			} else if (point <= 8) {
				System.out.println("kha ");
			} else {
				System.out.println("gioi");
			}

		}
		
	}
}
