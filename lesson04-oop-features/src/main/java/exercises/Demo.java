package exercises;

import functional.iinterface.Condition;

public class Demo {
	public static void main(String[] args) {
		// Give a ONE direction array int 
		// Write method find sum of odd elements
		//                          event
		//							power of 2
		//							prime
		int []a = {1,3,10,8};
		
		System.out.println(Sum(a, e -> e % 2 !=0 ));
		
	}
	
	public static int Sum(int []a, Condition con) {
		int sum = 0;
		for(int element:a) {
			if(con.test(element)) {
				sum+=element;
			}
		}
		return sum;
	}
}


