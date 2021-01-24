package kiemtra;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Ex04 {
	
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		String str = "Welcome  to  JAVA10  class";
	
	     char[] hello=str.toCharArray();
	     List<Character> trial1= new LinkedList<>();
	     for(char c: hello)
	     trial1.add(c);
	     Collections.reverse(trial1);
	     ListIterator li = trial1.listIterator();
	     while(li.hasNext())
	     System.out.print(li.next());
	     System.out.println(str.replaceAll("\\s\\s+", " ").trim());
	     
	  
	}

}
