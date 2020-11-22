package structure;

public class Ex02Iterable {
	public static void main(String[] args) {
		//loop: for, while,do while
		//for: already know limitation
		// while do while : undefined
		//do while: ignore first checking
		//while: checking as always
		//break, continue : used in for,while,do while
		//break: Switch case
		//break: pause and exit the loop
		//continue: ignore the below code and continue with next loop
		System.out.println("sumFor: " + sumFor(10));
		System.out.println("sumWhile: " + sumWhile(10));
		System.out.println("sumDoWhile: " + sumDoWhile(10));
//		
//		for (int i=1;i<9;i++) {
//			if (i==4) {
//				continue;
//			}
//			System.out.println("i: " +i);
//		}
		
		for (int i=1;i<9;i++) {
			if (i==4) {
				continue;
			}
			if (i==4) {
				break;
			}
			System.out.println("i: " +i);
		}
		
		
		
		
		
		
		
	}
	private static int sumFor(int n) {
		int result =0;
		for(int i = 1;i<n;i++) {
			result += i;
			
		}
		return result;
		
	}
	private static int sumWhile(int n) {
		int result =0;
		int i =1;
		
		while(i<n) {
			result +=i;
			i++;
		}
		return result;
		
		
		
	}
	
	
	private static int sumDoWhile(int n) {
		int result =0;
		int i =1;
		
		do {
			result +=i;
			i++;
		}while(i<n);
		return result;
	}
	
	

}
