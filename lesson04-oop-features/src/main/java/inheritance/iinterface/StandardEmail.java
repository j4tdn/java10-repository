package inheritance.iinterface;

public class StandardEmail implements Email,Transfer {

	@Override
	public boolean login(String username, String password) {
		return false;
	}
	
	public void logout() {
		
	}

	public boolean send(String content) {
		return false;
	}

}
