package iinheritance.java08;

public class Child implements Father, Mother{
	@Override
	public void adn() {
		System.out.println();
	}

	@Override
	public void playSport() {
		Father.super.playSport();
		Mother.super.playSport();
	}
	
}
