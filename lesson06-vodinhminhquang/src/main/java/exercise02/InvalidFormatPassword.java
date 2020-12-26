package exercise02;

public class InvalidFormatPassword extends RuntimeException {

	
	private static final long serialVersionUID = -2121633415486775649L;

	public InvalidFormatPassword(String message) {
		super(message);
	}
}
