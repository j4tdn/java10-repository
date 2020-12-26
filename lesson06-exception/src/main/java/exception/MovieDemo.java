package exception;

public class MovieDemo {
	public static void main(String[] args) {
		try {
			System.out.println("valid: " + isValid(8));
		} catch (InvalidAgeException e) {
			System.out.println("log: " + e.getMessage());
		}
		
		System.out.println("==== main thread ====");
	}
	
	private static boolean isValid(int age) throws InvalidAgeException {
		if (age < 10) {
			throw new InvalidAgeException("Age must be equal or greater than 10 !");
		}
		return true;
	}
}
