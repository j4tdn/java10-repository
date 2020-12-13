package inheritance.ssuper.role;
public interface Email {
	// class's default access modifier => package
	// interface's default access modifier => project (public)
	
	// interface's method => has no definition
	boolean login(String username, String password);
	
}
