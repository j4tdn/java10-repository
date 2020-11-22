package io;

import java.util.Random;
import java.util.Scanner;

public class Ex04Hack {
	private static final String username = "admin";
	private static final String password = "259";
	private static Random rd = new Random();
	
	public static void main(String[] args) {
		int breakLine = 0;
		String text = null;
		do {
			text = "" + rd.nextInt(10) + rd.nextInt(10) + rd.nextInt(10);
			System.out.print(text + "   ");
			breakLine++;
			if (breakLine % 20 == 0) {
				System.out.println();
			}
		} while (!signIn("admin", text));
		System.out.println("\n Sign in successfully");
	}
	
	private static boolean signIn(String ipUsername, String ipPassword) {
		return ipUsername.equalsIgnoreCase(username) && ipPassword.equalsIgnoreCase(password);
	}
}
