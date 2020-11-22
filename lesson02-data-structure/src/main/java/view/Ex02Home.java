package view;
//1 file java contains multiple types
//types: class , interface,enum
public class Ex02Home {
	public static void main(String[] args) {
		System.out.println(Ex02Home.class.getSimpleName());
		System.out.println(Ex02Utils.getCurrentDate());
		//new Class() => create instance of Class
		System.out.println(Ex02Utils.getCurrentTime());
		
	}
}
class Ex02Sub {
	public static void main(String[] args) {
		System.out.println(Ex02Sub.class.getSimpleName());
	}	
}
