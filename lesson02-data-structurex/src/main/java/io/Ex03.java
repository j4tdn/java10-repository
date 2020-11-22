package io;

import java.util.Random;

public class Ex03 {
	private static final String username = "admin";
	private static final String password = "259";
	private static Random rd = new Random();

	public static void main(String[] args) {
		// only print unique elements on console
		// idea: String[] currentPasses = new String[1000];
		String text = null;
		int breakLine =1;
		do {
			text = "" + rd.nextInt(10) + rd.nextInt(10) + rd.nextInt(10);
			//whether does 'text' exist in array ? 
			//if existed => continue
			//else => normal
			//set text to array
			
			breakLine ++;
			if(breakLine % 13 == 0) {
				System.out.println();                     
			}
			System.out.print(text + "   ");
		} while (!signIn("admin", text));
		System.out.println("\n=== Sign In Successfully ===");
		System.out.println("Username: admin");
		System.out.println("Password:" + text);
	}

	// ==: compare variables in stack (object type)
	// ==: compare value(primitive type)
	private static boolean signIn(String ipUsername, String ipPassword) {
		return ipUsername.equals(username) && ipPassword.equals(password);
	}
}
