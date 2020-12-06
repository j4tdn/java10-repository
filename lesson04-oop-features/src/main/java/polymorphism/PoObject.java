package polymorphism;

public class PoObject {
	public static void main(String[] args) {
		Shape poR1 = ShapeFactory.createRectShape();
		poR1.draw();
		Shape poSqu1 = ShapeFactory.createSquareShape();

		poSqu1.draw();
		System.out.println("===============");
		Shape sh1 = new Shape();
		sh1.draw();
		Rectangle r1 = new Rectangle();
		r1.draw();
		Square sq1 = new Square();
		sq1.draw();
	}
}
