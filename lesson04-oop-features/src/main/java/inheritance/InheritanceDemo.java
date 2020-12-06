package inheritance;

public class InheritanceDemo {
	public static void main(String[] args) {
		Parent p1 = new Sub();
		System.out.println(p1.number);	// Cannot Override attribute
		System.out.println(p1.text);
		p1.log();
	}
}
