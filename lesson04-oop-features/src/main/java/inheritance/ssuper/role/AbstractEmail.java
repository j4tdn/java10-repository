package inheritance.ssuper.role;

/**
 * 
 * Abstract class contains:
 * 
 * + normal methods 
 * + abstract methods: no definition
 */
public abstract class AbstractEmail {
	public abstract boolean login(String username, String password);

	protected boolean login2Steps(String username, String password) {
		return false;
	}
}
