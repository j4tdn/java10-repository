package structure;

public class Ex02Iterable {
	//loop: for, while, do while
	//for: already known limitation
	//while do while: undefined
	//do while: ignore the first checking
	//while: checking as always
	//break, continue: used in for, while, do while
	//break: switch case
	//break: pause and exit the loop
	//continue: ignore the code in if's curly braces
	
	public static void main(String[] args) {
		System.out.println(sumFor(10));
		System.out.println(sumWhile(10));
		System.out.println(sumDoWhile(10));
		
		for (int i = 1; i <= 5; i++) {
			if (i == 3) {
				continue;
			}
			if (i == 4) {
				break;
			}
			System.out.println("i: " + i);
		}
	}
	private static int sumFor(int n) {
		int result = 0;
		for (int i = 0; i < n; i++) {
			result += i;
		}
		return result;
	}
	private static int sumWhile(int n) {
		int result = 0;
		n -= 1;
		while(n > 0) {
			result += n;
			n--;
		}
		return result;
	}
	private static int sumDoWhile(int n) {
		int result = 0;
		n -= 1;
		do {
			result += n;
			n--;
		}while(n > 0);
		return result;
	}
	

}
