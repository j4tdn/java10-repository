package polymorphism;

public class Rectangle extends Shape{

	// method: declaration, definition
	
	@Override
	public void draw() {
		System.out.println("Rectangle ===> drawing ...");
	}
	
	void setBackground() {
		System.out.println("Rectangle ===> seting background ...");
		
	}
}
