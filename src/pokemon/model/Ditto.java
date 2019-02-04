package pokemon.model;

public class Ditto extends Pokemon implements NormalType
{
	public Ditto(int number, String name)
	{
		super(number, name);
	}
	
	public void transform(Pokemon target)
	{
		System.out.println(this.getName() + " morphed into a " + target.getPokemonInformation());
	}
	public void sleep()
	{
		System.out.println(this.getName()+" forms into a puddle");
	}
	
	public void tackle()
	{
		System.out.println(this.getName() + " slams into the opponent, but ends up vibrating intensely");
		this.setHealthPoints(this.getHealthPoints() - 2);
	}
}	
