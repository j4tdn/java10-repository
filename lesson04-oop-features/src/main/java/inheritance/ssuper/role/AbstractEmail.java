package inheritance.ssuper.role;
/**
 * Abstract class 
 * normal method
 * abstract methods
  */
public abstract class AbstractEmail {
	public abstract boolean login(String username, String password);
		
	
	protected boolean login2Steps(String username, String password) {
		return false;
	}
}

