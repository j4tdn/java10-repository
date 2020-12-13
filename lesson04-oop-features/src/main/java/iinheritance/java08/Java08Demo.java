package iinheritance.java08;

import inheritance.ssuper.role.AbstractEmail;
import polymorphism.Shape;

public class Java08Demo {
	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.draw();

		// create instance of abstract
		AbstractEmail absEmail = new AbstractEmail() {

			@Override
			public boolean login(String username, String password) {
				System.out.println("Hello Đà Nẵng");
				return false;
			}
		};
		absEmail.login("x", "y");

		AbstractEmail secondEmail = new AbsEmail();
		secondEmail.login("x", "y");
		
		Father f1 = new Father() {
			
			@Override
			public void adn() {
				System.out.println("===========");
			}
		};
	}
}
