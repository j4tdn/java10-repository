package inheritance.ssuper.role;

public class BusinessEmail extends AbstractEmail implements Transfer {

	@Override
	public boolean send(String content) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean login(String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected boolean login2Steps(String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}
}
