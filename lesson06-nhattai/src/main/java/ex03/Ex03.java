package ex03;

import java.util.Scanner;

public class Ex03 {
	public static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {

		try {
			do {
				System.out.print("Nhập email: ");
				String input = ip.nextLine();
				if (isValid(input) == 1)
					break;
			} while (true);
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());

		}
	}

	private static int isValid(String input) {
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
		} else {
			System.out.println("Email is Valid !");
			return 1;

		}
		return 0;
	}
}
