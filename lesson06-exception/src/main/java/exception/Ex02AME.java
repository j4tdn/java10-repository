package exception;

public class Ex02AME {
	public static void main(String[] args) {
		int result = 0;
		try {
			result = divide(10, 0);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
//		int result = divide(10,0);
		// System.out.println(divide(10, 0));
	}

	// try catch
	// throw >>throws <<
	private static int divide(int a, int b) throws Exception {
		if (b == 0) {
			throw new Exception();
		}
		return a / b;
	}

}
