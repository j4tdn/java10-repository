package inheritance.iinterface;

public class StandardEmail implements Email, Transfer{

	@Override
	public boolean login(String username, String password) {
		
		return false;
	}

	@Override
	public void logout() {
		
	}
	
	@Override
	public boolean send(String content) {
		return false;
	}
}
