package view;

import java.util.Arrays;

public class Ex02 {
  public static void main(String[] args) {
	int A[] = {1,4,6,7};
	Arrays.sort(A);
	int n=1;
	Object Numbers;
	while (n < A.length) {
		if(A[n] - A[n-1] == 1 );
	else {
		System.out.println("deficient number is " + ( A[n-1] + 1 ));
	}
	  n ++ ;
  }
  }
	
}

