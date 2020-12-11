package iinheritance.java8;

public interface Mother {
	void adn();
	
	default void playSport() {
		System.out.println("Mother playing volleyball");
	}
	
	static void drinkBeer(int quantity) {
		System.out.println(quantity > 2 ? "Drunk" : "Continue");
	}
}
