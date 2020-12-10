package inheritance.ssuper.role;
/*
 * Abstract class contains: JVAVA 7
 * abstract method: no definition
 * normal method
 */
public abstract class AbstractEmail {
	public abstract boolean login(String username, String password);

	protected boolean login2Steps(String username, String password) {
		return false;
	}
}
