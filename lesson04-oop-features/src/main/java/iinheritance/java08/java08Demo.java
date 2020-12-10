package iinheritance.java08;

import inheritance.ssuper.role.AbstractEmail;
import polymorphism.Shape;

public class java08Demo {
	public static void main(String[] args) {
		// create instance of class
		Shape shape = new Shape();
		shape.draw();

		// create instance of abstract class
		// anonymous inner type >> anonymous
		// class AbsEmail extends AbstractEmail
		AbstractEmail absEmail = new AbstractEmail() {

			@Override
			public boolean login(String username, String password) {
				System.out.println("hello from Da Nang");
				return false;
			}
		};
		absEmail.login("x", "y");

		AbstractEmail secondEmail = new AbsEmail();
		secondEmail.login("x", "y");
		
		Father f1 = new Father() {
			
			@Override
			public void adn() {
				System.out.println("XYZ");
			}
		};
		f1.adn();
	}
}
