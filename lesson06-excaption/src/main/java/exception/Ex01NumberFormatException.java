package exception;

import java.util.Scanner;

public class Ex01NumberFormatException {
	private static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		boolean isVald = false;
		int number = 0;
		
		do {
			try {
				 number = Integer.parseInt(ip.nextLine());
				 isVald = true;				 
				} catch(NumberFormatException nfe) {
					System.out.println("Invalid number !");
				}
		}while(!isVald);
		
		
		System.out.println("result: " + number);
		System.out.println("Back to main thread");
	}
}
