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
	}
}
