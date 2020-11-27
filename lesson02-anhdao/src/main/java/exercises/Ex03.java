package exercises;

import java.util.Scanner;

/*
 * Bài 3: Nhập vào một số bất kỳ. Kiểm tra số đó có phải là số đối xứng hay
 * không
 * 
 */
public class Ex03 {

	public static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter Number:");
		int number = ip.nextInt();
		if (checkSymmetry(number)) {
			System.out.println(number + " is symmetrical number");
		} else {
			System.out.println(number + " is not symmetrical number");
		}
	}

	public static boolean checkSymmetry(int a) {

		String oriNum = "" + a;
		String newNum = "";
		for (int i = oriNum.length() - 1; i >= 0; i--) {
			newNum += oriNum.charAt(i);
		}
		return newNum.equals(oriNum);
	}

}
