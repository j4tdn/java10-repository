package inheritance.iinterface;

public abstract class AbstractEmail {
	public abstract boolean login(String username , String pasword ) ;
	
	protected boolean login2Steps(String username , String pasword ) {
		return false;
	}
}

