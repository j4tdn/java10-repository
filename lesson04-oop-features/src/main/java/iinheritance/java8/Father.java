package iinheritance.java8;

public interface Father {
	void adn();
	
	default void playSport() {
		System.out.println("Father playing soccer");
	}
	
	static void drinkBeer(int quantity) {
		System.out.println(quantity > 2 ? "Drunk" : "Continue");
	}
}
