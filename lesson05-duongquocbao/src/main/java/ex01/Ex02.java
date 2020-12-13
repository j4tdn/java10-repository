package ex01;

	import java.util.Arrays;

	public class Ex02 {
	    public static void main( String args[] ){
	        int A[]={3, 7, 9, 2, 1, 6, 5, 4, 10};
	       Arrays.sort(A);
	        int i=1;
	        while ( i < A.length ) {
	            if ( A[i] - A[i-1] == 1 ){	            	
	            } 
	            else 
	            {
	                System.out.println( "Missing number is: " + ( A[i-1] + 1 ) );	                
	            }
	            i++;
	        }
	    }
	    }
