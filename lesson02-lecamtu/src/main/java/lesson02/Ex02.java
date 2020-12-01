package lesson02;

public class Ex02 {      //bai2
	
	public static void main(String[] args) {
		
			long SumFactorial = Factorial(4) + Factorial(7) + Factorial(12) + Factorial(18);
			System.out.println("4! + 7! + 12! + 18! = " +SumFactorial);
	}
				
			public static long Factorial(int n) {
			
				long a = 1;
				if (n == 0 || n == 1) {
					return a;
				}
				for (int i = 2; i <= n; i++) {
					a *= i;
				}
				return a;
			}
	}


