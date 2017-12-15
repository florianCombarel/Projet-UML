package view.panel_clients;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class JPanelClients extends JPanel {
	
	private JPanelFicheClient panel_ficheClient;
	private JPanelListeClients panel_listeClients;
	
	public JPanelClients() {
		this.panel_ficheClient = new JPanelFicheClient();
		this.panel_listeClients = new JPanelListeClients();
		
		
		
		this.setLayout(new BorderLayout());
		this.add(this.panel_listeClients, BorderLayout.WEST);
		this.add(this.panel_ficheClient, BorderLayout.CENTER);
		
		this.setBackground(Color.BLUE);
	}

}
