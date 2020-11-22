package io;

import java.util.Random;
import java.util.Scanner;

public class Ex03 {
	private static final String username = "admin";
	private static final String password = "259";
	private static Random rd = new Random();
	
	public static void main(String[] args) {
		// only print unique elements on console
		//idea : String[] curentPasses =  new String[1000];
		int breakLine =1;
		String text = null;
		do {
			//abc 001 111 985
			text = "" + rd.nextInt(10) +rd.nextInt(10)+rd.nextInt(10);
			//whether does "text" exist in array??
			//if existed => continue
			// alse => as normal
			//set text to array
			breakLine ++;
			if (breakLine % 13 == 0) {
				System.out.println();
			}
			System.out.println(text);
			
		}
		while(!signIn("admin", text));
			
		
		System.out.println("===Sign In successfully====");
		System.out.println("Username: admin");
		System.out.println("Password: " + text);
		
	}	
	//==: compare variables in stack (object type
		private static boolean signIn(String ipUsername,String ipPassword) {
			return ipUsername.equals(username) && ipPassword.equals(password);
		
	}
 
}
