package inheritance.iinterface;

public interface Email {
	// class's default access modifier =>package
	//interface's default access modifier => project
	
	//interface method => has no definition
	
	boolean login(String username, String passwork);
	void logout();	
	
}
