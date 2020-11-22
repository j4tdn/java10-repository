package io;

import java.util.Random;

public class Ex03 {
	private static final String username = "admin";
	private static final String password = "169";
	private static final Random rd = new Random();

	public static void main(String[] args) throws InterruptedException {
		// only print unique elements on console
		//idea: String[] currentPasses = new String[1000];
		// if existed => continue
		// else => as normal
		// set text to array
		
		int breakLine = 1;
		String text = null;

		do {
			text = "" + rd.nextInt(10) + rd.nextInt(10) + rd.nextInt(10);
			breakLine++;
			if (breakLine % 12 == 0) {
				System.out.println();
			}
			System.out.print (text + " ");
			Thread.sleep(100);
		} while (!signIn("admin", text));

		System.out.println();
		System.out.println("Sign in successfully");
		System.out.println("Username: admin");
		System.out.println("Password: " + text);
	}

	private static boolean signIn(String ipUsername, String ipPassword) {
		return ipUsername.equals(username) && ipPassword.equals(password);
	}
}
