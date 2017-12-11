package model.bien_immobilier;

import java.util.Date;

import model.personne.Personne;

public class Appartement extends BienImmobilier {
	
	private int nbRoom;
	private int floor;
	private double monthlySubs;

	public Appartement(String adress, String exposition, double demandPrice, Date dateSellingDemand, Date dateDispo,
			Personne seller, int nbRoom, int floor, double monthlySubs) {
		super(adress, exposition, demandPrice, dateSellingDemand, dateDispo, seller);
		// TODO Auto-generated constructor stub
		this.nbRoom = nbRoom;
		this.floor = floor;
		this.monthlySubs = monthlySubs;
	}

	public int getNbRoom() {
		return nbRoom;
	}

	public void setNbRoom(int nbRoom) {
		this.nbRoom = nbRoom;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public double getMonthlySubs() {
		return monthlySubs;
	}

	public void setMonthlySubs(double monthlySubs) {
		this.monthlySubs = monthlySubs;
	}

}
