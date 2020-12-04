package utils;

/**
 * Utility class support for Math method
 *
 */
public class MathUtils {
	private int globalA;
	private int globalB;

	
	public int calculate() {

		return globalA + globalB;
	}

	// static|non static
	public static int sum(int a, int b) {
		return a + b;
	}

}
