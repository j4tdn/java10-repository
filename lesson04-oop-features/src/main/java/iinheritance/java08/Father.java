package iinheritance.java08;

import javax.swing.DefaultBoundedRangeModel;

public interface Father {
	void adn();
	
	default void playSport() {
		System.out.println("Father playing football  ...");
	}
	static void drinkAncohol(int qty) {
		System.out.println(qty> 2 ? "drunk ": "continue");
	}

}
