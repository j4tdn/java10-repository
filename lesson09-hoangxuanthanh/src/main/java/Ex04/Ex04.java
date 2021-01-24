package Ex04;

public class Ex04 {
	public static void main(String[] args) {
		String a = Revert("Welcome to JAVA10 class");
		System.out.println(a);
	}
	public static String Dwc(String s) {
		String removed = s.trim().replaceAll("\\s+", " ");
		return removed;
	}
	public static String Revert(String removed) {
	    int i, len = removed.length();
	    StringBuilder dest = new StringBuilder(len);

	    for (i = (len - 1); i >= 0; i--){
	        dest.append(removed.charAt(i));
	    }
	    return dest.toString();
	}
}
