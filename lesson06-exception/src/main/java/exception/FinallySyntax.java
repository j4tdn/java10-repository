package exception;

public class FinallySyntax {

	public static void main(String[] args) {
		try {

		} catch (Exception e) {
		}
		try {

		} finally {
		}

		try {
			// 1
			// 2
			// 3
			// 4
			// 5
			// ...
			// n - 1
			// exception: /0, NPE,...
			// n

		} catch (Exception e) {

		} finally {
			// saveAndClose()
		}
		System.out.println("==== main thread ====");
	}

}
