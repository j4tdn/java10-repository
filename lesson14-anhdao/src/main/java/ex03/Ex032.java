package ex03;

import java.util.Scanner;

public class Ex032 {

	public static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {

		do {
			try {
				System.out.print("Enter String s: ");
				String s = ip.nextLine();
				isValid(s);
				lengthChildSequence(s);
				break;
			} catch (InvalidCharacter e) {
				System.out.println(e.getMessage());
			}
			System.out.println(" ========================== ");
		} while (true);
	}

	private static void isValid(String input) {
		if (!input.matches("[a-z\\s]+")) {
			throw new InvalidCharacter(" String just includes A-Z ");
		}
		if (input.length() > 255) {
			throw new InvalidCharacter(" String < 255 character ");
		}
	}
	private static void lengthChildSequence(String input) {
		int[] count = new int[input.length()];
		boolean[] flags = new boolean[input.length()];
		int k = 1;
		String child = "";
		for (int i = 0; i < input.length(); i++) {
			if (!flags[i]) {
				for (int j = i + 1; j < input.length(); j++) {
					if (input.charAt(i) == input.charAt(j)) {
						count[i] = ++k;
						flags[i] = true;
						flags[j] = true;
					} else {
						count[i] = k;
						break;
					}

				}
			}
			k = 1;
		}

		int max = count[0];
		int indexMax = 0;
		for (int i = 0; i < count.length; i++) {
			if (max < count[i]) {
				max = count[i];
				indexMax = i;
			}
		}
		child = input.substring(indexMax, indexMax + max);
		System.out.println("MAX length substring : " + max + " {" + child + "} " + " [" + indexMax + "] ");

		
	}
}

