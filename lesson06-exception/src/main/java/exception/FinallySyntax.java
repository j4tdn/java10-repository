package exception;

public class FinallySyntax {
	public static void main(String[] args) {
		// finally = syntax
		try {
			
		} catch (Exception e) {
		}
		
		try {
			
		} finally {
			// always run
		}
		
		// write file data.txt
		// 1. Open file
		// 2. Write data
		// 3. Save and close file
		try {
			// 1
			// 2
			// 3
			// 4
			// 5
			// ...
			// n-1
			// exception: /0, NPE 
			// n
			
		} catch (Exception e) {
			
		} finally {
			// saveAndClose();
		}
		
		System.out.println("==== main thread ====");
	}
}
