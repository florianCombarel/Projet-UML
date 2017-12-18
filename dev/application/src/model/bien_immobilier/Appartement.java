package model.bien_immobilier;

import java.util.Date;

import model.Mandat;
import model.personne.Personne;

public class Appartement extends BienImmobilier {
	
	private int nbPiece;
	private int etage;
	private double chargeMensuelle;

	public Appartement(String adress, String exposition, double demandPrice, Date dateSellingDemand, Date dateDispo, Mandat mandat, int nbRoom, int floor, double monthlySubs) {
		super(adress, exposition, demandPrice, dateSellingDemand, dateDispo, mandat);
		// TODO Auto-generated constructor stub
		this.nbPiece = nbRoom;
		this.etage = floor;
		this.chargeMensuelle = monthlySubs;
	}
	
	public int getNbPiece() {
		return nbPiece;
	}

	public void setNbPiece(int nbPiece) {
		this.nbPiece = nbPiece;
	}

	public int getEtage() {
		return etage;
	}

	public void setEtage(int etage) {
		this.etage = etage;
	}

	public double getChargeMensuelle() {
		return chargeMensuelle;
	}

	public void setChargeMensuelle(double chargeMensuelle) {
		this.chargeMensuelle = chargeMensuelle;
	}


}
