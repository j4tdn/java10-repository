package exercises;

import java.util.Scanner;

public class Ex02 {
	public static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		do {
			System.out.print("Enter new password : ");
			try {
				String input = ip.nextLine();
				isValid(input);
				break;
			} catch (RuntimeException e) {
				System.out.println(e.getMessage());
			}
			System.out.println("e.getMessage()");
		} while (true);
	}

	private static void isValid(String input) throws Exception {
		if (input.charAt(0) == '@' || input.charAt(input.length() - 1) == '@') {
			System.out.println("The @ character cannot be in the first or last position!");
		}
		int count = 0;
		for (int i = 1; i < input.length() - 2; i++) {
			if (input.charAt(i) == '@') {
				count++;
			}
		}
		if (count != 1) {
			System.out.println("Email addresses have only one @ character!");
		}
		System.out.println("Valid Email!");
	}

}
