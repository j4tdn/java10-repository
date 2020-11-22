package data.type;

import bean.HandInteger;

public class Ex07 {
	public static void main(String[] args) {
		HandInteger origin =new HandInteger(11);
		dosomething(origin);
		
	}
 private static void dosomething(HandInteger origin) {
	 origin.value=68;
	 HandInteger hand =new HandInteger(72);
	 origin =hand;
	 origin.value =88;
			 
		
	 
 }

}
