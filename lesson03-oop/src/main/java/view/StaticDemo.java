package view;

public class StaticDemo {
	private String id;
	private String name;
	private static String age;

	public static void main(String[] args) {
		// 1, Teo, 18
		// 2, Nam, 28
		StaticDemo sd1 = new StaticDemo();
		sd1.id = "1";
		sd1.name = "Teo";
		StaticDemo.age = "18";
		System.out.println(sd1);

		StaticDemo sd2 = new StaticDemo();
		sd2.id = "2";
		sd2.name = "Nam";
		StaticDemo.age = "28";
		System.out.println(sd2);

	}
// method, atributes
	//static: class'scope
	//=>construt at the runtime beginning
	
	//non- static: object'scope
	//=> will be construted when object call it
	@Override
	public String toString() {
		return id + ", " + name + ", " + age;
	}

}
