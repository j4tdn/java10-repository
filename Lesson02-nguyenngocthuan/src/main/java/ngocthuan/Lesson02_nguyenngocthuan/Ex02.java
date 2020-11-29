package ngocthuan.Lesson02_nguyenngocthuan;

public class Ex02 {
   public static void main(String[] args) {
	 int x =1;
	 int y =1;
	 int m =1;
	 int n =1;
	 
	 for(int i = 1; i <=4; i++) {
		 x *=i; 
	 }
	
	 for(int i = 1; i <=7; i++) {
		 y *=i; 
	 }
	 
	 for(int i = 1; i <=12; i++) {
		 m *=i; 
	 }
	 
	 for(int i = 1; i <= 18 ; i++) {
		 n *=i;
	 }
	 int S = x + y + m + n;
	 System.out.println("S= " + S);
}
}
