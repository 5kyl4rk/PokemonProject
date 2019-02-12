package pokemon.view;

import pokemon.controller.PokedexController;
import javax.swing.*;

public class PokedexPanel extends JPanel
{
	private PokedexController appController;
	private SpringLayout appLayout;
	
	private JButton changeButton;
	private JComboBox pokedexDropdown;
	
	private JTextField numberField;
	private JTextField nameField;
	private JTextField evolveField;
	private JTextField attackField;
	private JTextField enhancementField;
	private JTextField healthField;
	
	private JLabel numberLabel;
	private JLabel nameLabel;
	private JLabel evolveLabel;
	private JLabel attackLabel;
	private JLabel enhanceLabel;
	private JLabel healthLabel;
	private JLabel imageLabel;
	
	public PokedexPanel(PokedexController appController)
	{
		super();
		
		this.appController = appController;
		this.appLayout = new SpringLayout();
		
		this.changeButton = new JButton("click her to change pokevalues");
		this.pokedexDropdown = new JComboBox();//stub
		
		this.numberField = new JTextField("I wanna be the very best");
		this.evolveField = new JTextField("like no one ever was");
		this.attackField = new JTextField("\"dun dun DUN\"");
		this.enhancementField = new JTextField("to catch them is my real quest");
		this.healthField = new JTextField("to train them is my cause");
		
		this.numberLabel = new JLabel("This Pokemon number is ");
		this.nameLabel = new JLabel("My name is ");
		this.evolveLabel = new JLabel("This Pokemon can evolve ");
		this.attackLabel = new JLabel("This Pokemon attack level is ");
		this.enhanceLabel = new JLabel("This Pokemon enhancement level is ");
		this.healthLabel = new JLabel("This Pokemon health is ");
		this.imageLabel = new JLabel("Pokemon goes here");
		
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
		this.setLayout(appLayout);
		this.add(pokedexDropdown);
		
		this.add(numberField);
		this.add(evolveField);
		this.add(attackField);
		this.add(enhancementField);
		this.add(healthField);
		
		this.add(numberLabel);
		this.add(nameLabel);
		this.add(evolveLabel);
		this.add(attackLabel);
		this.add(enhanceLabel);
		this.add(healthLabel);
		this.add(imageLabel);
	}
	
	private void setupListeners()
	{
		
		
	}
}
