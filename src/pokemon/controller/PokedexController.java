package pokemon.controller;

import pokemon.view.PokedexFrame;
import java.util.ArrayList;
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
}
