package immutable.demo;

public class Ex01 {
	public static void main(String[] args) {
		String s = "welcome";
				System.out.println("lenght:" + s.length());
				System.out.println("");
				
		// noi chuoi
			String s1 =   s + "to java10";
			System.out.println("s1: "+s1);
			String s2 = s.concat("to java10");
			System.out.println("s2: " + s2);
			
			// lay ki tu tai index 3 
			System.out.println("index 3: " + s.charAt(3));
			
			System.out.println("==== Iterating====");
			for(int i = 0 ; i < s.length();i++){
				System.out.println(s.charAt(i)+"");
			}
			System.out.println();
			
			// vị trí xuất hiện đầu tiên của "e" trong s
			// wellcome 
			System.out.println("index start e:"+ s.indexOf("e"));// 1
			System.out.println("index start l:"+ s.indexOf("l"));// 2 
			System.out.println("last start e :"+ s.lastIndexOf("e"));// 6
			System.out.println("index start j:"+ s.indexOf("j"));//-1
			
			System.out.println("s1" + s1);
			System.out.println("contains: " + s1.indexOf("to"));
						}

}
