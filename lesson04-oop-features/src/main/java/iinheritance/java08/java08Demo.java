package iinheritance.java08;

import inheritance.iinterface.AbstractEmail;
import polymorphism.Shape;

public class java08Demo {
	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.draw();
		
		//create instance of abstract class
		// anonymous inner type > anonymous class
		// class AbsEmail extends AbstractEmail
		AbstractEmail absEmail = new AbstractEmail() {
			
			@Override
			public boolean login(String username, String pasword) {
				System.out.println("Hello from Da Nang");
				return false;
			}
		};
		absEmail.login("x","y");
		
			AbstractEmail secondEmail = new AbsEmail() ;
			secondEmail.login("x", "y");
			
			
			Father f1 = new Father() {
				
				@Override
				public void adn() {
					System.out.println("=============");
					System.out.println("XYZ");
					
				}
			};
			
		f1.adn();
		
	};
			
	}


