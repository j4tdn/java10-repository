package structure;

public class Ex02Iterable {
public static void main(String[] args) {
	// loop: for,while, do while
	// for: already known limitation
	//while do while: undefined
	//do while: ignore first  checking
	//while: checking as always
	
	//break, continue: used in for, while, do while
	//break: switch case
	//break: pause and exist the LOOP
	//continue: ignore the below code and continue next loop
	System.out.println("sumFor: " +sumFor(10)+
			 "\nsumWhile"+ sumWhile(10)+
			 "\nsumDoWhile"+ sumDoWhile(10));
	for (int i=1; i<=5;i++) {
		if(i==4) {
			break;
			//break:println 1,2,3
			//continue:println 1,2,3,5
		}
		
		System.out.println("i: "+i);
	}
}
private static int sumFor(int n) {
	int result=0;  
	for(int i=1;i<n;i++) {
		  result+=i;
	  }
	return result;
}
private static int sumWhile(int n) {
	int result=0;  
     n-=1;
	while(n>0) {
		result+=n;
		n--;
	}
	return result;
}
private static int sumWhile2(int n) {
	int result=0;
	int i=1;
	while(i<n) {
		result+=i;
		i++;
	}
	return result;
}
private static int sumDoWhile(int n) {
	int result=0;
	int i=1;
	do {
		result+=i;
		i++;
	}while(i<n);
	return result;
}
}
