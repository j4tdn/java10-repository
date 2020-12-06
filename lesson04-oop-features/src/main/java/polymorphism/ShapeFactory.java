package polymorphism;

/**
 * Factory shape. Place to construct shape object...
 *
 */
public class ShapeFactory {

	private enum Shaptype {
		RECT, SQUARE
	}

	public static Shape createRectShape() {
		return createShape(Shaptype.RECT);
	}

	public static Shape createSquareShape() {
		return createShape(Shaptype.SQUARE);
	}

	private static Shape createShape(Shaptype shape) {
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
