package view;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		int n;
	    Scanner scanner = new Scanner(System.in);	         
	    do {
	        System.out.println("Enter the number of elements in the array: ");
	        n = scanner.nextInt();
	    } while (n < 0);	  
	    int array[] = new int[n];
	         
	    System.out.println("Enter elements for the array: ");
	    for (int i = 0; i < n; i++) {
	        System.out.print("Enter the th element" + i + ": ");
	        array[i] = scanner.nextInt();
	    }
	    seondLargestOddNumber(array,n);
	}
	private static void seondLargestOddNumber(int array[],int n)
	{  int a[] = new int[n];
	  int k=0;
	  for(int i = 0; i < n; i++) {
		if(array[i]%2!=0)
		a[k]= array[i];
		k++;
		}
		for(int i = 0; i < n; i++)
	    {
	        for(int j = i+1; j < n; j++)
	        {
	            if(a[i] > a[j])
	            {
	                int z = a[i];
	                a[i] = a[j];
	                a[j] = z;
	            }        
	        }
	    }
	    for(int i = n-1; i >= 0; i--)
	    {
	        if(a[i] > a[i-1])
	        {
	        	 System.out.println("2nd value in the array is" +a[i-1]);
	            break;
	        }
	    }	
	}
	
}
