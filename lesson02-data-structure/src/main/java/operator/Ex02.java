package operator;

public class Ex02 {
	public static void main(String[] args) {
		int x = 0, y = 0;
		for (int z = 0; z < 5; z++) {
			if ((++x > 2) && (++y > 2)) {
				x++;
			}
		}
		System.out.println(x);
		System.out.println(y);
	}
}
