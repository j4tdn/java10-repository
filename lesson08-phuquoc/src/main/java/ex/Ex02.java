package ex;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		String fullName;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Full Name:");
		fullName = scanner.nextLine();
		System.out.println("FullName:"+fullName);
		System.out.println("Chữ cái đầu viết hoa:"+toTitleCase(fullName));
	}
	public static String toTitleCase(String string) {
	    String[] arr = string.split(" ");
	    StringBuffer sb = new StringBuffer();

	    for (int i = 0; i < arr.length; i++) {
	        sb.append(Character.toUpperCase(arr[i].charAt(0)))
	            .append(arr[i].substring(1)).append(" ");
	    }          
	    return sb.toString().trim();
	}  
}
