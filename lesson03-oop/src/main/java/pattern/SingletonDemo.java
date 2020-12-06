package pattern;

public class SingletonDemo {
	public static void main(String[] args) {
		SingletonClass s1 = SingletonClass.getInstance();
		s1.setValue("s1 value");
		System.out.println("s1: " + s1.getValue());

		SingletonClass s2 = SingletonClass.getInstance();
		System.out.println("s2: " + s2.getValue());

	}
}
