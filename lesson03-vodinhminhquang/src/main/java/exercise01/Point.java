package exercise01;

public class Point {
	private int x;
	private int y;
	public Point() {
		
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(" + x + ", " + y + ")";
	}
	
	public double distance(Point O, Point B) {
		return Math.sqrt(Math.pow(B.x - O.x, 2) + Math.pow(B.y - O.y, 2));
	}
}
