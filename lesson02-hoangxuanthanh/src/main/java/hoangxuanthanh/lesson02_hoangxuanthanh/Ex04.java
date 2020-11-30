package hoangxuanthanh.lesson02_hoangxuanthanh;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to convert");
		int m = sc.nextInt();

		System.out.print("convert to base 2 is =");
		convert(m);

	}

	public static void convert(int a) {
		
		int two[] = new int[40];
		
		  int index = 0;

	      while(a > 0){
	    	  
	    	  two[index++] = a%2;
	    	  
	        a = a/2;
	        }
	      
	      for(int i = index-1;i >= 0;i--){

	          System.out.print(two[i]);

	        }
	}

}
