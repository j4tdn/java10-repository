package polymorphism;

public class PoMethod {
	//** 
	// 2 methods in one class could be same name when :
	// + number of parameters
	//====>>> overloading
	
	
	public static int sum(int a , int b) {
		return a + b;
	}
	public static double sum(double a , double b , double c) {
		return a + b +c;
	}
	
	@Override
	public String toString() {
		return "PoMethod";
	}
	
	public static void main(String[] args) {
		System.out.println("sum:" +sum(10, 20));
		PoMethod method = new PoMethod();
		String text = method.toString();
		System.out.println("text:"+text);
	}
}
