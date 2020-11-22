package io;

import java.util.Random;
import java.util.Scanner;

public class Ex03 {
	private static final String username = "admin";
	private static final String password = "259";
	private static Random rd = new Random();
	
	public static void main(String[] args) {
		//only print unique elements on console --> co the random lai phan tu nhung khong duoc in phan tu lap lai
		//idea: String[] currentPasses new String[1000];
		int breakLine = 1;
		String text = null;
		do {
			text = "" + rd.nextInt(10) + rd.nextInt(10) + rd.nextInt(10);
			
			//whether does text exist in array
			//if existed => continue (bo qua con so lap lai va random nhung con so khac)
			//else => as normal (bo so moi vao mang da co san)
			
			//set the text into the above array
			breakLine++;
			if(breakLine % 13 == 0) {
				System.out.println();
			}
			System.out.print(text + "   ");
		}while(!signIn("admin", text));
		
		
		System.out.println("\n=== Sign In successfully === ");
		System.out.println("Username: admin");
		System.out.println("Password: " + text);
	}

	// ==: compare variables in stack (object type)
	private static boolean signIn(String ipUsername, String ipPassword) {
		return ipUsername.equals(username) && ipPassword.equals(password);
	}

}
