package ex03;

import java.util.Scanner;

public class Ex03 {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		String strEmail = null;
		do {
			System.out.print("Nhập Email: ");
			strEmail = ip.nextLine();
			try {
				checkRegex(strEmail);
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		} while (true);
		System.out.println("Login successfull !!");

	}

	private static boolean checkRegex(String strEmail) throws Exception {
		String emailRegex = "^[\\w-]+@([\\w-]+\\.)+[\\w-]+$";
		boolean result = strEmail.matches(emailRegex);
		if (!result) {
			throw new Exception("Địa chỉ Email không hợp lệ!! ");
		}
		return true;
	}

}

