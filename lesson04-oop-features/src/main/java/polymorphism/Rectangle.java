package polymorphism;

public class Rectangle extends Shape {

	// method: declaration, definition
	@Override
	void draw() {

		System.out.println("Retangcle =====> drawing....");
	}

	void setBackground() {
		System.out.println("Rectangle =======> Setting background....");
	}
}
