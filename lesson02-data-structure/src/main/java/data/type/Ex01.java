package data.type;

public class Ex01 {
	public static void main (String[] args) {
		//primitive type
		int i1 = 10;
		char c1 = 'c';
		long l1 = 100;
		float f1 = 10.7f;
		double d1 = 8.6d;
		
		System.out.println("Số nguyên: " + i1);

		//object type
		//method, variable name: English
		Integer number = 10;
		//Cannot do this towards primitive type
		number = null;
		Integer oddNumber = 7;
		String studentName = "Le Van Anh";
		System.out.println("Integer: " + number);
	}
}
