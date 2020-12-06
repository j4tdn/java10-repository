package polymorphism;

/**
 * Factory shape. Place to construct shape object.
 *
 */
public class ShapeFactory {

	private enum Shapetype {
		RECT, SQUARE
	}

	public static Shape createRectShape() {
		return createShape(Shapetype.RECT);
	}

	public static Shape createSquareShape() {
		return createShape(Shapetype.SQUARE);
	}

	private static Shape createShape(Shapetype shape) {
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
