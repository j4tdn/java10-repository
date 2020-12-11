package iinheritance.java08;

import inheritance.iinterface.AbstractEmail;

public class NormalEmail extends AbstractEmail {

	@Override
	public boolean login(String username, String pasword) {
		return false;
	}
	@Override
	protected boolean login2Steps(String username, String pasword) {
		return super.login2Steps(username, pasword);
	}
}
