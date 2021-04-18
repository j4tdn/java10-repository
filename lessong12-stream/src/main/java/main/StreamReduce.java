package main;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class StreamReduce {
public static void main(String[] args) {
	List<Integer> digits = Arrays.asList(1,2,3);
	// Get Sum
	 OptionalInt optInt= digits.stream() // Stream<Integer>
			.mapToInt(digit -> digit)
			.min();
		
	System.out.println("sum : " + optInt.orElse(0));
	
}
private static int LCM( int a, int b) {
	return a*b/GCD(a,b);
}
private static int GCD( int a, int b) {
	if( a==0)
		return b;
	if( b ==0)
		return a;
	while( a!=b) {
		if(a > b) {
			return a= a-b;
		
		}else {
			b= b-a;
		}
	}
	return a;
}
   
}
