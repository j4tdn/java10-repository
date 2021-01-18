package ex01;

import java.util.Scanner;

public class Ex01 {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		String s = null;
		do {
			System.out.print("Enter string: ");
			s = ip.nextLine();
			try {
				enterString(s);
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		} while (true);
		System.out.println("In kí tự: ");
		printfCharacters(s);
		System.out.println("In từ: ");
		printfWords(s);
		System.out.println("Dãy kí tự và từ đảo ngược: ");
		invertstring(s);

	}

	private static boolean enterString(String s) throws Exception {
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if ((!Character.isAlphabetic(c) && !Character.isSpaceChar(c))) {
				throw new Exception("Chuỗi chỉ chứa kí tự tiếng việt và khoảng trắng !");
			}
		}
		return true;
	}

	private static void printfCharacters(String s) {
		char[] chars = s.toCharArray();
		for (char c : chars) {
			System.out.println(c);
		}
	}

	private static void printfWords(String s) {
		String[] strings = s.split("[\\s]+");
		for (String string : strings) {
			System.out.println(string);
		}

	}

	private static void invertstring(String s) {
		char[] chars = s.toCharArray();
		String[] strings = s.split("[\\s]+");
		for (int i = chars.length - 1; i > 0; i--) {
			System.out.println(chars[i]);

		}
		for (int i = strings.length - 1; i > 0; i--) {
			System.out.println(strings[i]);
		}

	}

}
