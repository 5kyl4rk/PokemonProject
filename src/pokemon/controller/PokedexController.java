package pokemon.controller;

import pokemon.view.PokedexFrame;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import pokemon.model.*;

public class PokedexController
{
	private PokedexFrame appFrame;
	private ArrayList<Pokemon> pokemonList;

	public PokedexController()
	{
		appFrame = new PokedexFrame(this);
		pokemonList = new ArrayList<Pokemon>(6);

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
