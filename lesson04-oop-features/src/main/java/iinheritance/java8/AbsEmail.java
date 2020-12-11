package iinheritance.java8;

import inheritance.ssuper.role.AbstractEmail;

public class AbsEmail extends AbstractEmail {

	@Override
	public boolean login(String username, String password) {
		System.out.println("Abs Email");
		return false;
	}

}
