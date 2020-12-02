package exercise01;

//Bài 1: Nhập vào tâm và bán kính của một đường tròn. 
//Sau đó nhập vào một điểm A(x, y) bất
//kì và kiểm tra xem A có thuộc đường tròn không ?

public class Exercise01 {
	public static void main(String[] args) {
		Point O = new Point();
		Point A = new Point(4, 7);
		Point B = new Point(0, 7);
		Point C = new Point(0,5);
		int R = 7 ;
		EnumPoint caseA = printLocation(A.distance(O, A), R);
		EnumPoint caseB = printLocation(B.distance(O, B), R);
		EnumPoint caseC = printLocation(C.distance(O, C), R);
		
		System.out.println(caseA.getValue());
		System.out.println(caseB.getValue());
		System.out.println(caseC.getValue());
	}
	
	public static EnumPoint printLocation(double distance, int R) {
		if(distance == R) {
			return EnumPoint.ONSIDE;
		}
		if(distance < R) {
			return EnumPoint.INSIDE;
		}
		return EnumPoint.OUTSIDE;
	}
}
