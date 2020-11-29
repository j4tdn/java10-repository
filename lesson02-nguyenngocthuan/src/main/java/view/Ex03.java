package view;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
		int n;
		boolean res;
		Scanner sc;
		do {
			System.out.println("Input n = ");
			sc = new Scanner(System.in);
			n = sc.nextInt();
		}
		while(n <= 0);
		
		res = isPalindromeNum(n);
		if(res) {
			System.out.println( " sysmetry");
		}
		else {	
			System.out.println( "unsymmetricalr");
		}
		
		sc.close();
	}
    public static boolean isPalindromeNum(int n) {
        int res = 0, temp = n;
        while(temp > 0) {
        	res = res*10 + temp % 10;
        	temp /=10;
        }
        if(res == n) {
        	return true;			
        }
        else {
        	return false;
        }
   }   
}
