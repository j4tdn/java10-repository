package immutable;

public class Ex01 {
	public static void main(String[] args) {
		String o1 = new String ("hello");
		String o2 = new String ("hello");
		String o3 = new String ("Student");
		
		hash("01", o1);
		hash("02", o2);
		hash("03", o3);
		
		//immutable
		o1 = "welcome";
		value("01", o1);
		hash("01", o1);
	}
	private static void hash(String name, String s) {
		System.out.println(name+" : "+ System.identityHashCode(s));
	}
	private static void value(String name, String s) {
		System.out.println(name + ": " + s);
	}
}
