package inheritance.ssuper.role;

public class AbsEmail extends AbstractEmail{

	@Override
	public boolean login(String username, String password) {
		System.out.println("Cheers from da nang");
		return false;
	}

}
