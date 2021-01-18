import java.util.Scanner;

import javax.swing.plaf.basic.BasicPasswordFieldUI;

public class Exercise02 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		boolean isValid = false;
		String name;
		do {
			System.out.print("Enter your name: ");
			name = console.nextLine().trim();

			isValid = isLegitName(name);
			if (!isValid) {
				System.out.println("Invalid name!");
			} else {
				System.out.println("Valid name!");
			}
		} while (!isValid);
		System.out.println("===========================");
		String delimiters = "[\\s]+";
		System.out.println(uppercaseTheFirstLetter(name, delimiters));
		console.close();
	}

	private static boolean isLegitName(String name) {
		String text = name;
		for (int i = 0; i < text.length(); i++) {
			if (!Character.isLetter(name.charAt(i)) && name.charAt(i) != '\s') {
				return false;
			}
		}
		return true;
	}
	
	private static String uppercaseTheFirstLetter(String text, String delimiters) {
		String[] arr = text.split("\\s+");
		String result = "";
		for (String elements : arr) {
			elements = elements.replaceFirst(elements.charAt(0) + "", Character.toUpperCase(elements.charAt(0)) + "");
			result += elements + " ";
		}
		return result;
	}
}
