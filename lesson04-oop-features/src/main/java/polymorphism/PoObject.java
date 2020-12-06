package polymorphism;

public class PoObject {
	public static void main(String[] args) {
		
//		Shape p1 = new Rectangle();
//		p1.clear();
//	
		
		Shape r2 = ShapeFactory.createRectShape();
		r2.draw();
		
		
		Shape sq2 = ShapeFactory.createSquareShape();
		sq2.draw();
		
		// ep kieu duoc (cha ,con)
		
		
		System.out.println("================");
		Shape s1 = new Shape();
		s1.draw();
		
		Rectangle r1 = new Rectangle();
		r1.draw();
		
		Square sq1 = new Square();
		sq1.draw();
		
		
		// khong ep kieu duoc (anh ,em)
		
	}

}
