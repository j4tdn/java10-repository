package ex03;

import java.util.Scanner;

public class Ex03 {
	public static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter String s : ");
		String s = ip.nextLine();
		permute(s);
	}

	public static void permute(String input) {
		int inputLength = input.length();
		boolean[] used = new boolean[inputLength];
		StringBuffer outputString = new StringBuffer();
		char[] in = input.toCharArray();
		doPermute(in, outputString, used, inputLength, 0);

	}

	public static void doPermute(char[] in, StringBuffer outputString, boolean[] used, int inputLength, int level) {
		if (level == inputLength) {
			System.out.println(outputString.toString());
			return;
		}

		for (int i = 0; i < inputLength; ++i) {
			if (used[i])
				continue;
			outputString.append(in[i]);
			used[i] = true;
			doPermute(in, outputString, used, inputLength, level + 1);
			used[i] = false;
			outputString.setLength(outputString.length() - 1);
		}
	}
}
