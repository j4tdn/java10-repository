package inheritance.iinterface;

public class BusinessEmail extends AbstractEmail {

	@Override
	public boolean login(String username, String pasword) {
		
		return false;
	}

}
