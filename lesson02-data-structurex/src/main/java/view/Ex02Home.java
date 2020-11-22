package view;

// 1 flie java contains multiple types
// types: class, interface, enum
// private: Class scope
// public: everywhere

// static method: ClassName.staticMethod()
//non-static: instance of class could call method
public class Ex02Home {
	public static void main(String[] args) {
		System.out.println(Ex02Home.class.getSimpleName());
		System.out.println(Ex02Utils.getCurrentDate());
		//new class() => create instance
		System.out.println(new Ex02Utils().getCurrentTime());
		
	}
}

class Ex02Sub {
	public static void main(String[] args) {
		System.out.println(Ex02Sub.class.getSimpleName());
	}
}
