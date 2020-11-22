package bean;

public class Point {
	public int x;
	public int y;

	// Constructor
	public Point(int xValue, int yValue) {
		x = xValue;
		y = yValue;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(" + x + "," + y + ")";
	}
}
