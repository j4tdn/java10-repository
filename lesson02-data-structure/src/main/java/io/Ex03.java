package io;

import java.util.Random;

public class Ex03 {
	private static final String username = "admin";
	private static final String password = "259";
	private static Random rd = new Random();

	public static void main(String[] args) {
		//only print unique elements on console
		//idea :tao 1 mang String[] currentPasses = new String[1000];
		String text = null;
		int breakline = 1;
		do {
			// abc 001 111 982

			text = "" + rd.nextInt(10) + rd.nextInt(10) + rd.nextInt(10);
			
			// kiem tra whether does "test" exit in array
			//if exited => continue
			//else => as normal
			//set text to array
			
			breakline++;
			
			if (breakline % 12 == 0) {
				System.out.println();
			}
			System.out.print(text +" ");

		} while (!signIn("admin", text));
		}

	// == compare variable in stack
	// == : only compare variable in stack
	// == : compare value (primitive type)
	private static boolean signIn(String ipUsername, String ipPassword) {
		return ipUsername.equals(username) && ipPassword.equals(password);
	}
}
