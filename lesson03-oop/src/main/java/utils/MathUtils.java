package utils;
/**
 * Utility class support for Math Method
 *
 */
public class MathUtils {
	
	private int globalA;
	private int globalB;
	
	private MathUtils() {
	}
	
	public MathUtils(int globalA, int globalB) {
		this.globalA = globalA;
		this.globalB = globalB;
	}
	
	public int calculate() {
		return globalA + globalB;
	}
	
	// static || non-static
	public static int sum(int a, int b) {
		return a + b;
	}
}
