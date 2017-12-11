package model.bien_immobilier;

import java.util.Date;

import model.personne.Personne;

public class Maison extends BienImmobilier {
	
	private double livingSurface;
	private int nbRoom;
	private int nbFloor;
	private String heatingSystem;

	public Maison(String adress, String exposition, double demandPrice, Date dateSellingDemand, Date dateDispo,
			Personne seller, double livingSurface, int nbRoom, int nbFloor, String heatingSystem) {
		super(adress, exposition, demandPrice, dateSellingDemand, dateDispo, seller);
		// TODO Auto-generated constructor stub
		this.livingSurface = livingSurface;
		this.nbRoom = nbRoom;
		this.nbFloor = nbFloor;
		this.heatingSystem = heatingSystem;
	}

	public double getLivingSurface() {
		return livingSurface;
	}

	public void setLivingSurface(double livingSurface) {
		this.livingSurface = livingSurface;
	}

	public int getNbRoom() {
		return nbRoom;
	}

	public void setNbRoom(int nbRoom) {
		this.nbRoom = nbRoom;
	}

	public int getNbFloor() {
		return nbFloor;
	}

	public void setNbFloor(int nbFloor) {
		this.nbFloor = nbFloor;
	}

	public String getHeatingSystem() {
		return heatingSystem;
	}

	public void setHeatingSystem(String heatingSystem) {
		this.heatingSystem = heatingSystem;
	}

}
