package view;

// 1file java contains multiple types
//types:class, interface, enum but have just one public class = file name

public class Ex02Home {
	public static void main(String[] arg) {
		System.out.println(Ex02Home.class.getSimpleName());
		// new Class()=> Create instance of class
		
	}         
}

class Ex02Sub {
	public static void main(String[] args) {
		System.out.println(Ex02Utils.getCurrentDate());
		System.out.println(Ex02Sub.class.getTypeName());
	}

}