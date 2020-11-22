package structure;

public class Ex02Iterable {
	public static void main(String[] args) {
		// loop: for, while, do while
		// for: already know limitation
		// while, do while: undefined
		// do while: ignore first checking
		// while: checking
		System.out
				.println("sumfor: " + sumFor(10) + "\nsumwhile: " + sumWhile(10) + "\nsumdowhile: " + sumDoWhile(10));
		
		// break, continue: used in for, while, do while
		// break: switch case
		// break: pause and exit the LOOP
		// continue: ignore the below code and continue with next loop
		
		for(int i=1;i<=5;i++) {
			if(i==4) {
				continue;
			}
			if(i==3) {
				break;
			}
			System.out.println("i: "+i);
		}
		System.out.println("Come here!!!");
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

	private static int sumWhile2(int n) {
		int result = 0;
		int i = 0;
		while (i < n) {
			result += i;
			i++;
		}
		return result;
	}

	private static int sumDoWhile(int n) {
		int result = 0;
		int i = 1;
		do {
			result += i;
			i++;
		} while (i < n);
		return result;
	}
}
