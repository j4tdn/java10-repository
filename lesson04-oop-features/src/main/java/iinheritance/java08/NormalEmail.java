package iinheritance.java08;

import inheritance.ssuper.role.AbstractEmail;

public class NormalEmail extends AbstractEmail {

	@Override
	public boolean login(String username, String password) {
		return false;
	}
	protected boolean login2Step(String username, String password) {
		return false;
	}

	
}
