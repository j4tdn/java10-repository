package exercises;

public class OperatorDemo {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		// operate
		int mul = operate(a, b, (x,y) -> x*y);
		System.out.println("result: " + mul);
	}

	private static int operate(int a, int b, Operator operator) {
		return operator.strategy(a, b);
	}
}
