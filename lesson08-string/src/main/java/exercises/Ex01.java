package exercises;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner td = new Scanner(System.in);
		String name = td.nextLine();
		System.out.println(name);
		System.out.println("=== Iterating ====== ");
		for (int i = 0; i < name.length(); i++) {
			System.out.println(name.charAt(i) + "");
		}
		String[] name1 = name.split("[\\s,-.]+");
		iterate(name1);
		invertstring(name);
	}

	private static void iterate(String[] elements) {
		for (String element : elements) {
			System.out.println(element);

		}

	}

	private static void invertstring(String name) {
		char[] chars = name.toCharArray();
		String[] strings = name.split("[\\s]+");
		for (int i = chars.length - 1; i > 0; i--) {
			System.out.println(chars[i]);

		}
		for (int i = strings.length - 1; i > 0; i--) {
			System.out.println(strings[i]);
		}
	}
}