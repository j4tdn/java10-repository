package polymorphism;

/**
 * Factory shape. Place to construct shape object.
 *
 */
public class ShapeFactory {

	private enum ShapeType {
		RECT, SQUARE
	}

	public static Shape createRectShape() {
		return createShape(ShapeType.RECT);
	}

	//
	public static Shape createSquareShape() {
		return createShape(ShapeType.SQUARE);
	}

	private static Shape createShape(ShapeType shape) {
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
			break;
		}
		return result;

	}

}
