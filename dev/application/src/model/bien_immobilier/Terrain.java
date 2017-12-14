package model.bien_immobilier;

import java.util.Date;

import model.personne.Personne;

public class Terrain extends BienImmobilier {
	
	private double surfaceAuSol;
	private double longueurFacade;

	public Terrain(String adress, String exposition, double demandPrice, Date dateSellingDemand, Date dateDispo,
			Personne seller, double surfaceArea, double facadeLength) {
		super(adress, exposition, demandPrice, dateSellingDemand, dateDispo);
		// TODO Auto-generated constructor stub
		this.surfaceAuSol = surfaceArea;
		this.longueurFacade = facadeLength;
	}

	public double getSurfaceAuSol() {
		return surfaceAuSol;
	}

	public void setSurfaceAuSol(double surfaceAuSol) {
		this.surfaceAuSol = surfaceAuSol;
	}

	public double getLongueurFacade() {
		return longueurFacade;
	}

	public void setLongueurFacade(double longueurFacade) {
		this.longueurFacade = longueurFacade;
	}

}
