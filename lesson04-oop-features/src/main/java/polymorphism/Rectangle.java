package polymorphism;

public class Rectangle extends Shape {
// declaration, definition;
	@Override
	void draw() {
		System.out.println("rectangle ===> drawing.....");
	}

	void setBackground() {
		System.out.println("rectangle ====> setting background....");
	}
}
