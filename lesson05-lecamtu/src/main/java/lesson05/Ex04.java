package lesson05;


public class Ex04 {	
	    public static void main(String[] args) {
	        int[] input = {2,3,10};
	        int result = getLeastCommonMultiple(input);
	        System.out.println("BSCNN: " + result);
	        
	    }   
	    
	    private static int getLeastCommonMultiple(int[] a) {
	    	int result = BSCNN(a[0], a[1]);
	    	for(int i = 2; i < a.length; i++) {
	    		result = BSCNN(result, a[i]);
	    	}
	    	return result;
	    }
	    
	    public static int BSCNN(int a, int b) {
	        return (a * b) / USCLN(a, b);
	    }
	    public static int USCLN(int a, int b) {
	        if (b == 0) return a;
	        return USCLN(b, a % b);
	    }
		
}

