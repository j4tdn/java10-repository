package inheritance.iinterface;

public class StandardEmail extends AbstractEmail implements Transfer {

	@Override
	public boolean send(String content) {
		return false;
	}

	@Override
	public boolean login(String username, String pasword) {
		return false;
	}

}
