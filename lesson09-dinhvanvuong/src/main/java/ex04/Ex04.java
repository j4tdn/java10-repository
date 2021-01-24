package ex04;


public class Ex04 {
	public static void main(String[] args) {
		String redundantSpaces = "    Welcome  toJAVA10  class";
		String removed = redundantSpaces.trim().replaceAll("\\s{1,}"," ");
		System.out.println(removed);
		
		StringBuffer reverse = new StringBuffer(redundantSpaces);
		reverse.reverse().toString();
		System.out.println("String before reverse: " + reverse);
		
	}
}

	

   

