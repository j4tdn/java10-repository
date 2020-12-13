package inheritance.ssupper.role;

public class Sub extends Parent{
	int number = 20;
	String text = "Sub";
	
	@Override
	void log() {
		System.out.println("Sub log");
	}
}
