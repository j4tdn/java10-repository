package ex03;

import java.util.Scanner;

public class EmailException {

	private static Scanner ip = new Scanner(System.in);

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
			System.out.println("Ký tự @ không được ở đầu hoặc cuối!");
		}
		int count = 0;
		for (int i = 1; i < input.length() - 2; i++) {
			if (input.charAt(i) == '@') {
				count++;
			}
		}
		if (count != 1) {
			System.out.println("Địa chỉ email chỉ được chứa 1 ký tự @");
		} else {
			System.out.println("Email Hợp lệ!");
			return 1;

		}
		return 0;

	}

}
