package data.type;

public class Ex03 {
    public static void main(String[] args) {
		//swap
    	int a=10;
    	int b=8;
    	swap(a, b);
    	System.out.println("a: " +a);
    	System.out.println("b: " +b);
    	
	}
	public static void swap(int a, int b) {
	int tmp = a; //tmp =10
	a = b; // a = 8; b = 8
	b= tmp;
	System.out.println("a1: " +a);
	System.out.println("b1: " +b);
	}
		
	

}
