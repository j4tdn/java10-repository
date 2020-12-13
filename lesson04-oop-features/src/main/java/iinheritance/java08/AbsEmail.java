package iinheritance.java08;

import inheritance.ssuper.role.AbstractEmail;

public class AbsEmail extends AbstractEmail {

	@Override
	public boolean login(String username, String password) {
		System.out.println("Cheers to Da Nang");
		return false;
	}
	
}
