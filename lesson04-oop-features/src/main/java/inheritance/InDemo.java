package inheritance;

public class InDemo {
	public static void main(String[] args) {
		Parent p1 = new Sub();
		System.out.println(p1.number);
		System.out.println(p1.text);
		p1.log();
		
	}
}
