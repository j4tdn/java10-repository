package polymorphism;

public class PoMethod {

	/**
	 * 
	 * 2 method could be same name when different: + number of parameters +
	 * parameters type =>> overloading
	 */

	public static int sum(int a, int b) {
		return a + b;
	}

	public static int sum(int a, int b, int c) {
		return a + b + c;
	}

	public static double sum(double a, double b) {
		return a + b;
	}
	
	@Override
	public String toString() {
		return "PoMethod";
	}

	public static void main(String[] args) {
		System.out.println("sum: " + sum(10, 20));
		PoMethod method = new PoMethod();
		String text = method.toString();
		System.out.println("Text: " + text);
	}
}
