package immutable.demo;

public class Ex02 {
	public static void main(String[] args) {
		// SGK123, SGK234, STK345, STK456
		String[] books = {"SGK123", "SGK234", "STK345"," STK456"};
		for(String book: books) {
			System.out.println("isTextbook:"+ book.startsWith("SGK"));
		}
		//replace
		String s = "Hello Nam";
		String replace = s.replace("Hello", "Hi");
		System.out.println("s:"+s);
		System.out.println("replace:"+replace);
		
		
		String redundantSpaces = "  cheers     from     Viet   Nam   ";
		// regex: replace 1 or n white spaces to 1 whitespace
		String removed = redundantSpaces.trim().replaceAll("\\s{1,10}", "");
		System.out.println(removed);
		
		String parent = "abcdefgh";
		String child = parent.substring(2);
		
		
		
		
		
	}
	


}
