package Ex01;

public class Ex01 {
	public static void main(String[] args) {
		KITUMOTDONG();
		MOITUMOTDONG();
		DAONGUOCCHUOI();
		}
		public static String KITUMOTDONG() {
			String n = "DAI HOC DUY TAN";
			for( int i = 0; i < n.length(); i++) {
				char kitu = n.charAt(i);
				System.out.println(kitu);
			}
			return n;
		} 
		public static String MOITUMOTDONG() {
			System.out.println("==========================================");
			String n ="DAI HOC KIEN TRUC";
			for(int i = 0; i <n.length();i++) {
				char kitu = n.charAt(i);
				if(Character.isSpace(kitu)) {
					System.out.println();
				}else {
					System.out.print(kitu);
				}
			}
			return n;
		}
		public static String DAONGUOCCHUOI() {
			System.out.println("\n========================================");
			String n = "DAI HOC BACH KHOA";
		      String reverse = new StringBuffer(n).
		      reverse().toString();
		      System.out.println("truoc khi dao: "+n);
		      System.out.println("sau khi dao: "+reverse);
			return reverse;
		}
}
