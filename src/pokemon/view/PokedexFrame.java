package pokemon.view;

import pokemon.controller.PokedexController;
import javax.swing.JFrame;

public class PokedexFrame extends JFrame
{
	private PokedexController appController;
	private PokedexPanel appPanel;
	
	public PokedexFrame(PokedexController appController)
	{
		super();
		
		this.appController = appController;
		this.appPanel = new PokedexPanel(appController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setSize(250,250);
		this.setTitle("pockymon");
		this.setResizable(false);
		this.setVisible(true);
	}
	
}
