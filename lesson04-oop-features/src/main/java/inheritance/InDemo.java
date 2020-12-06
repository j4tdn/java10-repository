package inheritance;

public class InDemo {
	public static void main(String[] args) {
		Parent p1 = new Sub();
		//khong @Override duoc 

		System.out.println(p1.number);
		System.out.println(p1.text);
		
		//@Override duoc
		p1.log();
	}

}
