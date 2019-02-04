package pokemon.model;

public class Darkrai extends Pokemon implements DarkType
{
	public Darkrai(int number, String name)
	{
		super(number, name);
	}
	
	public void spook()
	{
		System.out.println(this.getName() +" leaps at unfathomable speeds towards you and mysteriously vanishes");
	}
	
	public void hide()
	{
		System.out.println(this.getName() +" retreats back into the darkness");
	}
}
