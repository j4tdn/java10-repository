package iinheritance.java08;

import inheritance.ssuper.role.AbstractEmail;

public class NormalEmail extends AbstractEmail{

	@Override
	public boolean login(String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	protected boolean login2Steps(String username, String password) {
		// TODO Auto-generated method stub
		return super.login2Steps(username, password);
	}
	
}
