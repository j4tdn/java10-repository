package ex01;

public class Circle {
	private int x;
	private int y;
	private int R;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getR() {
		return R;
	}

	public void setR(int r) {
		R = r;
	}

	public String toString() {
		return "O (" + x + y + ") , " + R;
	}

}
