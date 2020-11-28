package NhatTai.lesson02_NhatTai;

import java.util.Scanner;

public class ex04 {
	public static void main(String[] args) {
		int n;
		
		Scanner ip = new Scanner(System.in);
		do {
			System.out.println("enter into a number of array: ");
			n = ip.nextInt();
		} while (n <= 0);

		int A[] = new int[n];

		System.out.println("enter elements for the array: ");
		for (int i = 0; i < n; i++) {
			System.out.print("enter element  " + i + ": ");
			A[i] = ip.nextInt();
		}
		seondLargestOddNumber(A,n);

		
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
			        	 System.out.println("2nd largest odd value in array: " +a[i-1]);
			            break;
			        }
			    }	
			}	
		
		
	}
	
	
