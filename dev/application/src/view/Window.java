package view;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;

import view.panel_clients.PanelClients;

public class Window extends Frame {
	
	private MenuBar menuBar;
	private PanelClients panel_clients;
	
	public Window() {
		menuBar = generateMenuBar();
		this.setMenuBar(menuBar);
		panel_clients = new PanelClients();
		this.add(panel_clients);
		this.setSize(1000, 700);
		this.setVisible(true);
	}
	
	public MenuBar generateMenuBar() {
		MenuBar menuBar =  new MenuBar();
		menuBar.add(new Menu("Clients"));
		menuBar.add(new Menu("Biens Immobiliers"));
		menuBar.add(new Menu("Ventes"));
		menuBar.add(new Menu("Rendez-vous"));
		menuBar.add(new Menu("Statistiques"));
		menuBar.add(new Menu("Publicités"));
		return menuBar;
	}

}
