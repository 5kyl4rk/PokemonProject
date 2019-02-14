package pokemon.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import pokemon.controller.PokedexController;

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
		appLayout.putConstraint(SpringLayout.NORTH, pokedexDropdown, 232, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, pokedexDropdown, 24, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, pokedexDropdown, -10, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, pokedexDropdown, -494, SpringLayout.EAST, this);
		
		this.numberField = new JTextField("I wanna be the very best");
		appLayout.putConstraint(SpringLayout.NORTH, numberField, 22, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST, numberField, -29, SpringLayout.EAST, this);
		this.nameField = new JTextField("like no one ever was");
		appLayout.putConstraint(SpringLayout.WEST, nameField, 95, SpringLayout.WEST, this);
		this.evolveField = new JTextField("\"dun dun DUN\"");
		appLayout.putConstraint(SpringLayout.SOUTH, numberField, -22, SpringLayout.NORTH, evolveField);
		appLayout.putConstraint(SpringLayout.NORTH, evolveField, 65, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST, evolveField, -29, SpringLayout.EAST, this);
		this.attackField = new JTextField("to catch them is my real quest");
		appLayout.putConstraint(SpringLayout.NORTH, attackField, 22, SpringLayout.SOUTH, evolveField);
		appLayout.putConstraint(SpringLayout.EAST, attackField, -29, SpringLayout.EAST, this);
		this.enhancementField = new JTextField("to train them is my cause");
		appLayout.putConstraint(SpringLayout.NORTH, enhancementField, 22, SpringLayout.SOUTH, attackField);
		appLayout.putConstraint(SpringLayout.EAST, enhancementField, -29, SpringLayout.EAST, this);
		
		this.healthField = new JTextField("*POKEMON!*");
		appLayout.putConstraint(SpringLayout.NORTH, healthField, 22, SpringLayout.SOUTH, enhancementField);
		appLayout.putConstraint(SpringLayout.SOUTH, healthField, -70, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, healthField, -29, SpringLayout.EAST, this);
		
		this.numberLabel = new JLabel("This Pokemon number is ");
		appLayout.putConstraint(SpringLayout.EAST, numberLabel, -216, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.WEST, numberField, 10, SpringLayout.EAST, numberLabel);
		
		
		this.nameLabel = new JLabel("My name is ");
		appLayout.putConstraint(SpringLayout.NORTH, nameLabel, 5, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, nameField, 0, SpringLayout.NORTH, nameLabel);
		appLayout.putConstraint(SpringLayout.WEST, nameLabel, 10, SpringLayout.WEST, this);
		
		this.evolveLabel = new JLabel("This Pokemon can evolve ");
		this.attackLabel = new JLabel("This Pokemon attack level is ");
		this.enhanceLabel = new JLabel("This Pokemon enhancement level is ");
		this.healthLabel = new JLabel("This Pokemon health is ");
		
		this.pokemonIcon = new ImageIcon(getClass().getResource("/pokemon/view/images/pokeball.png"));
		this.imageLabel = new JLabel("Pokemon goes here",pokemonIcon,JLabel.CENTER);
		appLayout.putConstraint(SpringLayout.SOUTH, nameLabel, 2, SpringLayout.NORTH, imageLabel);
		appLayout.putConstraint(SpringLayout.NORTH, imageLabel, 50, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, imageLabel, -10, SpringLayout.NORTH, pokedexDropdown);
		appLayout.putConstraint(SpringLayout.SOUTH, nameField, -6, SpringLayout.NORTH, imageLabel);
		appLayout.putConstraint(SpringLayout.WEST, imageLabel, 24, SpringLayout.WEST, this);
		setupLayout();
		setupPanel();
		setupDropdown();
		setupListeners();
	}
	
	private void setupLayout()
	{
		
		appLayout.putConstraint(SpringLayout.EAST, attackLabel, -10, SpringLayout.WEST, attackField);
		appLayout.putConstraint(SpringLayout.NORTH, enhanceLabel, 0, SpringLayout.NORTH, enhancementField);
		appLayout.putConstraint(SpringLayout.SOUTH, enhanceLabel, 0, SpringLayout.SOUTH, enhancementField);
		appLayout.putConstraint(SpringLayout.EAST, enhanceLabel, -10, SpringLayout.WEST, enhancementField);
		appLayout.putConstraint(SpringLayout.NORTH, numberLabel, 0, SpringLayout.NORTH, numberField);
		appLayout.putConstraint(SpringLayout.SOUTH, numberLabel, 0, SpringLayout.SOUTH, numberField);
		appLayout.putConstraint(SpringLayout.SOUTH, nameLabel, 0, SpringLayout.SOUTH, nameField);
		appLayout.putConstraint(SpringLayout.NORTH, evolveLabel, 0, SpringLayout.NORTH, evolveField);
		appLayout.putConstraint(SpringLayout.SOUTH, evolveLabel, 0, SpringLayout.SOUTH, evolveField);
		appLayout.putConstraint(SpringLayout.NORTH, attackLabel, 0, SpringLayout.NORTH, attackField);
		appLayout.putConstraint(SpringLayout.SOUTH, attackLabel, 0, SpringLayout.SOUTH, attackField);
		appLayout.putConstraint(SpringLayout.NORTH, healthLabel, 0, SpringLayout.NORTH, healthField);
		appLayout.putConstraint(SpringLayout.SOUTH, healthLabel, 0, SpringLayout.SOUTH, healthField);
		appLayout.putConstraint(SpringLayout.EAST, healthLabel, -10, SpringLayout.WEST, healthField);
		appLayout.putConstraint(SpringLayout.EAST, nameLabel, -10, SpringLayout.WEST, nameField);
		appLayout.putConstraint(SpringLayout.EAST, evolveLabel, -10, SpringLayout.WEST, evolveField);
		
		appLayout.putConstraint(SpringLayout.EAST, pokedexDropdown, -214, SpringLayout.WEST, healthLabel);

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
		changeButton.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent click)
			{
				sendDataToController();
			}
		});
		
		pokedexDropdown.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent click)
			{
				String name = pokedexDropdown.getSelectedItem().toString();
				changeImageDisplay(name);
			}
				});
		
	}
	
	private void sendDataToController()
	{
		int index = pokedexDropdown.getSelectedIndex();
		
		if(appController.isInt(attackField.getText()) && appController.isDouble(enhancementField.getText()) && appController.isInt(healthField.getText()))
		{
			String [] data = new String[5];
			data[0] = attackField.getText();
			data[1] = enhancementField.getText();
			data[2] = healthField.getText();
			data[3] = nameField.getText();
			data[4] = evolveField.getText();
			
			appController.updatePokemon(index, data);
		}
	}
	private void changeImageDisplay(String name)
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
