package ex03;

import java.util.Scanner;
import ex02.InvalidCharacter;

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
			System.out.println(" Back to main thread! ");
			System.out.println(" ========================== ");
		} while (true);
	}

	private static void isValid(String input) {
		if (input.charAt(0) == '@' || input.charAt(input.length() - 1) == '@') {
			throw new InvalidCharacter("Kí tự @ không thể ở vị trí đầu tiên hoặc cuối cùng ");
		}
		int count = 0;
		for (int i = 1; i < input.length() - 2; i++) {
			if (input.charAt(i) == '@') {
				count++;
			}
		}
		if (count != 1) {
			throw new InvalidCharacter("Địa chỉ Email chứa duy nhất một kí tự @ ");
		}
		System.out.println("Email is Valid !");
	}

}
