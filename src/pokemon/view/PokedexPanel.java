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
	private JButton saveButton;
	
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
		
		this.changeButton = new JButton("click here to change pokevalues");
		this.saveButton = new JButton("Save information");
		appLayout.putConstraint(SpringLayout.EAST, saveButton, -29, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.EAST, changeButton, -14, SpringLayout.WEST, saveButton);
		this.pokedexDropdown = new JComboBox();
		appLayout.putConstraint(SpringLayout.NORTH, saveButton, 28, SpringLayout.NORTH, pokedexDropdown);
		appLayout.putConstraint(SpringLayout.NORTH, changeButton, 28, SpringLayout.NORTH, pokedexDropdown);
		appLayout.putConstraint(SpringLayout.WEST, pokedexDropdown, 24, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, pokedexDropdown, -494, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, pokedexDropdown, 285, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, pokedexDropdown, -30, SpringLayout.SOUTH, this);
		
		this.numberField = new JTextField("I wanna be the very best");
		appLayout.putConstraint(SpringLayout.SOUTH, numberField, -359, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, numberField, -54, SpringLayout.EAST, this);
		this.nameField = new JTextField("like no one ever was");
		appLayout.putConstraint(SpringLayout.NORTH, nameField, 5, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, nameField, 95, SpringLayout.WEST, this);
		this.evolveField = new JTextField("\"dun dun DUN\"");
		appLayout.putConstraint(SpringLayout.WEST, numberField, 0, SpringLayout.WEST, evolveField);
		this.attackField = new JTextField("to catch them is my real quest");
		appLayout.putConstraint(SpringLayout.WEST, evolveField, 0, SpringLayout.WEST, attackField);
		this.enhancementField = new JTextField("to train them is my cause");
		appLayout.putConstraint(SpringLayout.WEST, enhancementField, 0, SpringLayout.WEST, numberField);
		
		this.healthField = new JTextField("*POKEMON!*");
		appLayout.putConstraint(SpringLayout.WEST, healthField, 0, SpringLayout.WEST, numberField);
		
		this.numberLabel = new JLabel("This Pokemon number is ");
		appLayout.putConstraint(SpringLayout.NORTH, numberField, -3, SpringLayout.NORTH, numberLabel);
		appLayout.putConstraint(SpringLayout.NORTH, numberLabel, 23, SpringLayout.NORTH, this);
		
		
		this.nameLabel = new JLabel("My name is ");
		appLayout.putConstraint(SpringLayout.NORTH, nameLabel, 5, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, nameLabel, 10, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, nameLabel, -10, SpringLayout.WEST, nameField);
		
		this.evolveLabel = new JLabel("This Pokemon can evolve ");
		appLayout.putConstraint(SpringLayout.NORTH, evolveField, -5, SpringLayout.NORTH, evolveLabel);
		appLayout.putConstraint(SpringLayout.NORTH, evolveLabel, 65, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST, evolveLabel, -241, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.EAST, numberLabel, 0, SpringLayout.EAST, evolveLabel);
		this.attackLabel = new JLabel("This Pokemon attack level is ");
		appLayout.putConstraint(SpringLayout.NORTH, attackLabel, 32, SpringLayout.SOUTH, evolveLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, attackLabel, -261, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, attackLabel, -237, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, attackField, 0, SpringLayout.NORTH, attackLabel);
		appLayout.putConstraint(SpringLayout.WEST, attackField, 6, SpringLayout.EAST, attackLabel);
		this.enhanceLabel = new JLabel("This Pokemon enhancement level is ");
		appLayout.putConstraint(SpringLayout.NORTH, enhanceLabel, 22, SpringLayout.SOUTH, attackLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, enhanceLabel, -213, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, enhancementField, 0, SpringLayout.NORTH, enhanceLabel);
		appLayout.putConstraint(SpringLayout.EAST, enhanceLabel, 0, SpringLayout.EAST, numberLabel);
		this.healthLabel = new JLabel("This Pokemon health is ");
		appLayout.putConstraint(SpringLayout.NORTH, healthField, 0, SpringLayout.NORTH, healthLabel);
		appLayout.putConstraint(SpringLayout.NORTH, healthLabel, 209, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST, healthLabel, 0, SpringLayout.EAST, numberLabel);
		
		this.pokemonIcon = new ImageIcon(getClass().getResource("/pokemon/view/images/pokeball.png"));
		this.imageLabel = new JLabel("Pokemon goes here",pokemonIcon,JLabel.CENTER);
		appLayout.putConstraint(SpringLayout.NORTH, imageLabel, 48, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, nameField, -14, SpringLayout.NORTH, imageLabel);
		appLayout.putConstraint(SpringLayout.WEST, imageLabel, 24, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, imageLabel, -24, SpringLayout.WEST, enhanceLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, nameLabel, -14, SpringLayout.NORTH, imageLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, imageLabel, -6, SpringLayout.NORTH, pokedexDropdown);
		
		
		setupLayout();
		setupPanel();
		setupDropdown();
		setupListeners();
	}
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.SOUTH, nameLabel, 0, SpringLayout.SOUTH, nameField);
		
		appLayout.putConstraint(SpringLayout.EAST, pokedexDropdown, -214, SpringLayout.WEST, healthLabel);

	}
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.add(pokedexDropdown);
		this.add(changeButton);
		this.add(saveButton);
		
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
//				String[] statData =  appController.displayStats(name);
//				attackField.setText(statData[0]);
//				enhancementField.setText(statData[1]);
//				healthField.setText(statData[2]);
//				nameField.setText(statData[3]);
//				evolveField.setText(statData[4]);
			}
				});
		
		saveButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent click)
			{
//				appController.savePokedex();
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
