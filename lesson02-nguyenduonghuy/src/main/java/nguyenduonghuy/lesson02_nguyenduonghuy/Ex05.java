package nguyenduonghuy.lesson02_nguyenduonghuy;

import java.util.Scanner;

public class Ex05 {
	public static String binaryNumber(long decNum) {
		String inverseBinNum = "";
		String binNum = "";
		do {
			inverseBinNum += "" + decNum % 2;
			decNum /= 2;
		} while (decNum >= 1);
		// reverse inverseBinNum -> binNumber
		for (int i = inverseBinNum.length() - 1; i >= 0; i--) {
			binNum += inverseBinNum.charAt(i);
		}
		return binNum;
	}

	public static void main(String[] args) {
		System.out.print("Enter a decimal number: ");
		long decNum = new Scanner(System.in).nextLong();
		// System.out.println(Long.toBinaryString(decNum));
		System.out.print("Binary number: " + binaryNumber(decNum));
	}
}