package iinheritance.java8;

import inheritance.ssuper.role.AbstractEmail;
import polymorphism.object.Shape;

public class Java8Demo {
	public static void main(String[] args) {
		// create instance of class
		Shape shape = new Shape();
		shape.draw();
		
		// create instance of abstract class
		// anonymous inner type >> anonymous class
		AbstractEmail absEmail = new AbstractEmail() {
			
			@Override
			public boolean login(String username, String password) {
				System.out.println("Hello");
				return false;
			}
		};
		absEmail.login("admin", "123");
		
		AbstractEmail absEmail2 = new AbsEmail();
		absEmail2.login("x", "y");
		
		Father f1 = new Father() {
			
			@Override
			public void adn() {
				System.out.println("XYZ");
			}
		};
		f1.adn();
	}
}
