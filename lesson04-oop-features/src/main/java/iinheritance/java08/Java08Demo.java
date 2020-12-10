package iinheritance.java08;

import inheritance.ssuper.role.AbstractEmail;
import polymorphism.Shape;

public class Java08Demo {
	public static void main(String[] args) {
		// crearte instance of class
		Shape shape = new Shape();
		shape.draw();
		// create instance of abstract class
		// anonysmous inner type
		// class Abstract Email extends AbstractEmail
		AbstractEmail absEmail = new AbstractEmail() {

			@Override
			public boolean login(String username, String password) {
				System.out.println("Hello from Da Nang");
				return false;
			}
		};
		absEmail.login("x", "y");
		AbstractEmail sencond = new AbsEmail();
		sencond.login("x", "y");
	    Father f1 = new Father() {
			
			@Override
			public void adn() {
      System.out.println("==============");				
			}
		};
		f1.adn();
	}
}
