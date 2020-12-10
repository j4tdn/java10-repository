package structure;

public class Ex02Iterable {
	public static void main(String[] args) {
		// for
		// while
		// do while
		
		// for : already know limitation
		// while & do while : undefined
		
		// do while : ignore first checking
		// while: checking as always
		
		// break, continue
		
		System.out.println(sumFor(10));
		System.out.println(sumWhile(10));
		System.out.println(sumDoWhile(10));
		
		// break: stop and exit the loop
		// continue: ignore below code and continue with the next loop
		
		for (int i = 0; i <= 5; i++) {
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
		for (int i = 1; i < n; i++) {
			result += i;
		}
		return result;
	}
	
	private static int sumWhile(int n) {
		int result = 0;
		n -= 1;
		while (n > 0) {
			result += n;
			n--;
		}
		return result;
	}
	
	private static int sumDoWhile(int n) {
		int result = 0;
		int count = 1;
		do {
			result += count;
			count++;
		} while (n > count);
		return result;
	}

}
