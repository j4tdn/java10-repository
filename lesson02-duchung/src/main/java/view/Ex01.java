package view;

public class Ex01 {
 public static void main(String[] args) {
	 acsending(1,5,4);
}   
 private static void acsending (int a, int b, int c) {
	 int temp;
	 if(a>b) {
		 temp=a; a=b;b=temp;
	 }
	 if(a>c) {
		 temp=a; a=c;c=temp;
	 }
	 if(b>c) {
		 temp=b; b=c;c=temp;
	 }
	System.out.println("a= "+a+"\tb="+b+"\tc="+c);
 }
}

