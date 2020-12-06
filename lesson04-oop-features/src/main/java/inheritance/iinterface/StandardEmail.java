package inheritance.iinterface;

public class StandardEmail  implements Email,Transfer{

	@Override
	public boolean login(String username, String passwork) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void logout() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean send(String content) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
