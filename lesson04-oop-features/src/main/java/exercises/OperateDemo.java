package exercises;

public class OperateDemo {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		// operate
		// int sum = operate(a, b, new Operator() {

		// @Override
		// public int peform(int a, int b) {
		// return a / b;

		// }
		// });
		// System.out.println("result:" + sum);
		
		 System.out.println("result:" +  operate(a,b, (x,y) -> x*y));
		
	}

	private static int operate(int a, int b, Operator operator) {
		return operator.peform(a, b);
	}

}
