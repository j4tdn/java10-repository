package ex02;

import java.util.Scanner;

/**
 * Viết chương trình cho phép người dùng nhập vào họ và tên sau đó in ra kết quả
 * theo yêu cầu sau: Họ tên nhập vào chỉ bao gồm các kí tự [A-Za-z ] Viết HOA
 * chữ cái đầu tiên của mỗi từ, còn lại là kí tự thường Các kí tự cách nhau một
 * khoảng taring
 *
 */
public class Ex02 {
	public static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		do {
			System.out.print("Enter the Full Name : ");
			try {
				String fullName = ip.nextLine();
				isValid(fullName);
				// viết hoa kí tự đầu
				String fN = toUpperCase(fullName);
				// các kí tự cách nhau 1 khoảng trắng
				whiteSpace(fN);
				break;
			} catch (InvalidCharacter e) {
				System.out.println(e.getMessage());
			}
			System.out.println(" ========================== ");
		} while (true);
	}

	private static void isValid(String input) {
		if (!input.matches("[a-zA-Z\\s]+")) {
			throw new InvalidCharacter("Full name just includes A-Z a-z");
		}
		System.out.println("======  FullName is valid ! =========== ");
	}

	private static String toUpperCase(String fname) {
		String fn = fname.replaceAll("//s+", " ").trim();
		String[] elements = fn.split(" ");
		String result = " ";
		System.out.println("Viết hoa chữ cái đầu mỗi từ : ");
		for (String element : elements) {
			char fword = element.toUpperCase().charAt(0);
			result = element.replace(element.charAt(0), fword).concat(" ");
			System.out.print(result);
		}
		System.out.println();
		return result;
	}

	private static void whiteSpace(String name) {
		System.out.println("Các kí tự cách nhau một khoảng trắng : ");
		for (int i = 0; i < name.length(); i++) {
			System.out.print(name.charAt(i));

		}

	}
}
