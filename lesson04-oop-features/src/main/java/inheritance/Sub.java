package inheritance;

public class Sub extends Parent {
	int number = 20;
	String text = "sub";
	
	@Override
	void log() {
		System.out.println("sub log!");
	}
}
