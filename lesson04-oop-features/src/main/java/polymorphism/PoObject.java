package polymorphism;

import polymorphism.ShapeFactory.ShapeType;

public class PoObject {
	public static void main(String[] args) {
		
	Shape poR1 = ShapeFactory.createShape(ShapeType.RECT);
	poR1.draw();
		
		
	
	
	
		Shape poSq1 = new Square();
		poSq1.draw();
		
		
		System.out.println("==============");
		 Shape s1 = new Shape();
		 s1.draw();
		 
		 Rectangle r1 = new Rectangle();
		 r1.draw();
		 
		 Square sq1 = new Square();
		 sq1.draw();
	}
}
