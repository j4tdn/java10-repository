package mutable;

public class Ex01 {
	public static void main(String[] args) {
		
		//Immutable : literal,object ==> literal
		
		//mutable versus Immutable
		String s1 = "a";
		hash("s1 hash", s1);
		value("s1 value", s1);
		s1 = s1+"plus";
		hash("s1 hash", s1);
		value("s1 value", s1);
		System.out.println("======================");
		
		//Mutable :String builder, String buffer
		StringBuilder s2 = new StringBuilder("Builder");
		hash("s2 hash", s2);
		value("s2 value", s2);
		s2.append("plus");
		hash("s2 hash", s2);
		value("s2 value", s2);
		// Đảo chuỗi
		s2.reverse();
		// xóa 
		s2.deleteCharAt(0);
		System.out.println("======================");

		StringBuffer s3 = new StringBuffer("Buffer");
		hash("s3 hash", s3);
		value("s3 value", s3);
		s3.append("plus");
		hash("s2 hash", s3);
		value("s2 value", s3);
		
	}
	private static void hash(String name, CharSequence s) {
		System.out.println(name + ":" + System.identityHashCode(s));
	}

	private static void value(String name, CharSequence s) {
		System.out.println(name + ":" + s);
	}
}
