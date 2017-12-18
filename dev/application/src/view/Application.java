package view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

import model.Agence;
import view.panel_clients.JPanelClients;

public class Application extends JFrame {
	
	public static JMenuBar menuBar;
	public static JPanel panel_principal;
	public static JPanelClients panel_clients;
	public static Agence agence;
	
	public Application(Agence agence) {
		this.agence = agence;
		this.setTitle("Application Agence Immobilière");
		this.setSize(1000, 800);
		
		this.setMenuBar();
		this.setJMenuBar(menuBar);
		
		this.setPanel_principal();
		this.add(panel_principal);
		
		this.panel_clients = new JPanelClients(this.agence.getClients());
		this.add(panel_clients);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public void setMenuBar() {
		this.menuBar = new JMenuBar();
		this.menuBar.add(new JMenu("Clients"));
		this.menuBar.add(new JMenu("Biens Immobiliers"));
		this.menuBar.add(new JMenu("Ventes"));
		this.menuBar.add(new JMenu("Rendez-Vous"));
		this.menuBar.add(new JMenu("Statistiques"));
		this.menuBar.setVisible(true);
	}

	public JPanel getPanel_principal() {
		return panel_principal;
	}

	public void setPanel_principal() {
		this.panel_principal = new JPanel();
		this.panel_principal.setVisible(true);
		this.panel_principal.setBackground(Color.GREEN);
		
	}
	
	public Agence getAgenceCourante(){
		return this.agence;
	}
	
	public static void main(String[] args){
		Agence agence = new Agence("Timmo");
		Application fenPrincipale = new Application(agence);
	}
}
