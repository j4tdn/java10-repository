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

	// fail at runtime, not fail at compiled
	public static void main(String[] args) {
		GClassOld gclass = new GClassOld();
		gclass.set(new Integer[] { 1, 2, 3 });
		gclass.add("xxx");

	}
}
