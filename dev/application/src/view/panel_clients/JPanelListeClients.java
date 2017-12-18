package view.panel_clients;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

import model.personne.Personne;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.HashMap;

public class JPanelListeClients extends JPanel {
	
	private JButton button_ajouterClient;
	private JTable table_liste;
	private JButton button_title_liste;

	public JPanelListeClients(HashMap<Integer, Personne> personnes) {
		
		
		this.setLayout(new BorderLayout());
		this.setButton_ajouterClient();
		this.setButton_Title_liste();
		this.setTable_liste(personnes);
		this.add(this.button_ajouterClient, BorderLayout.SOUTH);
		this.add(this.button_title_liste, BorderLayout.NORTH);
		this.add(this.table_liste);
		
		
		this.setBackground(Color.GRAY);
	}

	public JButton getButton_Title_liste() {
		return button_title_liste;
	}

	public void setButton_Title_liste() {
		this.button_title_liste = new JButton("Liste des Clients");
		this.button_title_liste.setEnabled(false);
		Dimension d =button_ajouterClient.getPreferredSize();
		d.width = 150;
		button_ajouterClient.setPreferredSize(d);
	}

	public void setTable_liste(HashMap<Integer, Personne> personnes) {
		// TODO Auto-generated method stub
		Object[][] data = {};
		String title[] = {"Liste des clients"};
		
		int i = 0;
		for(HashMap.Entry<Integer, Personne> entry : personnes.entrySet()) {
			data[i][0] = new JButton(entry.getValue().getName());
		}
		
		
		this.table_liste = new JTable(data, title);
		
		
	}

	public JButton getButton_ajouterClient() {
		return button_ajouterClient;
	}

	public void setButton_ajouterClient() {
		this.button_ajouterClient = new JButton("Ajouter");
		Dimension d =button_ajouterClient.getPreferredSize();
		d.width = 150;
		button_ajouterClient.setPreferredSize(d);
	}
	
	public JTable getTable_liste() {
		return this.table_liste;
	}

}
