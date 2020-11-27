package data.type;

public class Ex03 {
	public static void main(String[] args) {
		//swap 2 values:int
		int a = 10;
		int b = 8;
		swap(a, b); // hoan doi a = 8, b = 10
		System.out.println("a2: "+a);
		System.out.println("b2: "+b);		
	}
	
	private static void swap(int a, int b) {
		int tmp = a; //tmp = 10
		a = b; // a=8
		b = tmp; // b=10
		System.out.println("a1: "+a);
		System.out.println("b1: "+b);		
	}
}