package generic;

public class GClassOld {
	private Object[] objects;

	public void set(Object[] objects) {
		this.objects = objects;
	}

	public Object[] get() {
		return objects;
	}

	public boolean add(Object object) {
		objects[0] = object;
		return true;
	}

	public static void main(String[] args) {
		GClassOld gclass = new GClassOld();
		gclass.set(new String[] { "a", "b" });
	}
}
