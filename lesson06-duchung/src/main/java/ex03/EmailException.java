package ex03;

import java.util.Scanner;

public class EmailException {
	public static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		do {
			System.out.print("Enter new password : ");
			try {
				String input = ip.nextLine();
				isValid(input);
				break;
			} catch (RuntimeException e) {
				System.out.println(e.getMessage());
			}
		} while (true);
	}

	private static void isValid(String input) {
		if (input.charAt(0) == '@' || input.charAt(input.length() - 1) == '@') {
			System.out.println("The @ character cannot be at the beginning or end of a position");
		}
		int count = 0;
		for (int i = 1; i < input.length() - 2; i++) {
			if (input.charAt(i) == '@') {
				count++;
			}
		}
		if (count != 1) {
			System.out.println("Email address contains only one @ characte");
		}
		System.out.println("Email is Valid !");
	}

}
