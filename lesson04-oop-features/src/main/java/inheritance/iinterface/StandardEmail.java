package inheritance.iinterface;

public class StandardEmail implements Email, Transfer{

	@Override
	public boolean logIn(String user, String password) {
		return false;
	}

	@Override
	public void logOut() {
		
	}

	@Override
	public boolean send(String content) {
		return false;
	}
}