package iinheritance.java08;

public class Child implements Father,Mother{
	@Override
	public void adn() {
		
	}

	@Override
	public void playSport() {
		Father.super.playSport();
		Mother.super.playSport();
	}

}
