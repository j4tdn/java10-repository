package lesson02;

import java.util.Scanner;

public class Ex05 {  //bai5

	public static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {

			System.out.println("Enter a Decimal number: ");

			int decimalNumber = ip.nextInt();

			System.out.print("Binary number:" + Integer.toBinaryString(decimalNumber));
	}
}