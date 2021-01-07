package exception;

public class Ex02AME {
	public static void main(String[] args) {

		// bắt lỗi cho mẫu số != 0
		int result = 0;

		try {
			result = divide(10, 0);
		} catch (ArithmeticException e) {
			System.out.println("log: " + e.getMessage());
		}

		System.out.println("result: " + result);
	}

	// try catch
	// throw >> throws <<
	// throws RuntimeException => redundant
	// throws CompileException
	private static int divide(int a, int b) throws ArithmeticException{
		return a / b;
	}
}
