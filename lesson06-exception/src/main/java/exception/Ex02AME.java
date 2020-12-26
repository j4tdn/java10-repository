package exception;

public class Ex02AME {
	public static void main(String[] args) {
		int result = 0;
		try {
			result = divide(10, 0);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("result: " + result);
	}

	// try catch
	// throw >> throws <<
	// throws RuntimeException => redundant (thừa)
	// throws CompileException
	private static int divide(int a, int b) throws ArithmeticException {
		if(b == 0) {
			throw new ArithmeticException();
		}
		return a / b;
	}
}
