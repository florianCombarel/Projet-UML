package model.bien_immobilier;

import java.util.Date;

import model.personne.Personne;

public class Terrain extends BienImmobilier {
	
	private double surfaceArea;
	private double facadeLength;

	public Terrain(String adress, String exposition, double demandPrice, Date dateSellingDemand, Date dateDispo,
			Personne seller, double surfaceArea, double facadeLength) {
		super(adress, exposition, demandPrice, dateSellingDemand, dateDispo);
		// TODO Auto-generated constructor stub
		this.surfaceArea = surfaceArea;
		this.facadeLength = facadeLength;
	}

	public double getSurfaceArea() {
		return surfaceArea;
	}

	public void setSurfaceArea(double surfaceArea) {
		this.surfaceArea = surfaceArea;
	}

	public double getFacadeLength() {
		return facadeLength;
	}

	public void setFacadeLength(double facadeLength) {
		this.facadeLength = facadeLength;
	}

}
