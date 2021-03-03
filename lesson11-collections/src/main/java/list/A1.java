package list;

import java.util.ArrayList;
import java.util.List;

public class A1 {
	public static void main(String[] args) {
		//before 1.5: raw type
		 List list = new ArrayList(); // objects
		 list.add(1);
		 list.add("a");
		 list.add(2d);
		 
		 for(Object  object:list) {
			 System.out.println((Integer)object*2);
		 }
		 
		//after 1.5 : generic type
		 List<Integer> digits = new ArrayList<>();
		 digits.add(1);
		 for(Integer integer:digits) {
			 System.out.println(integer * 2);
		 }
		 
		 //note:  generic type support to catching error at compile time
	}
}
