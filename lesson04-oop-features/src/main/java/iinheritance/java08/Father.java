package iinheritance.java08;

public interface Father {
	void adn();
	
	default void playSport() {
		System.out.println("FAther playing football...");
	}
	static void drinkAlcohol(int qty) {
		System.out.println(qty > 2 ? "drunk" : "continue");
	}

}
