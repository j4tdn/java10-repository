package utils;
/**
 * Utility class supports for mathematics methods
 * @author DELL
 *
 */
public class MathUtils {
	//cannot construct MathUtils objects in heap memory
	//--> avoid being redundant
	
	private MathUtils() {
	  
	}
	 

	public static int sum(int a, int b) {
		return (a + b);
	}

}
