package polymorphism.method;

public class PolymorphismMethod {
	/**
	 * 
	 * 2 method in ONE CLASS could be same name when different:
	 *  + number of parameter
	 *  + parameter type
	 *  =>> Overloading
	 */
	
	public static int sum(int a, int b) {
		return a + b;
	}
	
	public static double sum(double a, double b) {
		return a + b;
	}
	
	public static int sum(int a, int b, int c) {
		return a + b + c;
	}
	
	@Override	// Annotation
	public String toString() {
		return "Polymorphism Method";
	}
	
	public static void main(String[] args) {
		System.out.println(sum(3, 5));
		System.out.println(sum(4.5, 5.55));
		System.out.println(sum(1, 2, 3));
		
		PolymorphismMethod method = new PolymorphismMethod();
		String text = method.toString();
		System.out.println(text);
	}
}
