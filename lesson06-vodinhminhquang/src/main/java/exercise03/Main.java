package exercise03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		String email = "";
		boolean isValid = false;
		do {
			try {
				System.out.print("Input your email address: ");
				email = console.nextLine();

				isValidEmail(email);
				isValid = true;
			} catch (EmailException e) {
				System.out.println("" + e.getMessage());
			}
		} while (!isValid);

		console.close();
	}

	private static void isValidEmail(String email) {
		// contains only one @ character
		if (countSpecialCharacter(email) != 1) {
			throw new EmailException("\nAn email addres contains just one @ character");
		}

		// @ character's position cannot be the first or the last in the String
		if (email.charAt(0) == '@' || email.charAt(email.length() - 1) == '@') {
			throw new EmailException("\n@ character's position cannot be the first or the last in the email address");
		}

		if (!email.contains(".com") ) {
			throw new EmailException("\nLack of .com");
		}
		System.out.println("\n=== Valid email ===");

	}

	private static int countSpecialCharacter(String email) {
		int count = 0;
		for (int i = 0; i < email.length(); i++) {
			if (email.charAt(i) == '@') {
				count++;
			}
		}
		return count;
	}
}
