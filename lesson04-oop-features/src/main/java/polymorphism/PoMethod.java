package polymorphism;

public class PoMethod {
	
	/* Phương thức đa hình
	 * 2 methods IN ONE CLASS could be same name when different:
	 * + number of parameters
	 * + parameters type
	 * -> Overloading
	 */
	
	public static int sum(int a, int b) {
		return a + b;
	}
	
	public static int sum(int a, int b, int c) {
		return a + b + c;
	}
	
	@Override
	public String toString() {
		return "PoMethod";
	}
	
	public static void main(String[] args) {
		System.out.println("sum: " + sum(10, 20));
		PoMethod method = new PoMethod();
		String text = method.toString();
		System.out.println("text: " + text);
	}
}
