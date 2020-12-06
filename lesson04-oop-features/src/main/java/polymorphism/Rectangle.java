package polymorphism;

public class Rectangle extends Shape{
	
	// method: declaration, definition

	@Override
	void draw() {
		System.out.println("Retangle ====> drawing ....");
	}
	
	void setBackround() {
		System.out.println("Retangle =====> setting backgroud .....");
	}
	

}
