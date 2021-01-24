package view;

public class Ex02Home {
	public static void main(String[] args) {
		System.out.println(Ex02Home.class.getSimpleName());
		//System.out.println(Ex02Utils.getCurrentDay());
		// new Class() => thể hiện của class (create instance of class)
		System.out.println(Ex02Utils.getCurrentTime());
	}
}

class Ex02Sub {
	public static void main(String[] args) {
		System.out.println(Ex02Sub.class.getSimpleName());
	}
}