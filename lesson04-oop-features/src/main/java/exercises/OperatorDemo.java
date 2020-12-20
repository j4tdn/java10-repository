package exercises;

public class OperatorDemo {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		// operate
		
		System.out.println("result sum: " + operate(a, b, (x, y) -> x / y));
	}

	private static int operate(int a, int b, Operator operator) {
		return operator.strategy(a, b);
	}
}
