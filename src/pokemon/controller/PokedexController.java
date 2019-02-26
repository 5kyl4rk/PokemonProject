package pokemon.controller;

import pokemon.view.PokedexFrame;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import pokemon.model.*;

public class PokedexController
{
	private PokedexFrame appFrame;
	private ArrayList<Pokemon> pokemonList;
	private Mew pinkCat;
	private Ditto blobyBoi;
	private Darkrai nightmareFuel;
	private Mimikyu bootlegPikachu;
	private Jirachi shootingStar;
	private Dedede theKing;

	public PokedexController()
	{
		pokemonList = new ArrayList<Pokemon>(6);
		
		pinkCat = new Mew();
		blobyBoi = new Ditto();
		nightmareFuel = new Darkrai();
		bootlegPikachu =  new Mimikyu();
		shootingStar = new Jirachi();
		theKing = new Dedede();
		
		buildList();
		appFrame = new PokedexFrame(this);

	}

	public void start()
	{

	}

	public ArrayList<Pokemon> getPokemonList()
	{
		return pokemonList;
	}

	public PokedexFrame getFrame()
	{
		return appFrame;
	}
	
	public void updatePokemon(int index, String [] data)
	{
		if(data.length == 5)
		{
			Pokemon current = pokemonList.get(index);
			current.setAttackPoints(Integer.parseInt(data[0]));
			current.setEnhancementModifier(Double.parseDouble(data[1]));
			current.setHealthPoints(Integer.parseInt(data[2]));
			current.setName(data[3]);
			current.setCanEvolve(Boolean.parseBoolean(data[4]));
		}
	}
	
	public String[] displayStats(String name)
	{
		String[] stats = new String[5];
		for(Pokemon selection : pokemonList)
		{
			if(selection.getName().toLowerCase().equals(name))
			{
				stats[0] = Integer.toString(selection.getAttackPoints());
				stats[1] = Double.toString(selection.getEnhancementModifier());
				stats[2] = Integer.toString(selection.getHealthPoints());
				stats[3] = selection.getName();
				stats[4] = Boolean.toString(selection.isCanEvolve());
			}
		}
		
		return stats;
	}
	
	private void buildList()
	{
		pokemonList.add(pinkCat);
		pokemonList.add(blobyBoi);
		pokemonList.add(nightmareFuel);
		pokemonList.add(bootlegPikachu);
		pokemonList.add(shootingStar);
		pokemonList.add(theKing);
	}
	public String[] buildPokedexText()
	{
		String [] names = new String [pokemonList.size()];
		
		for(int index = 0; index < pokemonList.size(); index++)
		{
			names[index] = pokemonList.get(index).getName();
		}
		return names;
	}
	
	public boolean isInt(String test)
	{
		boolean passes = false;
		try
		{
			Integer.parseInt(test);
			passes = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(appFrame, "This isn't an int", "[Integer] Not Valid", JOptionPane.ERROR_MESSAGE);
		}
		return passes;
	}

	public boolean isDouble(String test)
	{
		boolean passes = false;
		
		try
		{
			Double.parseDouble(test);
			passes = true;
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(appFrame, "This isn't a double", "[Double] Not Valid", JOptionPane.ERROR_MESSAGE);
		}
		
		return passes;
	}

}
