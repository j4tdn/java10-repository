package tranlehuuphuc;

public class Ex01 {
	public static void main(String[] args) {
		SingleLineCharacters();
		OneFromOneLine();
		ReverseTheChain();
		}
		public static String SingleLineCharacters() {
			String n = "VIET CHUONG TRINH";
			for( int i = 0; i < n.length(); i++) {
				char characters = n.charAt(i);
				System.out.println(characters);
			}
			return n;
		} 
		public static String OneFromOneLine() {
			System.out.println("=======================================");
			String n ="KIEM TRA MOT CHUOI";
			for(int i = 0; i <n.length();i++) {
				char word = n.charAt(i);
				if(Character.isSpace(word)) {
					System.out.println();
				}else {
					System.out.print(word);
				}
			}
			return n;
		}
		public static String ReverseTheChain() {
			System.out.println("\n=======================================");
			String n = "KY TU NHAP TU BAN PHIM";
		      String reverse = new StringBuffer(n).
		      reverse().toString();
		      System.out.println("before reversing: "+n);
		      System.out.println("after reversing: "+reverse);
			return reverse;
		}
}
