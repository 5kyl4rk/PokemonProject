package pokemon.model;

public class Mew extends Pokemon implements PsychicType
{
	public Mew(int number, String name)
	{
		super(number, name);
	}
	
	public void transform(Pokemon target)
	{
		System.out.println(this.getName() + " morphed into a " + target.getPokemonInformation());
	}
	
	public void predict()
	{
		System.out.println(this.getName() + " gazes deep into the abyss and foresees the future.  It readies itself for the next attack");
	}
	
	public void teleport()
	{
		System.out.println("You blink and " + this.getName() + " has vanished");
	}
}

