package ex02;

import java.util.Scanner;

public class Ex02 {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		String s = null;
		do {
			System.out.print("Enter string: ");
			s = ip.nextLine();
			try {
				enterName(s);
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		} while (true);
		String result = formatName(s);
		System.out.println("Result: " + result);

	}

	private static boolean enterName(String s) throws Exception {
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if ((!Character.isAlphabetic(c) && !Character.isSpaceChar(c))) {
				throw new Exception("Họ tên chỉ chứa kí tự tiếng việt và khoảng trắng !");
			}
		}
		return true;
	}

	private static String formatName(String s) {
		s = s.trim().replaceAll("[\\s]+", " ");
		String[] strings = s.split(" ");
		for (int i = 0; i < strings.length; i++) {
			strings[i] = strings[i].toLowerCase();
			char[] chars = strings[i].toCharArray();
			chars[0] = Character.toUpperCase(chars[0]);
			strings[i] = String.valueOf(chars);
		}
		return String.join(" ", strings);

	}
}
