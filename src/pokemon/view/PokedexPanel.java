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
	private JTextField enchancementField;
	private JTextField healthField;
	
	private JLabel numberLabel;
	private JLabel nameLabel;
	private JLabel evolveLabel;
	private JLabel attackLabel;
	private JLabel enchanceLabel;
	private JLabel healthLabel;
	private JLabel imageLabel;
	
	public PokedexPanel(PokedexController appController)
	{
		super();
		
		this.appController = appController;
		this.appLayout = new SpringLayout();
		
		this.numberField = new JTextField();
		this.evolveField = new JTextField();
		this.attackField = new JTextField();
		this.enchancementField = new JTextField();
		this.healthField = new JTextField();
		
		this.numberLabel = new JLabel("");
		this.nameLabel = new JLabel();
		this.evolveLabel = new JLabel();
		this.attackLabel = new JLabel();
		this.enchanceLabel = new JLabel();
		this.healthLabel = new JLabel();
		this.imageLabel = new JLabel();
		
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
		this.add(numberLabel);
		this.add(numberField);
	}
	
	private void setupListeners()
	{
		
		
	}
}
