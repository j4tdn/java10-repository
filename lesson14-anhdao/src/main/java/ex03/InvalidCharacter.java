package ex03;

public class InvalidCharacter extends RuntimeException {
	private static final long serialVersionUID = 5041253146661347322L;

	public InvalidCharacter(String message) {
		super(message);
	}

}