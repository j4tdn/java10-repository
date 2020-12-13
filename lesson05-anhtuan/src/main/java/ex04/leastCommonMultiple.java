package ex04;

public class leastCommonMultiple {
	public static void main(String[] args) {
		int [] a = { 1,9,5,15};
		leastCommonMultiple_Arr(a);
		
	}
	public static int GCM(int a, int b) {
	    if (b == 0) return a;
	    return GCM(b, a % b);
	}

	public static int LCM(int a, int b) {
	    return (a * b) / GCM(a, b);
	}
	public static void leastCommonMultiple_Arr(int a[]){
	    int temp = LCM(a[0], a[1] );
	    for(int i=2;i<a.length;i++){
	        temp = LCM(temp, a[i]);    
	    }
	    System.out.println(temp);
	}

}
