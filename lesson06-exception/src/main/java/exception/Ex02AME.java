package exception;

public class Ex02AME {
	private static Ex01NPE nfe;

	public static void main(String[] args) {
		nfe = null;
		System.out.println(nfe.toString());
	}

}
