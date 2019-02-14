package pokemon.controller;

import pokemon.view.PokedexFrame;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import pokemon.model.*;

public class PokedexController
{
	private PokedexFrame appFrame;
	private ArrayList<Pokemon> pokemonList;
	private Mew mew;

	public PokedexController()
	{
		pokemonList = new ArrayList<Pokemon>(6);
		
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
