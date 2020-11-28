package homework;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);   
	        String str = "";
	        System.out.print("Input a: ");
	        int a = sc.nextInt();
	        int c = a;
	        while(a != 0){
	            int b = a%2;
	            str += b;
	            a /= 2;
	        }
	        StringBuilder buffer = new StringBuilder(str);
	        System.out.println("Base of 2 " + c + " was : " + buffer.reverse());
	    }    
	}
