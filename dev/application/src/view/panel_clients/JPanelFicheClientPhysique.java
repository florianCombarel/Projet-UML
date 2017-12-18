package view.panel_clients;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class JPanelFicheClientPhysique extends JPanel {
	
	private JLabel label_nom;
	private JTextArea textArea_nom;
	
	private JLabel label_prenom;
	private JTextArea textArea_prenom;
	
	private JLabel label_adresse;
	private JTextArea textArea_adresse;
	
	private JLabel label_telephone;
	private JTextArea textArea_telephone;
	
	private JLabel label_mail;
	private JTextArea textArea_mail;
	
	public JPanelFicheClientPhysique() {
		this.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		this.setLabel_nom();
		this.setTextArea_nom("");
		
		this.setLabel_prenom();
		this.setTextArea_prenom("");
		
		this.setLabel_adresse();
		this.setTextArea_adresse("");
		
		this.setLabel_telephone();
		this.setTextArea_telephone("");
		
		this.setLabel_mail();
		this.setTextArea_mail("");
		
		gbc.insets = new Insets(1,1,1,1);
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		this.add(this.label_nom, gbc);
		gbc.gridx = 1;
		gbc.gridy = 0;
		this.add(this.textArea_nom, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		this.add(this.label_prenom, gbc);
		gbc.gridx = 1;
		gbc.gridy = 1;
		this.add(this.label_prenom, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 2;
		this.add(this.label_adresse, gbc);
		gbc.gridx = 1;
		gbc.gridy = 2;
		this.add(this.textArea_adresse, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 3;
		this.add(this.label_telephone, gbc);
		gbc.gridx = 1;
		gbc.gridy = 3;
		this.add(this.textArea_telephone, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 4;
		this.add(this.label_mail, gbc);
		gbc.gridx = 1;
		gbc.gridy = 4;
		this.add(this.textArea_mail, gbc);
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
	public JLabel getLabel_prenom() {
		return label_prenom;
	}
	public void setLabel_prenom() {
		this.label_prenom = new JLabel("Prénom : ");
	}
	public JTextArea getTextArea_prenom() {
		return textArea_prenom;
	}
	public void setTextArea_prenom(String prenom) {
		this.textArea_prenom = new JTextArea(prenom);
		Dimension d = this.textArea_prenom.getPreferredSize();
		d.width = 150;
		this.textArea_prenom.setPreferredSize(d);
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
