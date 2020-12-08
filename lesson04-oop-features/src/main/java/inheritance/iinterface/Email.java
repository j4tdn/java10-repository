package inheritance.iinterface;

public interface Email {
	//class's default access modifier => package
	//interface default access modifier => project (public)
	//interface's method => has no definition
	boolean login(String username , String password );
	void logout();
}