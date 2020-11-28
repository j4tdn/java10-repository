package lesson02_excercise;

public class Bai2_SumFactorial {
	public static void main(String[] args) {
	long SumFactorial = Factorial(4) + Factorial(7) + Factorial(12) + Factorial(18);
	System.out.println("4! + 7! + 12! + 18! = " +SumFactorial);
		}
	public static long Factorial(int n) {
		if( n == 0 || n == 1) {
			return 1;
		}
		 return n * Factorial( n - 1);
	}
}

