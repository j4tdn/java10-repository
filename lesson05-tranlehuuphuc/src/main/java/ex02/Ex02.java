package ex02;

import java.util.Arrays;

public class Ex02 {
    public static void main( String args[] )
    {
        int A[]={1,3,4,5};
        Arrays.sort(A);
        int i=1;
        while ( i < A.length ) 
        {
            if ( A[i] - A[i-1] == 1 ){
            	
            } 
            else 
            {
                System.out.println( "Missing number: " + ( A[i-1] + 1 ) );
            }
            i++;
        }
    }
    }