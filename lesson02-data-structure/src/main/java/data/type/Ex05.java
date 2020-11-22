package data.type;
 import bean.HandInteger;
 
public class Ex05 {
   public static void main(String[] args) {
	HandInteger a = new HandInteger(10);
	HandInteger b = new HandInteger(20);
	
	swap(a,b);
	System.out.println("main a: " + a);
	System.out.println("main b: " + b);
}
   private static void swap(HandInteger a, HandInteger b) {
		int tmp = a.value;
		a.value = b.value;
		b.value = tmp;
		System.out.println(" swap a:" + a);
		System.out.println("swap b:" + b);
	}

}
