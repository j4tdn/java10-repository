package ex02;

import java.util.Scanner;

public class Demo {

	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("================== Sign In ==================");
		System.out.print("Nhập username: ");
		String username = checkUserName();
		System.out.print("Nhập password: ");
		String password = checkPassword();
		System.out.println("======================");
		System.out.println("Sign in successfull!");
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
	}

	private static String checkUserName() {
		String userName = ip.nextLine().trim();
		if (userName.isBlank()) {
			System.err.println("UserName trống!");
			System.out.print("Nhập lại: ");
			return checkUserName();
		}
		if (Character.isDigit(userName.charAt(0))) {
			System.err.println("UserName không được bắt đầu bằng số!");
			System.out.print("Nhập lại: ");
			return checkUserName();
		}
		return userName;
	}

	private static String checkPassword() {
		String password = ip.nextLine();
		if (password.isBlank()) {
			System.err.println("Password trống!");
			System.out.print("Nhập lại: ");
			return checkPassword();
		}
		if (password.length() < 8 || password.length() > 256) {
			System.err.println("Độ dài mật khẩu phải ít nhất 8 kí tự và tối đa 256 kí tự!");
			System.out.print("Nhập lại: ");
			return checkPassword();
		}
		if (!checkPass(password, c -> Character.isLowerCase(c))) {
			System.err.println("Mật khẩu phải chứa ít nhất 1 kí tụ viết thường!");
			System.out.print("Nhập lại: ");
			return checkPassword();
		}
		if (!checkPass(password, c -> Character.isUpperCase(c))) {
			System.err.println("Mật khẩu phải chứa ít nhất 1 kí tự viết hoa!");
			System.out.print("Nhập lại: ");
			return checkPassword();
		}
		if (!checkPass(password, c -> Character.isDigit(c))) {
			System.err.println("Mật khẩu phải chứa ít nhất 1 số!");
			System.out.print("Nhập lại: ");
			return checkPassword();
		}
		if (!checkSpecialCharacter(password)) {
			System.err.println("Mật khẩu phải chứa ít nhất 1 ký tự đặc biệt!");
			System.out.print("Nhập lại: ");
			return checkPassword();
		}

		return password;
	}

	private static boolean checkPass(String password, Condition con) {
		int count = 0;
		for (int i = 0; i < password.length(); i++) {
			if (con.test(password.charAt(i))) {
				count++;
			}
		}
		return count > 0;
	}

	private static boolean checkSpecialCharacter(String password) {
		char[] specChar = { '~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '=', '+', '[', ']', '|',
				';', ':', ',', '.', '<', '>', '?', '/' };
		for (int i = 0; i < password.length(); i++) {
			for (int j = 0; j < specChar.length; j++) {
				if (specChar[j] == password.charAt(i)) {
					return true;
				}
			}
		}
		return false;
	}

}
