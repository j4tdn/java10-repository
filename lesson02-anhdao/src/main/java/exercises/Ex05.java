package exercises;

import java.util.Scanner;

public class Ex05 {
	/*
	 * Bài 5: Viết chương trình chuyển đổi một số tự nhiên ở hệ cơ số 10 thành số ở
	 * hệ cơ số 2
	 */
	public static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a Decimal number: ");

		int decimalNumber = ip.nextInt();

		System.out.print("Binary number:" + Integer.toBinaryString(decimalNumber));
	}
}
