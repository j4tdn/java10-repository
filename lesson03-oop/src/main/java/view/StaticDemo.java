package view;

public class StaticDemo {
	private String id;
	private String name;
	private static int age;
	
	public static void main(String[] args) {
		// 1, Teo, 21
		// 2, Nam, 28
		StaticDemo sd1 = new StaticDemo();
		sd1.id = "1";
		sd1.name = "Teo";
		age = 21;
		
		StaticDemo sd2 = new StaticDemo();
		sd2.id = "2";
		sd2.name = "Nam";
		age = 28;
		
		System.out.println(sd1);
		System.out.println(sd2);
	}
	
	// methods, attributes
	// static: class' scope
	// => construct at the runtime beginning
	
	// non-static: object' scope
	// => will be construct when object calls
	
	@Override
	public String toString() {
		return id + ", " + name + ", " + age;
	}
}
