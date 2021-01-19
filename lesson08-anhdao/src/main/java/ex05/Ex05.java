package ex05;

import java.util.Scanner;

import ex02.InvalidCharacter;

public class Ex05 {
	public static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		do {
			try {
				System.out.print("Enter s1 : ");
				String s1 = ip.nextLine();
				isValid(s1);
				System.out.print("Enter s2 : ");
				String s2 = ip.nextLine();
				isValid(s2);
				String result = sub(s1, s2);
				System.out.println("duplicate : " + result);
				break;
			} catch (InvalidCharacter e) {
				System.out.println(e.getMessage());
			}
			System.out.println(" ========================== ");
		} while (true);
	}

	private static void isValid(String input) {
		if (!input.matches("[A-Z\\s]+")) {
			throw new InvalidCharacter(" String just includes A-Z ");
		}
		if(input.length()>250) {
			throw new InvalidCharacter(" String < 255 character ");

		}
	}

	public static String sub(String s1, String s2) {
		if (s1.length() >= s2.length()) {
			String s = s1;
			s1 = s2;
			s2 = s;
		}

		if (s2.contains(s1)) {
			return s1;
		} else {
			String child = "";
			for (int i = 0; i < s1.length(); i++) {
				for (int k = s1.length(); k > i + 1; k--) {
					child = s1.substring(i, k);
					if (s2.contains(child)) {
						return child;
					}
				}
			}
			
			return child;
		}
	}
}
