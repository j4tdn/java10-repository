package inheritance.iinterface;

public interface Email {
	// class's default access modifier => package
		// interface's default access modifier => project (public)
		
		// interface's method => has no definition
		boolean logIn(String user, String password);
		void logOut();

}
