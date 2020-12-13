package ex02;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		int n;
		Scanner scanner = new Scanner(System.in);	         
	    do {
	        System.out.println("Enter the number of elements in the array: ");
	        n = scanner.nextInt();
	    } while (n < 0);	  
	    int array[] = new int[n];
	         
	    System.out.println("Enter elements for the array ");
	    for (int i = 0; i < n-1; i++) {
	    	do {
	        System.out.print("Enter the th element" + i + ": ");
	        array[i] = scanner.nextInt();
	    	}while(array[i]>n);
	        
	    }
	}
	
	
}
