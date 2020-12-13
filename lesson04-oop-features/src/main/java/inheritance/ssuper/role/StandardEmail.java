package inheritance.ssuper.role;

public class StandardEmail extends AbstractEmail implements Transfer {

	@Override
	public boolean send(String content) {
		return false;
	}

	@Override
	public boolean login(String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}
}
