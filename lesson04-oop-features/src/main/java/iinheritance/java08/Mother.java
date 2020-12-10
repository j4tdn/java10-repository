package iinheritance.java08;

public interface Mother {
	void adn();
	//using via constructor
	default void playSport() {
		System.out.println("Mother playing volleyball ...");
	}
	//using via interface e.g: Father.drinkAlcohol()
	static void drinkAlcohol(int qty) {
		System.out.println(qty > 2 ? "drunk" : "continue");
	}
}
