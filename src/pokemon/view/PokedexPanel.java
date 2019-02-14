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
	
	private ImageIcon pokemonIcon;
	
	public PokedexPanel(PokedexController appController)
	{
		super();
		
		this.appController = appController;
		this.appLayout = new SpringLayout();
		
		this.changeButton = new JButton("click her to change pokevalues");
		this.pokedexDropdown = new JComboBox();
		appLayout.putConstraint(SpringLayout.NORTH, pokedexDropdown, 189, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, pokedexDropdown, 24, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, pokedexDropdown, 119, SpringLayout.WEST, this);
		
		this.numberField = new JTextField("I wanna be the very best");
		appLayout.putConstraint(SpringLayout.NORTH, numberField, 30, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, numberField, -249, SpringLayout.SOUTH, this);
		this.nameField = new JTextField("like no one ever was");
		appLayout.putConstraint(SpringLayout.WEST, numberField, 0, SpringLayout.WEST, nameField);
		appLayout.putConstraint(SpringLayout.WEST, nameField, 494, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, nameField, -29, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.EAST, numberField, 0, SpringLayout.EAST, nameField);
		this.evolveField = new JTextField("\"dun dun DUN\"");
		appLayout.putConstraint(SpringLayout.NORTH, evolveField, 89, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, evolveField, 494, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, evolveField, -29, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, nameField, -6, SpringLayout.NORTH, evolveField);
		this.attackField = new JTextField("to catch them is my real quest");
		appLayout.putConstraint(SpringLayout.NORTH, attackField, 6, SpringLayout.SOUTH, evolveField);
		appLayout.putConstraint(SpringLayout.WEST, attackField, 0, SpringLayout.WEST, numberField);
		appLayout.putConstraint(SpringLayout.EAST, attackField, -29, SpringLayout.EAST, this);
		this.enhancementField = new JTextField("to train them is my cause");
		appLayout.putConstraint(SpringLayout.NORTH, enhancementField, 6, SpringLayout.SOUTH, attackField);
		appLayout.putConstraint(SpringLayout.WEST, enhancementField, 0, SpringLayout.WEST, numberField);
		appLayout.putConstraint(SpringLayout.EAST, enhancementField, -29, SpringLayout.EAST, this);
		this.healthField = new JTextField("*POKEMON!*");
		appLayout.putConstraint(SpringLayout.NORTH, healthField, 6, SpringLayout.SOUTH, enhancementField);
		appLayout.putConstraint(SpringLayout.WEST, healthField, 0, SpringLayout.WEST, numberField);
		appLayout.putConstraint(SpringLayout.SOUTH, healthField, -70, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, healthField, -29, SpringLayout.EAST, this);
		
		this.numberLabel = new JLabel("This Pokemon number is ");
		appLayout.putConstraint(SpringLayout.NORTH, numberLabel, 0, SpringLayout.NORTH, numberField);
		appLayout.putConstraint(SpringLayout.SOUTH, numberLabel, 0, SpringLayout.SOUTH, numberField);
		appLayout.putConstraint(SpringLayout.EAST, numberLabel, -71, SpringLayout.WEST, numberField);
		this.nameLabel = new JLabel("My name is ");
		appLayout.putConstraint(SpringLayout.NORTH, nameLabel, 0, SpringLayout.NORTH, nameField);
		appLayout.putConstraint(SpringLayout.SOUTH, nameLabel, 0, SpringLayout.SOUTH, nameField);
		appLayout.putConstraint(SpringLayout.EAST, nameLabel, -71, SpringLayout.WEST, nameField);
		this.evolveLabel = new JLabel("This Pokemon can evolve ");
		appLayout.putConstraint(SpringLayout.NORTH, evolveLabel, 0, SpringLayout.NORTH, evolveField);
		appLayout.putConstraint(SpringLayout.SOUTH, evolveLabel, 0, SpringLayout.SOUTH, evolveField);
		appLayout.putConstraint(SpringLayout.EAST, evolveLabel, -71, SpringLayout.WEST, evolveField);
		this.attackLabel = new JLabel("This Pokemon attack level is ");
		appLayout.putConstraint(SpringLayout.NORTH, attackLabel, 0, SpringLayout.NORTH, attackField);
		appLayout.putConstraint(SpringLayout.SOUTH, attackLabel, 0, SpringLayout.SOUTH, attackField);
		appLayout.putConstraint(SpringLayout.EAST, attackLabel, -71, SpringLayout.WEST, attackField);
		this.enhanceLabel = new JLabel("This Pokemon enhancement level is ");
		appLayout.putConstraint(SpringLayout.NORTH, enhanceLabel, 0, SpringLayout.NORTH, enhancementField);
		appLayout.putConstraint(SpringLayout.SOUTH, enhanceLabel, 0, SpringLayout.SOUTH, enhancementField);
		appLayout.putConstraint(SpringLayout.EAST, enhanceLabel, -71, SpringLayout.WEST, enhancementField);
		this.healthLabel = new JLabel("This Pokemon health is ");
		//insert code dump here
		appLayout.putConstraint(SpringLayout.NORTH, healthLabel, 0, SpringLayout.NORTH, healthField);
		appLayout.putConstraint(SpringLayout.SOUTH, healthLabel, 0, SpringLayout.SOUTH, healthField);
		
		this.pokemonIcon = new ImageIcon(getClass().getResource("/pokemon/view/images/darkrai.png"));
		this.imageLabel = new JLabel("Pokemon goes here",pokemonIcon,JLabel.CENTER);
		appLayout.putConstraint(SpringLayout.NORTH, imageLabel, 0, SpringLayout.NORTH, this);
		setupLayout();
		setupPanel();
		setupDropdown();
		setupListeners();
	}
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.EAST, healthLabel, -71, SpringLayout.WEST, healthField);
		appLayout.putConstraint(SpringLayout.WEST, imageLabel, 24, SpringLayout.WEST, this);
	}
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.add(pokedexDropdown);
		
		this.add(numberField);
		this.add(nameField);
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
		
		imageLabel.setVerticalTextPosition(JLabel.BOTTOM);
		imageLabel.setHorizontalTextPosition(JLabel.CENTER);
	}
	
	private void setupDropdown()
	{
		DefaultComboBoxModel<String> temp = new DefaultComboBoxModel<String>(appController.buildPokedexText());
		pokedexDropdown.setModel(temp);
	}
	
	private void setupListeners()
	{
		
		
	}
	
	private void sendDataToController(String name)
	{
		String path = "/pokemon/view/images/";
		String defaultName = "pokeball";
		String extension = ".png";
		
		try
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path+name.toLowerCase() + extension));
		}
		catch(NullPointerException missingFile)
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path+defaultName+extension));
		}
		imageLabel.setIcon(pokemonIcon);
		repaint();
	}
}
