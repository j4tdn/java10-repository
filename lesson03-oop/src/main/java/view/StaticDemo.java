package view;

public class StaticDemo {
	private String id;
	private String name;
	private static int age;
	
	public static void main(String[] args) {
		// 01, TNT, 20
		// 02, Nam, 25
		StaticDemo sd1 = new StaticDemo();
		sd1.id = "01";
		sd1.name = "TNT";
		StaticDemo.age = 20;
		System.out.println(sd1);
		
		StaticDemo sd2 = new StaticDemo();
		sd2.id = "02";
		sd2.name = "Nam";
		StaticDemo.age = 25;
		
		
		System.out.println(sd2);
	}
	
	// methods, attributes	
	// static: class'scope
	// => construct at the runtime beginning
	
	// non-static: object'scope
	// =>  will be constructed when object calls
	@Override
	public String toString() {
		
		return id + "," + name + "," + age;
	}
}
