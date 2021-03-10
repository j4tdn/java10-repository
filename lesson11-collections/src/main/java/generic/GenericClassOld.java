package generic;

public class GenericClassOld {
	private Object[] objs;
	
	public void set(Object[] objs) {
		this.objs = objs;
	}
	
	public Object[] get() {
		return objs;
	}
	
	public boolean add(Object obj) {
		objs[0] = obj;
		return true;
	}
	
	public static void main(String[] args) {
		GenericClassOld glass = new GenericClassOld();
		glass.set(new String[] {"a", "b"});
		glass.add(10);
	}
}
