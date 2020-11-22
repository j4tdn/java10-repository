package view;

public class Ex02Home {
	public static void main(String[] args) {
		System.out.println(Ex02Home.class.getSimpleName());
		// new Class() => create instance of class
		System.out.println(new Ex02Utils().getCurrentDate());
		
	}
}


class Ex02Sub {
	public static void main(String[] args) {
		System.out.println(Ex02Sub.class.getSimpleName());
	}
}