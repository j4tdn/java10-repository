package polymorphism;

/**
 * Factory shape
 * Place to construct shape object 
 *
 *
 */

public class ShapeFactory {
	//fields part
	private enum ShapeType {
		RECT, SQUARE
	}
	
	//constructor for RECT Shape via createShape() instance
	public static Shape createRectShape() {
		return createShape(ShapeType.RECT);
	}
	//constructor for SQUARE Shape via createShape() instance
	public static Shape createSquareShape() {
		return createShape(ShapeType.SQUARE);
	}
	
	// it is indeed Shape Factory since it creates Rectangle, Square and Shape
	// just in this instance
	private static Shape createShape(ShapeType shape) {
		Shape result = null;
		switch (shape) {
		case RECT:
			result = new Rectangle();
			break;
		case SQUARE:
			result = new Square();
		default:
			result = new Shape();
		}
		return result;
	}
}
