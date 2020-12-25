package exception;

/**
 * 
 * Age < 10 => invalid
 */
public class InvalidAgeException extends Exception {

	private static final long serialVersionUID = -8639637553249410321L;
	
	public InvalidAgeException(String message) {
		super(message);
	}

}
