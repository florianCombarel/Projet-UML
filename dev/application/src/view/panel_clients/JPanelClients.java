package view.panel_clients;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.HashMap;

import javax.swing.JPanel;

import model.Agence;
import model.personne.Personne;

public class JPanelClients extends JPanel {
	
	private JPanelFicheClientMorale panel_ficheClient;
	private JPanelListeClients panel_listeClients;
	
	public JPanelClients(HashMap<Integer, Personne> personnes) {
		this.panel_ficheClient = new JPanelFicheClientMorale();
		this.panel_listeClients = new JPanelListeClients(personnes);
		
		
		
		this.setLayout(new BorderLayout());
		this.add(this.panel_listeClients, BorderLayout.WEST);
		this.add(this.panel_ficheClient, BorderLayout.CENTER);
		
		this.setBackground(Color.BLUE);
	}

}
