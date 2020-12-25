package ex02;

import java.util.Scanner;
public class Ex02 {
	public static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {

		do {
			System.out.print("Enter new password : ");
			try {
				String password = ip.nextLine();
				isValid(password);
				break;
			} catch (RuntimeException e) {
				System.out.println(e.getMessage());
			}
			System.out.println(" ========================== ");
		} while (true);
	}

	private static void isValid(String input) {
		String special = "!,#.$%@&*()_+=|<>?{}\\]~-";

		for (int i = 0; i < input.length(); i++) {
			if (input.length() < 8) {
				throw new InvalidCharacter("MUST contain - At least 8 character");
			} else if (input.length() > 256) {
				throw new InvalidCharacter("MUST contain - At most 256 character");
			}
			if (!contains(input, a -> contain(special, a))) {
				throw new InvalidCharacter("MUST contain - At 1 special character");
			}
		}

		if (!contains(input, a -> Character.isLowerCase(a))) {
			throw new InvalidCharacter("MUST contain - At least 1 LowerCase alphabetic");
		}
		if (!contains(input, a -> Character.isDigit(a))) {
			throw new InvalidCharacter("MUST contain - At least 1 number ");
		}
		if (!contains(input, a -> Character.isUpperCase(a))) {
			throw new InvalidCharacter("MUST contain - At least 1 UpperCase alphabetic");
		}
		System.out.println(" Password is valid ! ");
	}

	public static boolean contains(String item, Condition con) {
		for (int i = 0; i < item.length(); i++) {
			if (con.test(item.charAt(i))) {
				return true;
			}
		}
		return false;
	}

	public static boolean contain(String item, int a) {
		for (int i = 0; i < item.length(); i++) {
			if (item.charAt(i) == a) {
				return true;
			}
		}
		return false;
	}
}
