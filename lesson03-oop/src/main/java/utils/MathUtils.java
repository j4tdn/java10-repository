package utils;

public class MathUtils {
	private int globalA;
	private int globalB;
	public MathUtils(int globalA, int globalB) {
		this.globalA = globalA;
		this.globalB = globalB;
		
		
	}
	public int calculate() {
		return globalA + globalB;
	}
	//static | non-static
	//public static int sum1 (int a ,int b) {
	//return a +b ;
	//}
	public static int sum(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}

}
