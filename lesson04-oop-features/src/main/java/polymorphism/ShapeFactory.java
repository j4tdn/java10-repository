package polymorphism;

/**
 * Factory shape.
 * Place to construct shape object
 *
 */
public class ShapeFactory {
	public enum ShapeType{
		RECT, SQUARE
	}
	
	
	public static Shape createShape(ShapeType shape) {
		Shape result = null;
		switch (shape) {
		
		case RECT:
			result = new Rectangle();
			break;
		case SQUARE:
			result = new Square();
			break;
		default:
			result = new Shape();
		}
		return result;
	}
}
