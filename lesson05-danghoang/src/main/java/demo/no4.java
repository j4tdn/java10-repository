package java10.lesson05_danghoang;

public class no4 {

	 public static void main(String[] args) {
			
	    	
	    	int[] arr1 = new int[] { 3, 2, 1, 6, 5 };
	    	int[] arr2 = new int[] {3, 7, 9, 2, 1, 6, 5, 4, 10};
			
	               System.out.println(getLeastCommonMultiple(arr1));
	               System.out.println(getLeastCommonMultiple(arr2));
	               
		}
	
	public static int getLeastCommonMultiple(int[] arr){
        int lcm = 1;
        int n =  arr.length;
        int divisor = 2;
        while (true){
            int count = 0; 
            boolean divisible = false;
            for (int i = 0; i < n; i++){ 
                if (arr[i] == 0) { 
                    return 0; 
                } 
                else if (arr[i] < 0) { 
                    arr[i] = arr[i] * (-1); 
                } 
                if (arr[i] == 1) { 
                    count++; 
                }
                if (arr[i] % divisor == 0) { 
                    divisible = true; 
                    arr[i] = arr[i] / divisor; 
                } 
            }
            if (divisible) { 
                lcm = lcm * divisor; 
            } 
            else { 
                divisor++; 
            } 
  
            if (count == n) { 
                return lcm; 
            } 
             
        }
    }
}