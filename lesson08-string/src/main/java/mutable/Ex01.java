package mutable;

public class Ex01 {
	public static void main(String[] args) {
		
		// immutable: literal ; object
		// mutable: StringBuider, StringBuffer
		
		// mutable vs immutable
		
		String s = "literal";
		hashCode("s", s);
		value("s", s);
		s = s + " plus";
		hashCode("s", s);
		value("s", s);
		
		System.out.println("--------------------");
		StringBuilder sbuider = new StringBuilder("buider");
		hashCode("sbuider", sbuider);
		value("sbuider", sbuider);
		sbuider.append(" plus"); 
		hashCode("sbuider", sbuider);
		value("sbuider", sbuider);
		
		System.out.println("--------------------");
		StringBuffer sbuffer = new StringBuffer("buffer");
		hashCode("sbuffer", sbuffer);
		value("sbuffer", sbuffer);
		sbuffer.append(" plus");
		hashCode("sbuffer", sbuffer);
		value("sbuffer", sbuffer);
		
		sbuffer.reverse();
		sbuider.delete(2, 3);
		sbuffer.deleteCharAt(3);
		
	}
	
	private static void hashCode(CharSequence name, CharSequence s) {
		System.out.println(name + ": " + System.identityHashCode(s));
	}
	
	private static void value(CharSequence name, CharSequence s) {
		System.out.println(name + ": " + s);
	}
}
