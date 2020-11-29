package view;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value n : ");
		n = sc.nextInt();
		boolean result = Symmetrical(n);
		if (result) {
			System.out.println(n + " is a Symmetrical number");
		} else {
			System.out.println(n + " is not a Symmetrical number");
		}

	}

	private static boolean Symmetrical(int n) {
		int result = 0;
		int tpm = n;
		for (int i = 0; i < n / 2; i++) {
			while(tpm%10>0) {
				result = result*10 + tpm;
				
			}
			if(result==n) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}

}
