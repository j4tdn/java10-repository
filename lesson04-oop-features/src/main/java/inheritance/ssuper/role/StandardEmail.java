package inheritance.ssuper.role;

public class StandardEmail extends AbstractEmail implements Transfer {


	public boolean send(String content) {
		return false;
	}

	@Override
	public boolean login(String username, String password) {
		return false;
	}

}
