package structure;

public class Ex02Iterable {
	public static void main(String[] args) {
		// loop: for, while, do while
		// for: already known limitation 
		// while do while: undefinition
		// do while: ignore first checking
		// while: checking as always
		System.out.println("sumFor: " + sumFor(10)
		             + "\nsumWhile: " +sumWhile(10)
		             +"\nsumDoWhile: " + sumDoWhile(10));
		
		// break, continue
	}
	
	private static int sumFor(int n) {
		int result = 0;
		for (int i = 1; i < n; i++) {
			result  += i;
			
		}
		return result;
	}
	private static int sumWhile(int n) {
		int result = 0;
		while ((n=n-1) >0 ) {
			result +=n;
		}
		
		return result;
	}
	private static int sumDoWhile(int n) {
		int result = 0;
		n -=1;
	    while (n>0) {
			result +=n;
			n--;
		} 
		return result;
	}

}
