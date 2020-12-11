package polymorphism;

public class PoObject {
	public static void main(String[] args) {
		
		// Rectangle poR1= (Rectangle) new Shape();
		// rs1.setBackground();
		
		Shape poR1 = ShapeFactory.createRectShape();
		poR1.draw();
		
		Shape poSq1 = ShapeFactory.createSquareShape();
		poSq1.draw();
		
		poR1 = poSq1;
		poSq1 = poR1;
		
		
		System.out.println("==========================");
		Shape sh1 = new Shape();
		sh1.draw();
		
		Rectangle r1 = new Rectangle();
		r1.draw();
		
		Square sq1 = new Square();
		sq1.draw();
		
	}
}
