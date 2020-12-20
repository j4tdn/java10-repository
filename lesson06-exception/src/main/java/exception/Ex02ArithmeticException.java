package exception;

public class Ex02ArithmeticException {
	public static void main(String[] args) {
		int result = 0;
		try {
			result = divide(5, 0);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} 
		System.out.println(result);
	}
	
	// try catch
	// throw >> throws
	private static int divide(int a, int b) throws Exception {
		if (b == 0) {
			throw new Exception();
		}
		return a / b;
	}
}