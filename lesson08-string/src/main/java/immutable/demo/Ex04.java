package immutable.demo;

public class Ex04 {
	public static void main(String[] args) {
		String s1 = "ab";
		String s2 = "ab";
		String s3 = "AB";
		System.out.println("==: " + (s1 == s2)); //T
		System.out.println("s1.equals(s2) " + (s1.equals(s2)));//T //equals tra ve T F
		System.out.println("s1.equals(s3) " + (s1.equals(s3)));//F
		System.out.println("s1.equals(s3) " + (s1.equalsIgnoreCase(s3)));//T ko phu thuoc hoa thuong
		System.out.println("s1.compareTo(s2):" + s1.compareTo(s2)); //0
		System.out.println("s1.compareTo(s3):" + s1.compareTo(s3)); // >0
	}
}
