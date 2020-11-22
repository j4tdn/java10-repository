package view;

public class Ex02Home {
	public static void main(String[] args) {
		//lay lop Ex02 len
		// none-static method: instance of class could call method . ham thua ke cua lass kia phai goi new Class().Method 
		System.out.println(Ex02Home.class.getSimpleName());	
		System.out.println(Ex02Utils.getCurrentTime());
	}
}
class Ex02Sub {
	public static void main(String[] args) {
	System.out.println(Ex02Sub.class.getSimpleName());	
	}
}
