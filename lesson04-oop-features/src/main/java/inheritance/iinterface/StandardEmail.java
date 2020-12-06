package inheritance.iinterface;

public class StandardEmail implements Email, Transfer{

	public boolean login(String userName, String password) {
		return false;
	}

	public void logout() {
	}

	public boolean send(String content) {
		return false;
	}
	
}