package exception;

import java.util.Scanner;

public class Ex01NPE {
	private static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		int number = 0;
		do {
			try {
				System.out.println("Enter a number: ");
				number  = Integer.parseInt(ip.nextLine());
				break;
				
			} catch (NumberFormatException nfe) {
			    System.out.println("Invalid number !");
			}
		} while (true);
		
		System.out.println("result: " + number);
		System.out.println("Back to main thread !");
		
	}

}
