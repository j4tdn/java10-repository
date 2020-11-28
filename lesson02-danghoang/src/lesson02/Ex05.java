package lesson02;

import java.util.Scanner;

public class Ex05 {
    public static final char CHAR_55 = 55;
 
    
    public static void main(String[] args) {
    	{
    	    Scanner ip = new Scanner(System.in);
    		long rem,i=1,sum=0;
    	    long dec = ip.nextLong();
    	   
    	    do
    	    {
    	        rem=dec%2;
    	        sum=sum + (i*rem);
    	        dec=dec/2;
    	        i=i*10;
    	    }while(dec>0);
    	   System.out.println(sum);;
    	       	 
    	       	}
}
}