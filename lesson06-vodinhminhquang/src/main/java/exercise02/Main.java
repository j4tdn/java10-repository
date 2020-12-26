package exercise02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		//password: minhquang28
		String password = "";
		boolean isValid = false;
		do {
			try {
				System.out.print("Password: ");
				password = console.nextLine();
				checkPassword(password);
				
				isValid = true;
			} catch (Exception e) {
				System.out.println("log: " + e.getMessage());
				System.out.println();
			}
		} while (!isValid);
	}

	private static boolean validateEachCharacter(String password, UserCondition condition) {
		for (int i = 0; i < password.length(); i++) {
			// Check condition for each character
			if (condition.test(password.charAt(i))) {
				return true;
			}
		}
		return false;
	}

	private static void checkPassword(String password) {
		if (password.length() < 8) {
			throw new InvalidFormatPassword("It must at least 8 characters");
		} else if (password.length() > 15) {
			throw new InvalidFormatPassword("It must at most 15 characters");
		}

		if (!validateEachCharacter(password, character -> Character.isLowerCase(character))) {
			throw new InvalidFormatPassword("It must at least 1 lowercase alphabetic character (a, b, c...)");
		}
		if (!validateEachCharacter(password, character -> Character.isUpperCase(character))) {
			throw new InvalidFormatPassword("It must at least 1 uppercase alphabetic character (A, B, C...)");
		}
		if (!validateEachCharacter(password, character -> Character.isDigit(character))) {
			throw new InvalidFormatPassword("It must at least 1 number (1, 2, 3...)");
		}
		
		if (!validateEachCharacter(password, character -> isSpecialCharacter(character))) {
			throw new InvalidFormatPassword("At least 1 special character (~!@#$%^&*()-_=+[]{}|;:,.<>/?)");
		}
		System.out.println("Valid password !!!");
	}
	
	private static boolean isSpecialCharacter(char character) {
		String specialCharacter = "~!@#$%^&*()-_=+[]{}|;:,.<>/?";
		
		for(int i = 0; i < specialCharacter.length(); i++) {
			if(specialCharacter.charAt(i) == character) {
				return true;
			}
		}
		return false;
	}
}
