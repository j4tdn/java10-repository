package nguyenduonghuy.lesson02_nguyenduonghuy;

import java.util.Scanner;

public class Ex03 {
	public static boolean isSymmetric(long a) {
		String oldNum = "" + a; 
		String newNum = "";
		for (int i = oldNum.length() - 1; i >= 0; i--) {
			newNum += oldNum.charAt(i);
		}
		return newNum.equalsIgnoreCase(oldNum);
	}
	
	public static void main(String[] args) {
		System.out.println("Enter number: ");
		long a = new Scanner(System.in).nextLong();
		if (isSymmetric(a)) {
			System.out.println(a + " is a symmetric number");
		} else {
			System.out.println(a + " isn't a symmetric number");
		}
	}
}