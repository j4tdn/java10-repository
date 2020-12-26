package exception;

public class MovieDemo {
	public static void main(String[] args) {
		try {
			System.out.println("valid: " + isValidate(8));
		} catch (Exception e) {
			//tracing exactly where the error code is 
			System.out.println("log: " + e.getMessage());
		}
	
		System.out.println("=== Main thread ===");
	}
	private static boolean isValidate (int age) throws InvalidAgeException {
		if (age < 10) {
			throw new InvalidAgeException("Age must be equal or greater than 10 !");
		}
		return true;
	}
}
