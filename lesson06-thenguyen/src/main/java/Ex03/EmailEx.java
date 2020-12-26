package Ex03;

import java.util.Scanner;

import Ex02.InvalidCharacter;

public class EmailEx {
	public static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) throws InvalidCharacter {
		do {
			System.out.print("Enter A Email : ");
			String input = ip.nextLine();
			try {
				isValid(input);
				break;
			} catch (RuntimeException e) {
				System.out.println(e.getMessage());
			}
			System.out.println(" Back to main thread! ");
		} while (true);
	}

	private static void isValid(String input) throws InvalidCharacter {
		if (input.charAt(0) == '@' || input.charAt(input.length() -1) == '@') {
			throw new InvalidCharacter("The @ character cannot be in the first or last position ");
		}
		int count = 0;
		for (int i = 1; i < input.length() - 1; i++) {
			if (input.charAt(i) == '@') {
				count++;
			}
		}
		if (count != 1) {
			throw new InvalidCharacter("Email address contains only one character @ ");
		}
		System.out.println("Email is Valid !");
	}
}
