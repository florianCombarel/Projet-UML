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

	public JPanelListeClients() {
		
		
		this.setLayout(new BorderLayout());
		this.setButton_ajouterClient();
		this.setTable_liste();
		this.add(this.button_ajouterClient, BorderLayout.SOUTH);
		this.add(this.table_liste);
		
		
		this.setBackground(Color.GRAY);
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
