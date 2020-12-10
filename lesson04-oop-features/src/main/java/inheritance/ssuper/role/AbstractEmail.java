package inheritance.ssuper.role;
/**
 * Abstract class contain
 * normal methods
 * abstract methods: no definition
 */
public abstract class AbstractEmail {
	public abstract boolean login(String username, String password);
		
	
	protected boolean login2Step(String username, String password) {
		return false;
	}
}
