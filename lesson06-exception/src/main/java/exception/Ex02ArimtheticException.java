package exception;

public class Ex02ArimtheticException {
	public static void main(String[] args) {
		try {
			System.out.println(divide(5, 0));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	private static int divide(int a, int b) throws Exception {
		if(b==0) {
			throw new Exception();
		}
		return a / b;
	}
}
