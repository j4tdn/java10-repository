package exception;

public class MovieDemo {
	public static void main(String[] args) {
		try {
			System.out.println("Valid: " + isValid(8));
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}
		System.out.println("===== Main thread =====");
	}
	
	private static boolean isValid(int age) throws InvalidAgeException {
		if (age < 10) {
			throw new InvalidAgeException("Age must least at 10!");
		}
		return true;
	}

}
