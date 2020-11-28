package lesson02;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 4;
		int b = 7;
		int c = 12;
		int d = 18;
		System.out.println("Max : " + (Factorial(a)+Factorial(b)+Factorial(c)+Factorial(d)));
		
		
		System.out.println("Max : " + (Factorial2(a)+Factorial2(b)+Factorial2(c)+Factorial2(d)));

	}

	private static long Factorial(int n) {
		long giaiThua = 1;
		if (n == 0 || n == 1) {
			return giaiThua;

		} else {
			for (int i = 2; i <= n; i++) {
				giaiThua *= i;

			}
			return giaiThua;
		}
	}
	private static long Factorial2(int n) {
		if(n>0) {
			return n * Factorial2(n - 1);
			
		}
		else {
			return 1;
		}
	}

}
