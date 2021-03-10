package generic;

public class GenericClassDemo {
	public static void main(String[] args) {
		IList<Integer> list = new JavaList<>();
		System.out.println(list.size());
		
		list.add(10);
		list.add(20);
		System.out.println(list.size());
		list.iterate();
		
		list.add(30);
		System.out.println(list.size());
		list.iterate();
		
		list.add(40);
		System.out.println(list.size());
		list.iterate();
		
		System.out.println(list.count(t -> t >30));
		
		list.add(40);
		list.add(40);
		list.add(40);
		list.add(40);
		list.add(40);
		list.iterate();
		
		
		list.removeIf(t -> t >= 30);
		list.iterate();
	}
}
