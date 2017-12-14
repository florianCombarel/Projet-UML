package view.panel_clients;

import java.awt.Button;
import java.awt.Panel;

public class PanelClients extends Panel{
	
	private Panel panel_listeClients;
	private PanelFicheClient panel_ficheClient;
	private Button button_afficherClient;
	private Button button_ajouterClient;
	private Button button_supprimerClient;
	
	public PanelClients() {
		
		panel_ficheClient = new PanelFicheClient();
		this.setVisible(true);
	}

}
