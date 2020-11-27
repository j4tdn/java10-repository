package view;

// 1 file java contains multiple types, chi co 1 public class
// types: class, interface, enum
public class Ex02Home {
	public static void main(String[] args) {
		System.out.print(Ex02Home.class.getSimpleName());
		// new Class() => create instance of class
		System.out.print(new Ex02Utils().getCurrentTime());
	}
}



class Ex02Sub {
	public static void main(String[] args) {
		System.out.print(Ex02Sub.class.getSimpleName());
	}
}