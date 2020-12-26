package ex01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex01 {
	
	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		double result = 0;
		do {
			try {
				result = fde();
				break;
			} catch (RuntimeException e) {
				System.out.println("Nhập lại !!!\n=======");
			}
		} while (true);
		
	}
	
	private static double fde () throws RuntimeException {
		int a, b;
		double result = 0;
		DecimalFormat decimalFormat = new DecimalFormat("#.##");//làm tròn 2 chữ số TP

		System.out.print("Nhập vào số a: ");
		a = ip.nextInt();
		System.out.print("Nhập vào số b: ");
		b = ip.nextInt();
		
		if (a == 0) {
			if (b == 0) {
				System.out.println("Phương trình này có vô số nghiệm.");
			} else {
				throw new RuntimeException();
			}
		} else {
			result = (double) -b / a;
			System.out.println("Phương trình có nghiệm x = " + decimalFormat.format(result) + ".");
		}
		return result;
	}

}
