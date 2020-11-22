package bean;

public class Point {
	public int x;
	public int y;
	
	// Contructor
	public Point(int xValue, int yValue) {
		x = xValue;
		y = yValue;
	}
	
	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
}
