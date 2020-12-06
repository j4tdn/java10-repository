package utils;
/*
 * 
 * 
 */


public class MathUtils {
	
//	private MathUtils() {
//		
//	}
	private int globalA;
	private int globalB;
	
	public MathUtils(int globalA,int globalB) {
		this.globalA = globalA;
		this.globalB = globalB;
	}
	
	public int calculate() {
		return globalA + globalB;
	}
	
	public static int sum(int a,int b) {
		return a+b;
	} 

}
