package data.type;

public class Ex02 {
 public static void main(String[] args) {
	 char c='6';
	//write method whether charter is a digit?
	 System.out.println("IsDigit: "+ isDigit(c));
	// System.out.println("IsDigit: "+(c>='0'&&c<='9'));
	 System.out.println("IsDigit: " +Character.isDigit('6'));
	 System.out.println("====================");
	 System.out.println("is Number: " +isNumber("1x23"));
}
 private static boolean isDigit(char c) {
	 // hoac return c>=0&&c<=9;
	 if(c>=0&&c<=9) {
		 return true;
	 }
	 else {
		 return false;
	 }
 }
 private static boolean isNumber(String input) {
	 for (int i=0;i<input.length();i++) {
		 char c= input.charAt(i);
		 if(!Character.isDigit(c)) 
			 return false;
		 }
		 return true;
	 }
 }
