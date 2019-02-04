package pokemon.view;

import pokemon.controller.PokedexController;
import javax.swing.*;

public class PokedexPanel extends JPanel
{
	private PokedexController appController;
	private SpringLayout appLayout;
	private JTextField textField;
	private JLabel labels;
	
	public PokedexPanel(PokedexController appController)
	{
		super();
		
		this.appController = appController;
		this.appLayout = new SpringLayout();
		this.textField = new JTextField();
		this.labels = new JLabel("I wanna be the very best");
		
		setupLayout();
		setupPanel();
		setupListeners();
	}
	
	private void setupLayout()
	{
		//insert code dump here
	}
	
	private void setupPanel()
	{
		this.add(labels);
		this.add(textField);
	}
	
	private void setupListeners()
	{
		
		
	}
}
