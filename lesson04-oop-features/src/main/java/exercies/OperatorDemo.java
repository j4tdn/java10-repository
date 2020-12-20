package exercies;

public class OperatorDemo {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		int sum = operate(a, b, (x, y) -> x + y);
		int sub = operate(a, b, (x, y) -> x - y);
		int mul = operate(a, b, (x, y) -> x * y);
		int div = operate(a, b, (x, y) -> x / y);

		System.out.println(sum + ", " + sub + ", " + mul + ", " + div);
	}

	private static int operate(int a, int b, Operator operator) {

		return operator.perform(a, b);
	}
}
