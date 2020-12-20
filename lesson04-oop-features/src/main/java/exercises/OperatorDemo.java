package exercises;

public class OperatorDemo {
	public static void main(String[] args) {
		int a = 10; 
		int b = 5;
		
		int sum = operator(a, b, new Operator() {
			@Override
			public int perform(int x, int y) {
				return x + y;
			}
		});
		System.out.println("Sum: " + sum);
		
		int mul = operator(a, b, (x,y) -> x  * y);
		System.out.println("Mul: " + mul);
	}
	
	private static int operator(int a, int b, Operator operator) {
		return operator.perform(a, b);
	}
}
