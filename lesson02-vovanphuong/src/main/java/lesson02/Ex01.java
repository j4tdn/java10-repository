package lesson02;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập số a: ");
		int a = ip.nextInt();
		System.out.print("Nhập số b: ");
		int b = ip.nextInt();
		System.out.print("Nhập số c: ");
		int c = ip.nextInt();
		
		System.out.println(Sort(a,b,c));
		
		
	}
	private static String Sort(int a, int b, int c) {
		int temp;
		
		if(a>b){
	        temp=a;
	        a=b;
	        b=temp;
	    }
	 
	    if(a>c){
	        temp=a;
	        a=c;
	        c=temp;
	    }
	 
	    
	   if(b>c){
	        temp=b;
	        b=c;
	        c=temp;
	    }
		
		return a + " " + b + " " + c; 
		

		
		
	}
	 

}
