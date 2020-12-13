package inheritance.ssuper.role;
/*
 * Abstract class
 * +normal methods 
 * + abstract methods : no definition
 * */
public abstract class AbstractEmail {
	public abstract boolean login(String username,String password);
	
	boolean login2Steps(String username,String password) {
		return false;
	}

}
