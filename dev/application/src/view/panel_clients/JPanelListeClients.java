package view.panel_clients;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

public class JPanelListeClients extends JPanel {
	
	private JButton button_ajouterClient;
	private JTextField textfield_title;

	public JPanelListeClients() {
		
		
		this.setLayout(new BorderLayout());
		this.setButton_ajouterClient();
		this.setTextfield_Title();
		this.add(this.textfield_title, BorderLayout.NORTH);
		this.add(this.button_ajouterClient, BorderLayout.SOUTH);
		
		
		this.setBackground(Color.GRAY);
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
	
	public void setTextfield_Title() {
		this.textfield_title = new JTextField("Liste des clients");
	}

}
