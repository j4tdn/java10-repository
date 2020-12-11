package iinheritance.java08;

import inheritance.iinterface.AbstractEmail;

public class AbsEmail extends AbstractEmail {

	@Override
	public boolean login(String username, String pasword) {
		System.out.println("Cheers from Da Nang");
		return false;
	}

}
