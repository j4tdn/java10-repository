package inheritance.ssuper.role;

public class BusinessEmail extends AbstractEmail implements Transfer {

	@Override
	public boolean send(String content) {
		return false;
	}

	@Override
	public boolean login(String username, String password) {
		return false;
	}
	boolean login2Steps(String username, String password) {
		return false;
	}
}


