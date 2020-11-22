package operator;

public class Ex02 {
	public static void main(String[] args) {
		int x = 5, y = 2, z = 3;
		y = y-- + ++x - z++ + ++z;
		System.out.println("x: " + x); // 6
		System.out.println("y: " + y); // 8
		System.out.println("z: " + z); // 5
	}
}
