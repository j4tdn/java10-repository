package data.type;

public class Ex04 {

	public static void main(String[] args) {
		Integer a=10;
		Integer b = 20;
		hash("Origin A Hash: ",a);
		hash("Origin B Hash: ",b);
		swap(a,b);
		hash("After swap A Hash: ",a);
		hash("Origin swap B Hash: ",b);
		System.out.println("Main A:" +a);
		System.out.println("Main B:" +b);
		// Integer, String, Float: Kieu du lieu bat bien
		Integer origin = new Integer(55);
		Integer assign = new Integer(55);
		hash("origin 1: ", origin);
		hash("assign 1: ", assign);
		origin =66;
		hash("origin 2: ", origin);
		System.out.println("origin " + origin);
	}
	private static void swap(Integer a, Integer b) {
		Integer tmp= new Integer(a);
		 a=b;
		 b=tmp;
			System.out.println("Swap A:" +a);
			System.out.println("Swap B:" +b);
	}
	private static void hash(String text, Integer input) {
		System.out.println(text+ ": " + System.identityHashCode(input));
		
	}
}
