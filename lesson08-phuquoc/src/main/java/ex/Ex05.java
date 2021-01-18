package ex;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		String s1;
		String s2;
		String result = "";
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập chuỗi s1:");
		s1 = scanner.nextLine();
		System.out.println("Nhập chuỗi s2:");
		s2 = scanner.nextLine();
		System.out.println("s1:" + s1.trim().toUpperCase());
		System.out.println("s2:" + s2.trim().toUpperCase());
		for (int i = 0; i < s1.length(); i++) {
			for (int j = 0; j < s2.length(); j++) {
				if (s1.charAt(i) == s2.charAt(j)) {
					result = result + s1.charAt(i);
				}
			}

		}

		System.out.println("Các phân tử chung:" + removeDuplicates(result).toUpperCase());
	}

	// Loai bỏ các phần tử trùng
	static String removeDuplicates(String s) {
		StringBuilder noDupes = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			String si = s.substring(i, i + 1);
			if (noDupes.indexOf(si) == -1) {
				noDupes.append(si);
			}
		}
		return noDupes.toString();
	}
}
