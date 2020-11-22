package io;

import java.util.Random;
import java.util.Scanner;

public class Ex03 {
	private static final String username = "admin";
	private static final String password = "259";
	private static Random rd = new Random();

	public static void main(String[] args) {
		// only print unique element on console
		// idea : String[] currentPasses = new String[1000]
		int breakLine = 1;
		String text = null;
		do {
			text = "" + rd.nextInt(10) + rd.nextInt(10) + rd.nextInt(10);
			// whether does test exist in array?
			// if existed => continue
			// else => as normal

			// set text to array
			breakLine++;
			if (breakLine % 12 == 0) {
				System.out.println();
			}
			System.out.print(text + " ");
		} while (!signIn("admin", text));

		System.out.println(" sign in successfully ===");
		System.out.println(" username: admin");
		System.out.println(" password :" + text);
	}

	private static boolean signIn(String ipUsername, String ipPassword) {
		return ipUsername.equals(username) && ipPassword.equals(password);
	}
}
