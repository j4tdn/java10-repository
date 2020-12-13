package polymorphism;

public class Rectangle extends Shape {

	@Override
	public void draw() {
		System.out.println("Rectangle =====> drawing...");
	}
	
	void setBackground() {
		System.out.println("Rectangle ====> setting background...");
	}
}
