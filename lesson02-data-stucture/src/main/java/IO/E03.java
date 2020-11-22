package IO;

import java.util.Random;
import java.util.Scanner;

public class E03 {
   private static final String username = "admin";
   private static final String password = "259";
   private static Scanner ip = new Scanner(System.in);
    
   private static Random rd = new Random();
   
   public static void main(String[] args) {
	   // only print untique element on console
	   // idea:String[] currentpasses = new string[1000};
	   int breakLine =1;
	   String text = null;
		do {
			// abc 001 111 192
			text = "" + rd.nextInt(10) + rd.nextInt(10) + rd.nextInt(10);
			
			//wether does "text" exist int array?
			// if existed => continue
			// else => as normal
			
			// set text to array
			
			
			breakLine ++;
			if (breakLine % 13 == 0) {
			    System.out.println();
		}
		System.out.println(text);
		}
		while(!singIn("admin", text )) ;
	    System.out.println("Sing in successfully ===========");
	    System.out.println("username: admin");
	    System.out.println("password: " + text);
   }
   // :==
   private static boolean singIn(String ipUsername, String ipPassword) {
	   return ipUsername.equals(username) && ipPassword.equals(password);
   }
}
   
