package io;

import java.util.Random;

public class Ex03 {

	private static final String username = "admin";
	private static final String password = "259";
	private static Random rd= new Random();
	
	public static void main(String[] args) {
		// only print unique elements on console
		// idea: String[] curentPasses = new String
		int breakLine = 1;
		String text = null ; 
		do {
			text = "" + rd.nextInt(10) + rd.nextInt(10) + rd.nextInt(10);
			breakLine ++;
			if (breakLine % 13 == 0) {
				System.out.println();
			}
			System.out.print(text + " ");
		}	while(!signInt("admin", text));
			
		System.out.println("===Sign In successfully");
		System.out.println("Username: admin");
		System.out.println("Password: " + text);
		
	}
	
	
	private static boolean signInt(String ipUsername, String ipPassword) {
		return ipUsername.equals(username) && ipPassword.equals(password);
	}
}
