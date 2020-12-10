package iinheritance.java08;

import inheritance.ssuper.role.AbsEmail;
import inheritance.ssuper.role.AbstractEmail;
import polymorphism.Shape;

public class Java08Demo {
	public static void main(String[] args) {
		// create instance of class
		Shape shape = new Shape();
		shape.draw();

		// create instance of abstract class
		// anonymous inner type
		// class AbsEmail extends AbstractEmail
		AbstractEmail absEmail = new AbstractEmail() {

			@Override
			public boolean login(String username, String password) {
				System.out.println("hello from da nang");
				return false;
			}
		};
		absEmail.login("x", "y");

		AbstractEmail secondEmail = new AbsEmail();
		secondEmail.login("x", "Y");
		
		Father f1 = new Father() {
			
			@Override
			public void adn() {
				System.out.println("=========");
				
			}
		};
		f1.adn();
	}

}
