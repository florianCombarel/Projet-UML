package view.panel_clients;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class JPanelFicheClient extends JPanel {
	
	private GridBagLayout gbl;
	
	private JLabel label_nom;
	private JTextArea textArea_nom;
	
	private JLabel label_adresse;
	private JTextArea textArea_adresse;
	
	private JLabel label_telephone;
	private JTextArea textArea_telephone;
	
	private JLabel label_mail;
	private JTextArea textArea_mail;
	
	public JPanelFicheClient() {
		
		this.setLabel_nom();
		this.setTextArea_nom("");
		
		this.setLabel_adresse();
		this.setTextArea_adresse("");
		
		this.setLabel_telephone();
		this.setTextArea_telephone("");
		
		this.setLabel_mail();
		this.setTextArea_mail("");
		
		this.add(this.label_nom);
		this.add(this.textArea_nom);
		
		this.add(this.label_adresse);
		this.add(this.textArea_adresse);
		
		this.add(this.label_telephone);
		this.add(this.textArea_telephone);
		
		this.add(this.label_mail);
		this.add(this.textArea_mail);
		
		this.setBackground(Color.CYAN);
	}

	public GridBagLayout getGbl() {
		return gbl;
	}

	public void setGbl() {
		this.gbl = new GridBagLayout();
	}

	public JLabel getLabel_nom() {
		return label_nom;
	}

	public void setLabel_nom() {
		this.label_nom = new JLabel("Nom : ");
	}

	public JTextArea getTextArea_nom() {
		return textArea_nom;
	}

	public void setTextArea_nom(String nom) {
		this.textArea_nom = new JTextArea(nom);
		Dimension d = this.textArea_nom.getPreferredSize();
		d.width = 150;
		this.textArea_nom.setPreferredSize(d);
	}

	public JLabel getLabel_adresse() {
		return label_adresse;
	}

	public void setLabel_adresse() {
		this.label_adresse = new JLabel("Adresse : ");
	}

	public JTextArea getTextArea_adresse() {
		return textArea_adresse;
	}

	public void setTextArea_adresse(String adresse) {
		this.textArea_adresse = new JTextArea(adresse);
		Dimension d = this.textArea_adresse.getPreferredSize();
		d.width = 150;
		this.textArea_adresse.setPreferredSize(d);
	}

	public JLabel getLabel_telephone() {
		return label_telephone;
	}

	public void setLabel_telephone() {
		this.label_telephone = new JLabel("Téléphone : ");
	}

	public JTextArea getTextArea_telephone() {
		return textArea_telephone;
	}

	public void setTextArea_telephone(String telephone) {
		this.textArea_telephone = new JTextArea(telephone);
		Dimension d = this.textArea_telephone.getPreferredSize();
		d.width = 150;
		this.textArea_telephone.setPreferredSize(d);
	}

	public JLabel getLabel_mail() {
		return label_mail;
	}

	public void setLabel_mail() {
		this.label_mail = new JLabel("Email : ");
	}

	public JTextArea getTextArea_mail() {
		return textArea_mail;
	}

	public void setTextArea_mail(String mail) {
		this.textArea_mail = new JTextArea(mail);
		Dimension d = this.textArea_mail.getPreferredSize();
		d.width = 150;
		this.textArea_mail.setPreferredSize(d);
	}
	
	

}
