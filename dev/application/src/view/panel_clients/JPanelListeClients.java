package view.panel_clients;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

public class JPanelListeClients extends JPanel {
	
	private JButton button_ajouterClient;
	private JTable table_liste;
	private JButton button_title_liste;

	public JPanelListeClients() {
		
		
		this.setLayout(new BorderLayout());
		this.setButton_ajouterClient();
		this.setButton_Title_liste();
		this.setTable_liste();
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

	public void setTable_liste() {
		// TODO Auto-generated method stub
		this.table_liste = new JTable();
		
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
