package lesson02_excercise;

import java.util.Scanner;

public class Bai5_Binary {
	public static void main(String[] args) {
		int num;
		 Scanner scanner = new Scanner(System.in);
	        System.out.println("Decimal = ");
	        num = scanner.nextInt();
		System.out.println("=> Binary "+binary(num));
	}
	
	public static String binary(int num) {
		int remainder;
		String result ="";
		while(num > 0) {
			remainder = num % 2;
			num = num / 2;
			result = remainder + result;
		}
		return result;
	}
}
