package ex02;

import java.util.Scanner;

public class SignUpAccounts {
	public static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) throws Exception {

		do {
			System.out.print("Enter new user : ");
			String user = ip.nextLine();
			System.out.print("Enter new password : ");
			String password = ip.nextLine();
			try {
				isValid(password);
			} catch (RuntimeException e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
			System.out.println(" ====== back to main ======= ");
		} while (true);
	}
	public static boolean contain(String item, int a) {
		for (int i = 0; i < item.length(); i++) {
			if (item.charAt(i) == a) {
				return true;
			}
		}
		return false;
	}

	public static boolean contains(String item, Condition con) {
		for (int i = 0; i < item.length(); i++) {
			if (con.test(item.charAt(i))) {
				return true;
			}
		}
		return false;
	}

	private static void isValid(String input) throws InvalidCharacter {
		String specialCharacters = "~!@#$%^&*()_+-=,./;''[]<>?:{}♥";

		for (int i = 0; i < input.length(); i++) {
			if (input.length() < 8) {
				throw new InvalidCharacter("Password must contain at least 8 character");
			} else if (input.length() > 256) {
				throw new InvalidCharacter("At most 256 character");
			}
			if (!contains(input, a -> contain(specialCharacters, a))) {
				throw new InvalidCharacter("Password must contain at least 1 special character");
			}
		}
		if (!contains(input, a -> Character.isDigit(a))) {
			throw new InvalidCharacter("Password must contain at least 1 special character 1 number ");
		}
		if (!contains(input, a -> Character.isLowerCase(a))) {
			throw new InvalidCharacter("Password must contain at least 1 special character 1 LowerCase alphabetic");
		}
		
		if (!contains(input, a -> Character.isUpperCase(a))) {
			throw new InvalidCharacter("Password must contain at least 1 special character 1 UpperCase alphabetic");
		}
		System.out.println(" Password is Valid \r\n"
				+ "Successful Registration!!! ");
	}

	

}