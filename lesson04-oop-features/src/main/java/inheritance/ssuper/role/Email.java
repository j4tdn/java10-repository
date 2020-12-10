package inheritance.ssuper.role;

public interface Email {
	//class's default modifier => package (default)
	//interface's default access modifier => project (public)
	
	//inteface's method => has no definition
	boolean login(String userName, String password);
	void logout();
}
