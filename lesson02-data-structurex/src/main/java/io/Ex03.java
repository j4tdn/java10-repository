package io;

import java.util.Random;
import java.util.Scanner;

public class Ex03 {
	private static final String username ="admin";
	private static final String passwrord ="259";
	private static Random rd = new Random();

 public static void main(String[] args) {
	 // only print unique elements on console
	 // idea: String [] currenPasses = new String [1000];
	 int breakLine=1;
	String text=null;
	do {
		text =""+ rd.nextInt(10) + rd.nextInt(10)+rd.nextInt(10);
		
		// whether does text exist in array?
		// if existed => continue
		//else => as normal
		// add text to array
		breakLine ++;
		if(breakLine%13==0) {
			System.out.println();
		}
		System.out.print(text+ "	");
	}
	while(!signIn("admin", text)) ;
	System.out.println("== Sign In successfully ==");
	System.out.println("User name: admin");
	System.out.println("Pass Wrod:" +text);


	
}
 // == :compare variables in stack (object type)
 private static boolean signIn(String ipUsername, String ipPasswrod) {
	 return ipUsername.equals(username) && ipPasswrod.equals(passwrord); 
 }
}
