package data.type;

import bean.HandInteger;

public class Ex08 {
	//global variale => JAVA : attribute
	// local variable
	private static void demo()
	{
		//local variable
		int x =10;
		if(x>5) {
			int y=10;
		}
		
	}
	public static void main(String[] args) {
		//primitive
		//object
		//cannot change value
		
		final int a=10;
		//a = 20;
		//cannot modify object's address
		
		final HandInteger hand =new HandInteger(20);
		hand.value =99;
				
		
	}

}
