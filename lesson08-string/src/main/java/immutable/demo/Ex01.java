package immutable.demo;

public class Ex01 {
/**
 * tinh chieu dai chuoi
 * noi chuoi
 * lay ki tu tai 1 vi tri bat ki trong chuoi
 * duyet tung phan tu trong chuoi
 * 
 */
	public static void main(String[] args) {
		String s= "welcome";
		System.out.println("length:" + s.length());
		
		// noi chuoi
		String s1 = s + "to Java10";
		System.out.println("s1: " +s);
		//c2
		String s2=s.concat("to Java01");
		System.out.println("s2: " + s2);
		
		// lay ki tu tai index 3
		
		System.out.println("index3:  " + s.charAt(3));
		
		// duyet tung phan tu trong chuoi
		System.out.println("=== Iterating ====== " );
		for(int i= 0; i< s.length(); i++) {
			System.out.println(s.charAt(i)+ "");
		}
		System.out.println();
		// vi tri xuat hiendau tien cua "e" trong chuoi
		System.out.println("start e:" + s.indexOf("e"));
		System.out.println("start l" +s.indexOf("l"));
		System.out.println("last" + s.indexOf("e"));
		
		
		
	}
}
